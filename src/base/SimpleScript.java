package base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SimpleScript {

    private HashMap<String, Integer> variables = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception {

        SimpleParser parser = new SimpleParser();
        SimpleScript script = new SimpleScript();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n>");
        while (true) {
            try {
                String line = reader.readLine().trim();
                if (line.equals("quit")) {
                    break;
                }

                if (line.endsWith(";")) {
                    ASTNode node = parser.parse(line);
                    Integer evaluate = script.evaluate(node, "");
                    System.out.println(evaluate);
                    System.out.print("\n>");   //提示符
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
//        ASTNode node = parser.parse("1+2+");
//        System.out.println(script.evaluate(node, ""));


    }


    private Integer evaluate(ASTNode node, String indent) throws Exception {
        Integer result = null;
        ASTNodeType type = node.getType();
        if (type != null) {
            switch (type) {
                case Programm:
                    for (ASTNode child : node.getChildren()) {
                        result = evaluate(child, indent);
                    }
                    break;
                case Additive:
                case Multiplicative:
                    String text = node.getText();
                    ASTNode left = node.getChildren().get(0);
                    ASTNode right = node.getChildren().get(1);
                    if (text.equals("+")) {
                        result = evaluate(left, "") + evaluate(right, "");
                    }
                    if (text.equals("-")) {
                        result = evaluate(left, "") - evaluate(right, "");
                    }
                    if (text.equals("*")) {
                        result = evaluate(left, "") * evaluate(right, "");
                    }
                    if (text.equals("/")) {
                        result = evaluate(left, "") / evaluate(right, "");
                    }
                    break;
                case IntLiteral:
                    result = Integer.parseInt(node.getText());
                    break;
                case Identifier:
                    String var = node.getText();
                    if (variables.containsKey(var)) {
                        result = variables.get(var);
                    } else {
                        System.out.println("不存在该变量" + var);
                    }
                    break;
                case IntDeclaration:
                    String var1 = node.getText();
                    if (node.getChildren() != null) {
                        if (node.getChildren().size() != 0) {
                            variables.put(var1, evaluate(node.getChildren().get(0), ""));
                        }else {
                            variables.put(var1, null);
                        }
                    }
                    break;
                case AssignmentStmt:
                    String var2 = node.getText();
                    if (node.getChildren() != null) {
                        evaluate(node.getChildren().get(0), "");
                        variables.put(var2, evaluate(node.getChildren().get(0), ""));
                    }
                    break;
            }
        }
        return result;
    }


}
