import gen.KalkulatorLiczbWymiernychBaseVisitor;
import gen.KalkulatorLiczbWymiernychParser;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

public class TreeEvaluationVisitor extends KalkulatorLiczbWymiernychBaseVisitor {

    public static int nwd(int a, int b) {
        if (a != b) {
            a = Math.abs(a);
            b = Math.abs(b);
            do {
                if (a > b) {
                    a = a - b;
                }
                if (a < b) {
                    b = b - a;
                }
            }
            while (a != b);
            return a;
        }
        return a;
    }

    @Override
    public String visitLiczba(KalkulatorLiczbWymiernychParser.LiczbaContext ctx) {
        String[] tokens = String.valueOf(ctx.getChild(0)).replace("(", "").replace(")", "").split("/");
        int licznik = 0;
        int mianownik = 0;
        if (tokens.length == 1) {
            licznik = Integer.parseInt(tokens[0]);
            mianownik = 1;
        } else if (tokens.length == 2) {
            licznik = Integer.parseInt(tokens[0]);
            mianownik = Integer.parseInt(tokens[1]);
            int nwd = nwd(licznik, mianownik);
            if (nwd != 0) {
                licznik = licznik / nwd;
                mianownik = mianownik / nwd;
            }
        }
        return licznik + "/" + mianownik;
    }

    @Override
    public Object visitFunkcja1(KalkulatorLiczbWymiernychParser.Funkcja1Context ctx) {
        String[] tokens = String.valueOf(visit(ctx.wyrazenie())).split("/");
        int licznik = Integer.parseInt(tokens[0]);
        int mianownik = Integer.parseInt(tokens[1]);
        switch (ctx.f1.getType()) {
            case KalkulatorLiczbWymiernychParser.WartoscBezwzgledna:
                licznik = Math.abs(licznik);
                mianownik = Math.abs(mianownik);
                break;
            case KalkulatorLiczbWymiernychParser.Podloga:
                if (licznik < 0) {
                    licznik = (licznik / mianownik) - 1;
                } else
                    licznik = licznik / mianownik;
                mianownik = 1;
                break;
            case KalkulatorLiczbWymiernychParser.Sufit:
                double ulamek = ((double) licznik / (double) mianownik);
                licznik = (int) Math.ceil(ulamek);
                mianownik = 1;
                break;
            case KalkulatorLiczbWymiernychParser.Zaokraglenie:
                licznik = Math.round(licznik / mianownik);
                mianownik = 1;
                break;
            case KalkulatorLiczbWymiernychParser.Negacja:
                if (mianownik < 0) mianownik = -mianownik;
                else licznik = -licznik;
                break;
            default:
                throw new IllegalArgumentException();
        }
        return licznik + "/" + mianownik;
    }

    @Override
    public Object visitFunkcja2(KalkulatorLiczbWymiernychParser.Funkcja2Context ctx) {
        int licznik = 0;
        int mianownik = 0;
        String[] tokens = String.valueOf(visit(ctx.wyrazenie(0))).split("/");
        int licznik1 = Integer.parseInt(tokens[0]);
        int mianownik1 = Integer.parseInt(tokens[1]);
        String[] tokens2 = String.valueOf(visit(ctx.wyrazenie(1))).split("/");
        int licznik2 = Integer.parseInt(tokens2[0]);
        int mianownik2 = Integer.parseInt(tokens2[1]);
        switch (ctx.f2.getType()) {
            case KalkulatorLiczbWymiernychParser.Max:
                if (((double) licznik1 / (double) mianownik1) < ((double) licznik2 / (double) mianownik2)) {
                    licznik = licznik2;
                    mianownik = mianownik2;
                } else {
                    licznik = licznik1;
                    mianownik = mianownik1;
                }
                break;
            case KalkulatorLiczbWymiernychParser.Min:
                if (((double) licznik1 / (double) mianownik1) > ((double) licznik2 / (double) mianownik2)) {
                    licznik = licznik2;
                    mianownik = mianownik2;
                } else {
                    licznik = licznik1;
                    mianownik = mianownik1;
                }
                break;
            default:
                throw new IllegalArgumentException();
        }
        return licznik + "/" + mianownik;
    }

    @Override
    public Object visitWyrazenie(KalkulatorLiczbWymiernychParser.WyrazenieContext ctx) {
        if (ctx.getChild(1) instanceof TerminalNodeImpl) {
            String[] tokens1 = String.valueOf(visit(ctx.wyrazenie(0))).split("/");
            String[] tokens2 = String.valueOf(visit(ctx.wyrazenie(1))).split("/");
            int licznik = 0;
            int mianownik = 0;
            int licznik1 = Integer.parseInt(tokens1[0]);
            int mianownik1 = Integer.parseInt(tokens1[1]);
            int licznik2 = Integer.parseInt(tokens2[0]);
            int mianownik2 = Integer.parseInt(tokens2[1]);

            switch (((TerminalNodeImpl) ctx.getChild(1)).symbol.getType()) {
                case KalkulatorLiczbWymiernychParser.Dodawanie:
                    licznik = licznik1 * mianownik2 + licznik2 * mianownik1;
                    mianownik = mianownik1 * mianownik2;
                    break;
                case KalkulatorLiczbWymiernychParser.Odejmowanie:
                    licznik = licznik1 * mianownik2 - licznik2 * mianownik1;
                    mianownik = mianownik1 * mianownik2;
                    break;
                case KalkulatorLiczbWymiernychParser.Mnozenie:
                    licznik = licznik1 * licznik2;
                    mianownik = mianownik1 * mianownik2;
                    break;
                case KalkulatorLiczbWymiernychParser.Dzielenie:
                    licznik = licznik1 * mianownik2;
                    mianownik = mianownik1 * licznik2;
                    break;
                case KalkulatorLiczbWymiernychParser.Kongruencja:
                    licznik = (int) (licznik1 * mianownik2) / (mianownik1 * licznik2);
                    if (licznik1 * licznik2 < 0) licznik--;
                    mianownik = 1;
                    break;
                case KalkulatorLiczbWymiernychParser.Modulo:
                    int k = (int) (licznik1 * mianownik2) / (mianownik1 * licznik2);
                    if (licznik1 * licznik2 < 0) k--;
                    licznik = licznik1 * mianownik2 - k * licznik2 * mianownik1;
                    mianownik = mianownik1 * mianownik2;
                    break;
                case KalkulatorLiczbWymiernychParser.Potega:
                    licznik = (int) Math.pow(licznik1, licznik2);
                    mianownik = (int) Math.pow(mianownik1, licznik2);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            int nwd = nwd(licznik, mianownik);
            if (nwd != 0) {
                licznik = licznik / nwd;
                mianownik = mianownik / nwd;
            }
            return licznik + "/" + mianownik;
        }
        return visitChildren(ctx);
    }
}
