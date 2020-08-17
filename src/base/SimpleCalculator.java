package base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * add -> mul | add + mul
 * mul -> pri | mul * pri
 * pri -> Id | Num | (add)
 * <p>
 * additive -> multiplicative | multiplicative + additive
 * multiplicative -> primary | primary * multiplicative
 */
public class SimpleCalculator {


    public static void main(String[] args) throws Exception {
        SimpleCalculator calculator = new SimpleCalculator();

        ASTNode parse = calculator.parse("2+3*5-6/2");

        calculator.dump(parse, "");
        System.out.println(calculator.evaluate(parse, ""));
    }


    public int evaluate(ASTNode root, String prefix) {
        int result = 0;
        switch (root.getType()) {
            case Programm:
                for (ASTNode child : root.getChildren()) {
                    result = evaluate(child, prefix);
                }
                break;
            case Multiplicative:
            case Additive:
                ASTNode left = root.getChildren().get(0);
                ASTNode right = root.getChildren().get(1);
                int leftValue = evaluate(left, prefix + '\t');
                int rightValue = evaluate(right, prefix + '\t');
                switch (root.getText()) {
                    case "+":
                        result = leftValue + rightValue;
                        break;
                    case "-":
                        result = leftValue - rightValue;
                        break;
                    case "*":
                        result = leftValue * rightValue;
                        break;
                    case "/":
                        result = leftValue / rightValue;
                        break;
                }
                break;
            case IntLiteral:
                result = Integer.parseInt(root.getText());
                break;
        }
        System.out.println(prefix + "result: " + result);
        return result;
    }

    public void dump(ASTNode root, String prefix) {
        System.out.println(prefix + root.getType() + " " + root.getText());
        for (ASTNode child : root.getChildren()) {
            dump(child, prefix + '\t');
        }
    }

    public ASTNode parse(String code) throws Exception {
        SimpleLexer lexer = new SimpleLexer();
        TokenReader tokens = lexer.tokenize(code);

        return prog(tokens);
    }

    /**
     * 语法解析：根节点
     *
     * @return
     * @throws Exception
     */
    private SimpleASTNode prog(TokenReader tokens) throws Exception {
        SimpleASTNode node = new SimpleASTNode(ASTNodeType.Programm, "Calculator");

        SimpleASTNode child = additive(tokens);

        if (child != null) {
            node.addChild(child);
        }
        return node;
    }


    private SimpleASTNode additive(TokenReader tokens) throws Exception {
        SimpleASTNode multiplicative = multiplicative(tokens);
        SimpleASTNode node = multiplicative;

        Token token = tokens.peek();
        if (multiplicative != null && token != null) {
            if (token.getType() == TokenType.Plus || token.getType() == TokenType.Minus) {
                tokens.read();
                SimpleASTNode additive = additive(tokens);
                if (additive != null) {
                    node = new SimpleASTNode(ASTNodeType.Additive, token.getText());
                    node.addChild(multiplicative);
                    node.addChild(additive);
                } else {
                    throw new RuntimeException("加法不完整");
                }
            }
        }
        return node;
    }

    private SimpleASTNode multiplicative(TokenReader tokens) throws Exception {
        SimpleASTNode primary = primary(tokens);

        SimpleASTNode node = primary; // primary
        Token token = tokens.peek();
        if (primary != null && token != null) {
            if (token.getType() == TokenType.Star || token.getType() == TokenType.Slash) {
                tokens.read();
                SimpleASTNode multiplicative = multiplicative(tokens);
                if (multiplicative != null) {
                    node = new SimpleASTNode(ASTNodeType.Multiplicative, token.getText());
                    node.addChild(primary);
                    node.addChild(multiplicative);
                } else {
                    throw new RuntimeException("缺少乘法表达式");
                }
            }
        }
        return node;
    }

    /**
     * 语法解析：基础表达式
     */
    private SimpleASTNode primary(TokenReader tokens) throws Exception {
        SimpleASTNode node = null;
        Token token = tokens.peek();
        if (token != null) {
            if (token.getType() == TokenType.IntLiteral) {
                token = tokens.read();
                node = new SimpleASTNode(ASTNodeType.IntLiteral, token.getText());
            } else if (token.getType() == TokenType.Identifier) {
                token = tokens.read();
                node = new SimpleASTNode(ASTNodeType.Identifier, token.getText());
            } else if (token.getType() == TokenType.LeftParen) {
                tokens.read();
                node = additive(tokens);
                if (node != null) {
                    token = tokens.peek();
                    if (token != null && token.getType() == TokenType.RightParen) {
                        tokens.read();
                    } else {
                        throw new RuntimeException("未找到匹配的有括号");
                    }
                } else {
                    throw new RuntimeException("空括号");
                }
            }
        }
        return node;  //这个方法也做了AST的简化，就是不用构造一个primary节点，直接返回子节点。因为它只有一个子节点。
    }


    /**
     * 一个简单的AST节点的实现。
     * 属性包括：类型、文本值、父节点、子节点。
     */
    private class SimpleASTNode implements ASTNode {
        SimpleASTNode parent = null;
        List<ASTNode> children = new ArrayList<ASTNode>();
        List<ASTNode> readonlyChildren = Collections.unmodifiableList(children);
        ASTNodeType nodeType = null;
        String text = null;


        public SimpleASTNode(ASTNodeType nodeType, String text) {
            this.nodeType = nodeType;
            this.text = text;
        }

        @Override
        public ASTNode getParent() {
            return parent;
        }

        @Override
        public List<ASTNode> getChildren() {
            return readonlyChildren;
        }

        @Override
        public ASTNodeType getType() {
            return nodeType;
        }

        @Override
        public String getText() {
            return text;
        }

        public void addChild(SimpleASTNode child) {
            children.add(child);
            child.parent = this;
        }

    }

}
