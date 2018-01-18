import gen.KalkulatorLiczbWymiernychBaseListener;
import gen.KalkulatorLiczbWymiernychParser;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.text.ParseException;

public class TreeCompilationListener extends KalkulatorLiczbWymiernychBaseListener {
    private final MethodVisitor _mv;
    private int _currentTreeDepth, _maxTreeDepth;

    public int getTreeDepth(){
        return this._maxTreeDepth;
    }

    public TreeCompilationListener(MethodVisitor mv) {
        this._mv = mv;
    }

    @Override
    public void enterLiczba(KalkulatorLiczbWymiernychParser.LiczbaContext ctx) {
        this._currentTreeDepth++;
        if (this._currentTreeDepth > this._maxTreeDepth)
            this._maxTreeDepth = this._currentTreeDepth;

        try {
            this._mv.visitLdcInsn(Test.parse(ctx.getText()));
        } catch (ParseException e) {
            throw new IllegalArgumentException("Number is not of the double type.");
        }
    }

    @Override
    public void enterWyrazenie(KalkulatorLiczbWymiernychParser.WyrazenieContext ctx) {
        this._currentTreeDepth = 0;
        this._maxTreeDepth = 0;
    }

    @Override
    public void exitFunkcja1(KalkulatorLiczbWymiernychParser.Funkcja1Context ctx) {
        switch (ctx.f1.getType()) {
            case KalkulatorLiczbWymiernychParser.WartoscBezwzgledna:
                this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "abs", "(DD)D", false);
                break;
            case KalkulatorLiczbWymiernychParser.Podloga:
                this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "floor", "(DD)D", false);
                break;
            case KalkulatorLiczbWymiernychParser.Sufit:
                this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "ceil", "(DD)D", false);
                break;
            case KalkulatorLiczbWymiernychParser.Zaokraglenie:
                this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "round", "(DD)D", false);
                break;
            case KalkulatorLiczbWymiernychParser.Negacja:
                this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "negateExact", "(DD)D", false);
                break;
            default:
                throw new IllegalArgumentException();
        }
        this._currentTreeDepth--;
    }

    @Override
    public void exitFunkcja2(KalkulatorLiczbWymiernychParser.Funkcja2Context ctx) {
        switch (ctx.f2.getType()) {
            case KalkulatorLiczbWymiernychParser.Max:
                this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "max", "(DD)D", false);
                break;
            case KalkulatorLiczbWymiernychParser.Min:
                this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "min", "(DD)D", false);
                break;
            default:
                throw new IllegalArgumentException();
        }
        this._currentTreeDepth--;
    }

    @Override
    public void exitWyrazenie(KalkulatorLiczbWymiernychParser.WyrazenieContext ctx) {
        if (ctx.getChild(1)!=null) {
            switch (((TerminalNodeImpl) ctx.getChild(1)).symbol.getType()) {
                case KalkulatorLiczbWymiernychParser.Dodawanie:
                    this._mv.visitInsn(Opcodes.DADD);
                    break;
                case KalkulatorLiczbWymiernychParser.Odejmowanie:
                    this._mv.visitInsn(Opcodes.DSUB);
                    break;
                case KalkulatorLiczbWymiernychParser.Mnozenie:
                    this._mv.visitInsn(Opcodes.DMUL);
                    break;
                case KalkulatorLiczbWymiernychParser.Dzielenie:
                    this._mv.visitInsn(Opcodes.DDIV);
                    break;
                case KalkulatorLiczbWymiernychParser.Kongruencja:
                    this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "floorDiv", "(DD)D", false);
                    break;
                case KalkulatorLiczbWymiernychParser.Modulo:
                    this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "mod", "(DD)D", false);
                    break;
                case KalkulatorLiczbWymiernychParser.Potega:
                    this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "pow", "(DD)D", false);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            this._currentTreeDepth--;
        }
    }

}
