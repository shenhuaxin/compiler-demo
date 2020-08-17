package antrltest;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class PlayScript {



    public static void main(String[] args) {
        String script = "int age = 2 + 3";
        //String script = "2+6*3";

        //词法分析
        PlayScriptLexer lexer = new PlayScriptLexer(CharStreams.fromString(script));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlayScriptParser parser = new PlayScriptParser(tokens);

        ParseTree tree = parser.additiveExpression();
        System.out.println(tree.toStringTree(parser));
    }
}
