import gen.KalkulatorLiczbWymiernychLexer;
import gen.KalkulatorLiczbWymiernychParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Scanner;

import static java.lang.System.out;

public class Test {
    private static final DecimalFormat _format = new DecimalFormat();

    static {
        DecimalFormatSymbols _symbols = new DecimalFormatSymbols();
        _symbols.setDecimalSeparator('/');
        _symbols.setGroupingSeparator(Character.MIN_VALUE);
        _format.setDecimalFormatSymbols(_symbols);
    }

    static double parse(String text) throws ParseException {
        return _format.parse(text).doubleValue();
    }
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
            System.out.println("Wynik = " + visitor.visit(tree).toString());
        } else {
            System.out.println("Ciąg wejściowy jest niepoprawny");
            System.out.println("Liczba błędów syntaktycznych: " + errors);

        }
        System.out.println(tree.toStringTree(parser));

        // Synteza
        if (args.length > 0)
            compile(tree, args[0]);
        else
            compile(tree);
    }

    private static void compile(ParseTree tree) {
        compile(tree, "target\\classes\\CompilationClass.class");
    }

    private static void compile(ParseTree tree, String classPath) {
        if (null == tree)
            throw new NullPointerException("parse tree cannot be null.");

        try {
            Path path = Paths.get(classPath);
            byte[] bytes = Files.readAllBytes(path);
            ClassReader cr = new ClassReader(bytes);
            ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_MAXS); // no need to calculate visitMaxs(int maxStack, int maxLocals) arguments
            //ClassWriter cw = new ClassWriter(cr, 0);
            cr.accept(new CompilationClassVisitor(cw, tree), 0);
            bytes = cw.toByteArray();
            Files.write(path, bytes);
        } catch (IOException e) {
            out.println("CompilationClass.class not found.");
        }


    }
}
