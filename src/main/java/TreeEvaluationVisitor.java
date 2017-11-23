import gen.KalkulatorLiczbWymiernychBaseVisitor;
import gen.KalkulatorLiczbWymiernychParser;

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
        return 0;
    }

    @Override
    public String visitLiczba(KalkulatorLiczbWymiernychParser.LiczbaContext ctx) {
        String[] tokens = String.valueOf(ctx.getChild(0)).split("/");
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
    public String visitOperacja1(KalkulatorLiczbWymiernychParser.Operacja1Context ctx) {
        String[] tokens = String.valueOf(visit(ctx.wyrazenie(0))).split("/");
        int licznik = Integer.parseInt(tokens[0]);
        int mianownik = Integer.parseInt(tokens[1]);
        switch (ctx.op.getType()) {
//                case gramatykaParser.Pierwiastek:
//                    result = Math.sqrt(Double.valueOf(String.valueOf(visitChildren(ctx))));
//                    out += result;
//                    break;
            case KalkulatorLiczbWymiernychParser.WartoscBezwzgledna:
                licznik = Math.abs(licznik);
                mianownik = Math.abs(mianownik);
                break;
            case KalkulatorLiczbWymiernychParser.Podloga:
                licznik = licznik / mianownik;
                mianownik = 1;
                break;
            case KalkulatorLiczbWymiernychParser.Sufit:
                //TODO sufit
                licznik = (licznik / mianownik) + 1;
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
        }
        return licznik + "/" + mianownik;
    }

    @Override
    public Object visitWyrazenie(KalkulatorLiczbWymiernychParser.WyrazenieContext ctx) {
        if (ctx.Dodawanie() != null || ctx.Odejmowanie() != null || ctx.Mnozenie() != null || ctx.Dzielenie() != null) {
            String[] tokens1 = String.valueOf(visit(ctx.wyrazenie(0))).split("/");
            String[] tokens2 = String.valueOf(visit(ctx.wyrazenie(1))).split("/");
            int licznik = 0;
            int mianownik = 0;
            int licznik1 = Integer.parseInt(tokens1[0]);
            int mianownik1 = Integer.parseInt(tokens1[1]);
            int licznik2 = Integer.parseInt(tokens2[0]);
            int mianownik2 = Integer.parseInt(tokens2[1]);
            if (ctx.Dodawanie() != null) {
                licznik = licznik1 * mianownik2 + licznik2 * mianownik1;
                mianownik = mianownik1 * mianownik2;
            }
            if (ctx.Odejmowanie() != null) {
                licznik = licznik1 * mianownik2 - licznik2 * mianownik1;
                mianownik = mianownik1 * mianownik2;
            }

            if (ctx.Mnozenie() != null) {
                licznik = licznik1 * licznik2;
                mianownik = mianownik1 * mianownik2;
            }
            if (ctx.Dzielenie() != null) {
                licznik = licznik1 * mianownik2;
                mianownik = mianownik1 * licznik2;
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


    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        if (aggregate == null) {
            return nextResult;
        }
        if (nextResult == null) return aggregate;
        return aggregate + "\n" + nextResult;
    }
}
