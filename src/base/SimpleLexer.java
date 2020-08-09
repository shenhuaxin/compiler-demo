package base;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 一个简单的手写的词法分析器。
 * 能够为后面的简单计算器、简单脚本语言产生Token。
 */
public class SimpleLexer {

    public static void main(String args[]) {
        SimpleLexer lexer = new SimpleLexer();

        String script = "age >= 45;";
        SimpleTokenReader tokenReader = lexer.tokenize(script);
        for (Token token : tokenReader.tokens) {
            System.out.println(token.getType() + " " + token.getText());
        }
        System.out.println("parse :" + script);

    }

    private StringBuilder tokenText = null;

    private List<Token> tokens = null;

    private SimpleToken token = null;


    private SimpleTokenReader tokenize(String code) {
        tokens = new ArrayList<>();
        CharArrayReader charArrayReader = new CharArrayReader(code.toCharArray());

        tokenText = new StringBuilder();
        token = new SimpleToken();

        DfaState state = DfaState.Initial;

        int ich = 0;
        char ch = 0;
        try {
            while ((ich = charArrayReader.read()) != -1) {
                ch = (char) ich;
                switch (state) {
                    case Initial:
                        state = initToken(ch);
                        break;
                    case Id:
                        if (isDigit(ch) || isAlpha(ch)){
                            tokenText.append(ch);
                        }else {
                            state = initToken(ch);
                        }
                        break;
                    case IntLiteral:
                        if (isDigit(ch)) {
                            tokenText.append(ch);
                        }else {
                            state = initToken(ch);
                        }
                        break;
                    case GE:
                    case Assignment:
                        state = initToken(ch);
                        break;
                    case GT:
                        if (ch == '=') {
                            tokenText.append(ch);
                            state = DfaState.GE;
                        }else {
                            state = initToken(ch);
                        }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (tokenText.length() > 0) {
            finishToken();
        }

        return new SimpleTokenReader(tokens);
    }

    private DfaState initToken(char ch) {
        finishToken();

        DfaState initial = DfaState.Initial;
        if (isAlpha(ch)) {
            if (ch == 'i') {
                initial = DfaState.Id_int1;
            } else if (ch == 'd') {
                initial = DfaState.Id_double1;
            } else {
                initial = DfaState.Id;
            }
            token.type = TokenType.Identifier;
        } else if (isDigit(ch)) {
            initial = DfaState.IntLiteral;
            token.type = TokenType.IntLiteral;
        } else if (ch == '>') {
            initial = DfaState.GT;
            token.type = TokenType.GT;
        } else if (ch == '+') {
            initial = DfaState.Plus;
            token.type = TokenType.Plus;
        } else if (ch == '-') {
            initial = DfaState.Minus;
            token.type = TokenType.Minus;
        } else if (ch == '*') {
            initial = DfaState.Star;
            token.type = TokenType.Star;
        } else if (ch == '/') {
            initial = DfaState.Slash;
            token.type = TokenType.Slash;
        } else if (ch == '=') {
            initial = DfaState.Assignment;
            token.type = TokenType.Assignment;
        } else if (ch == '(') {
            initial = DfaState.LeftParen;
            token.type = TokenType.LeftParen;
        } else if (ch == ')') {
            initial = DfaState.RightParen;
            token.type = TokenType.RightParen;
        } else if (ch == ';') {
            initial = DfaState.SemiColon;
            token.type = TokenType.SemiColon;
        } else {
            initial = DfaState.Initial;
        }
        if (!initial.equals(DfaState.Initial)) {
            tokenText.append(ch);
        }
        return initial;
    }


    private void finishToken() {
        if (this.tokenText.length() > 0) {
            this.token.text = this.tokenText.toString(); // token 构建完成
            this.tokens.add(token);

            this.tokenText = new StringBuilder();
            this.token = new SimpleToken();
        }
    }


    //是否是字母
    private boolean isAlpha(int ch) {
        return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z';
    }

    //是否是数字
    private boolean isDigit(int ch) {
        return ch >= '0' && ch <= '9';
    }

    //是否是空白字符
    private boolean isBlank(int ch) {
        return ch == ' ' || ch == '\t' || ch == '\n';
    }


    class SimpleTokenReader implements TokenReader {

        List<Token> tokens = null;

        int pos = 0;

        public SimpleTokenReader(List<Token> tokens) {
            this.tokens = tokens;
        }

        @Override
        public Token read() {
            if (pos < tokens.size())
                return tokens.get(pos++);
            return null;
        }

        @Override
        public Token peek() {
            if (pos < tokens.size())
                return tokens.get(pos);
            return null;
        }

        @Override
        public void unread() {
            if (pos > 0)
                pos--;
        }

        @Override
        public int getPosition() {
            return pos;
        }

        @Override
        public void setPosition(int position) {
            pos = position;
        }
    }


    class SimpleToken implements Token {

        private TokenType type = null;

        private String text = null;

        @Override
        public TokenType getType() {
            return type;
        }

        @Override
        public String getText() {
            return text;
        }
    }

    private enum DfaState {
        Initial,

        If, Id_if1, Id_if2,
        Else, Id_else1, Id_else2, Id_else3, Id_else4,
        Int, Id_int1, Id_int2, Id_int3,
        Double, Id_double1, Id_double2, Id_double3, Id_double4, Id_double5, Id_double6,

        Id, GT, GE,

        Assignment,

        Plus, Minus, Star, Slash,

        SemiColon,
        LeftParen,
        RightParen,

        IntLiteral
    }


}