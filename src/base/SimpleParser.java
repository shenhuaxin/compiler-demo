package base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleParser {


    public static void main(String[] args) throws Exception {
        SimpleParser simpleParser = new SimpleParser();
        ASTNode parse = simpleParser.parse("1 + 3;");

        System.out.println(parse);
    }


    /**
     * 解析脚本
     * @param script
     * @return
     * @throws Exception
     */
    public ASTNode parse(String script) throws Exception {
        SimpleLexer lexer = new SimpleLexer();
        TokenReader tokens = lexer.tokenize(script);
        ASTNode rootNode = prog(tokens);
        return rootNode;
    }

    /**
     * AST的根节点，解析的入口。
     * @return
     * @throws Exception
     */
    private SimpleASTNode prog(TokenReader tokens) throws Exception {
        SimpleASTNode node = new SimpleASTNode(ASTNodeType.Programm, "pwc");

        while (tokens.peek() != null) {
            SimpleASTNode child = intDeclare(tokens);

            if (child == null) {
                child = expressionStatement(tokens);
            }

            if (child == null) {
                child = assignmentStatement(tokens);
            }

            if (child != null) {
                node.addChild(child);
            } else {
                throw new Exception("unknown statement");
            }
        }

        return node;
    }


    private SimpleASTNode intDeclare(TokenReader tokens) throws Exception {
        SimpleASTNode node = null;
        Token token = tokens.peek();
        if (token != null && token.getType() == TokenType.Int) {
            token = tokens.read();
            token = tokens.peek();
            if (token != null && token.getType() == TokenType.Identifier) {
                token = tokens.read();
                node = new SimpleASTNode(ASTNodeType.IntDeclaration, token.getText());
                token = tokens.peek();
                if (token != null && token.getType() == TokenType.Assignment) {
                    token = tokens.read();
                    SimpleASTNode child = additive(tokens);
                    if (child == null) {
                        throw new RuntimeException("等于号后没有表达式");
                    }
                    node.addChild(child);
                }
            }else {
                throw new RuntimeException("int 后没有变量");
            }
            token = tokens.peek();
            if (token != null && token.getType() == TokenType.SemiColon) {
                tokens.read();
            }else {
                throw new RuntimeException("没有分号结束符");
            }
        }

        return node;
    }

    private SimpleASTNode assignmentStatement(TokenReader tokens) throws Exception {
        SimpleASTNode node = null;
        Token token = tokens.peek();
        if (token != null && token.getType() == TokenType.Identifier) {
            tokens.read();
            node = new SimpleASTNode(ASTNodeType.AssignmentStmt, token.getText());
            token = tokens.peek();
            if (token != null && token.getType() == TokenType.Assignment) {
                tokens.read();
            }else {
                throw new RuntimeException("变量后没有赋值符号");
            }
            SimpleASTNode additive = additive(tokens);
            if (additive != null) {
                node.addChild(additive);
            }else {
                throw new RuntimeException("没有加法表达式");
            }

            token = tokens.peek();
            if (token != null && token.getType() == TokenType.SemiColon) {
                tokens.read();
            }else {
                throw new RuntimeException("没有分号");
            }
        }
        return node;
    }

    private SimpleASTNode expressionStatement(TokenReader tokens) throws Exception {
        int position = tokens.getPosition();
        SimpleASTNode node = additive(tokens);
        if (node != null) {
            Token token = tokens.peek();
            if (token != null && token.getType() == TokenType.SemiColon) {
                tokens.read();
            }else {
                node = null;
                tokens.setPosition(position);
            }
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
     * 一个简单的AST节点。
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

    /**
     * 打印输出AST的树状结构
     * @param node
     * @param indent 缩进字符，由tab组成，每一级多一个tab
     */
    void dumpAST(ASTNode node, String indent) {
        System.out.println(indent + node.getType() + " " + node.getText());
        for (ASTNode child : node.getChildren()) {
            dumpAST(child, indent + "\t");
        }
    }
}
