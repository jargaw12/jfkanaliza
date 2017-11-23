import gen.KalkulatorLiczbWymiernychLexer;
import gen.KalkulatorLiczbWymiernychParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        String input;
        System.out.println("Wprowadź ciąg wejściowy: ");
        try (Scanner reader = new Scanner(System.in)) {
            input = reader.nextLine();
        }

        CharStream in = CharStreams.fromString(input);
        KalkulatorLiczbWymiernychLexer lexer = new KalkulatorLiczbWymiernychLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        KalkulatorLiczbWymiernychParser parser = new KalkulatorLiczbWymiernychParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.wyrazenie();

        int errors = parser.getNumberOfSyntaxErrors();
        if (errors == 0) {
            System.out.println("Ciąg wejściowy jest poprawny");
            TreeEvaluationVisitor visitor = new TreeEvaluationVisitor();
            //double result = (double) visitor.visit(tree);
            System.out.println("Result = " + visitor.visit(tree));
        } else {
            System.out.println("Ciąg wejściowy jest niepoprawny");
            System.out.println("Liczba błędów: " + errors);

        }
        System.out.println(tree.toStringTree(parser));
    }
}
