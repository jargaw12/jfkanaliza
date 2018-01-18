import gen.KalkulatorLiczbWymiernychBaseVisitor;
import gen.KalkulatorLiczbWymiernychParser;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

public class TreeEvaluationVisitor extends KalkulatorLiczbWymiernychBaseVisitor {
    Liczba liczba=new Liczba();

    private static Liczba nwd(int a, int b) {
        int licznik=a;
        int mianownik=b;
        if (a != b) {
            if (a != 0) {
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
                return  new Liczba(licznik/a,mianownik/a);
            }
            else return new Liczba(licznik,mianownik);
        }
        return new Liczba(licznik/a,mianownik/a);
    }

    @Override
    public Liczba visitLiczba(KalkulatorLiczbWymiernychParser.LiczbaContext ctx) {
        String[] tokens = String.valueOf(ctx.getChild(0)).replace("(", "").replace(")", "").split("/");
        int licznik = 0;
        int mianownik = 0;
        if (tokens.length == 1) {
            licznik = Integer.parseInt(tokens[0]);
            mianownik = 1;
        } else if (tokens.length == 2) {
            licznik = Integer.parseInt(tokens[0]);
            mianownik = Integer.parseInt(tokens[1]);
        }
        return nwd(licznik, mianownik);
    }

    @Override
    public Object visitFunkcja1(KalkulatorLiczbWymiernychParser.Funkcja1Context ctx) {
        //String[] tokens = String.valueOf(visit(ctx.wyrazenie())).split("/");
        liczba=(Liczba) visit(ctx.wyrazenie());
        //int licznik = Integer.parseInt(tokens[0]);
        //int mianownik = Integer.parseInt(tokens[1]);
        switch (ctx.f1.getType()) {
            case KalkulatorLiczbWymiernychParser.WartoscBezwzgledna:
                liczba.licznik = Math.abs(liczba.licznik);
                liczba.mianownik = Math.abs(liczba.mianownik);
                break;
            case KalkulatorLiczbWymiernychParser.Podloga:
                if (liczba.licznik < 0) {
                    liczba.licznik = (liczba.licznik / liczba.mianownik) - 1;
                } else
                    liczba.licznik = liczba.licznik / liczba.mianownik;
                liczba.mianownik = 1;
                break;
            case KalkulatorLiczbWymiernychParser.Sufit:
                double ulamek = ((double) liczba.licznik / (double) liczba.mianownik);
                liczba.licznik = (int) Math.ceil(ulamek);
                liczba.mianownik = 1;
                break;
            case KalkulatorLiczbWymiernychParser.Zaokraglenie:
                Math.round((double)liczba.licznik / (double)liczba.mianownik);
                liczba.licznik = (int) Math.round((double)liczba.licznik / (double)liczba.mianownik);
                liczba.mianownik = 1;
                break;
            case KalkulatorLiczbWymiernychParser.Negacja:
                if (liczba.mianownik < 0) liczba.mianownik = -liczba.mianownik;
                else liczba.licznik = -liczba.licznik;
                break;
            default:
                throw new IllegalArgumentException();
        }
        return liczba;
    }

    @Override
    public Object visitFunkcja2(KalkulatorLiczbWymiernychParser.Funkcja2Context ctx) {
        //int licznik = 0;
        //int mianownik = 0;
        //String[] tokens = String.valueOf(visit(ctx.wyrazenie(0))).split("/");
        //int licznik1 = Integer.parseInt(tokens[0]);
        //int mianownik1 = Integer.parseInt(tokens[1]);
        //String[] tokens2 = String.valueOf(visit(ctx.wyrazenie(1))).split("/");
        //int licznik2 = Integer.parseInt(tokens2[0]);
        //int mianownik2 = Integer.parseInt(tokens2[1]);
        Liczba liczba1=(Liczba) visit(ctx.wyrazenie(0));
        Liczba liczba2=(Liczba) visit(ctx.wyrazenie(1));
        switch (ctx.f2.getType()) {
            case KalkulatorLiczbWymiernychParser.Max:
                if (((double) liczba1.licznik / (double) liczba1.mianownik) < ((double) liczba2.licznik / (double) liczba2.mianownik)) {
                    liczba.zmien(liczba2.licznik,liczba2.mianownik);
                } else {
                    liczba.zmien(liczba1.licznik,liczba1.mianownik);
                }
                break;
            case KalkulatorLiczbWymiernychParser.Min:
                if (((double) liczba1.licznik / (double) liczba1.mianownik) > ((double) liczba2.licznik / (double) liczba2.mianownik)) {
                    liczba.zmien(liczba2.licznik,liczba2.mianownik);
                } else {
                    liczba.zmien(liczba1.licznik,liczba1.mianownik);
                }
                break;
            default:
                throw new IllegalArgumentException();
        }
        return liczba;
    }

    @Override
    public Object visitWyrazenie(KalkulatorLiczbWymiernychParser.WyrazenieContext ctx) {
        if (ctx.getChild(1) instanceof TerminalNodeImpl) {
//            String[] tokens1 = String.valueOf(visit(ctx.wyrazenie(0))).split("/");
//            String[] tokens2 = String.valueOf(visit(ctx.wyrazenie(1))).split("/");
//            int licznik = 0;
//            int mianownik = 0;
//            int licznik1 = Integer.parseInt(tokens1[0]);
//            int mianownik1 = Integer.parseInt(tokens1[1]);
//            int licznik2 = Integer.parseInt(tokens2[0]);
//            int mianownik2 = Integer.parseInt(tokens2[1]);
            Liczba liczba1=(Liczba) visit(ctx.wyrazenie(0));
            Liczba liczba2=(Liczba) visit(ctx.wyrazenie(1));

            switch (((TerminalNodeImpl) ctx.getChild(1)).symbol.getType()) {
                case KalkulatorLiczbWymiernychParser.Dodawanie:
                    liczba.licznik = liczba1.licznik * liczba2.mianownik + liczba2.licznik * liczba1.mianownik;
                    liczba.mianownik = liczba1.mianownik * liczba2.mianownik;
                    break;
                case KalkulatorLiczbWymiernychParser.Odejmowanie:
                    liczba.licznik = liczba1.licznik * liczba2.mianownik - liczba2.licznik * liczba1.mianownik;
                    liczba.mianownik = liczba1.mianownik * liczba2.mianownik;
                    break;
                case KalkulatorLiczbWymiernychParser.Mnozenie:
                    liczba.licznik = liczba1.licznik * liczba2.licznik;
                    liczba.mianownik = liczba1.mianownik * liczba2.mianownik;
                    break;
                case KalkulatorLiczbWymiernychParser.Dzielenie:
                    liczba.licznik = liczba1.licznik * liczba2.mianownik;
                    liczba.mianownik = liczba1.mianownik * liczba2.licznik;
                    break;
                case KalkulatorLiczbWymiernychParser.Kongruencja:
                    liczba.licznik = (int) (liczba1.licznik * liczba2.mianownik) / (liczba1.mianownik * liczba2.licznik);
                    if (liczba1.licznik * liczba2.licznik < 0) liczba.licznik--;
                    liczba.mianownik = 1;
                    break;
                case KalkulatorLiczbWymiernychParser.Modulo:
                    int k = (int) (liczba1.licznik * liczba2.mianownik) / (liczba1.mianownik * liczba2.licznik);
                    if (liczba1.licznik * liczba2.licznik < 0) k--;
                    liczba.licznik = liczba1.licznik * liczba2.mianownik - k * liczba2.licznik * liczba1.mianownik;
                    liczba.mianownik = liczba1.mianownik * liczba2.mianownik;
                    break;
                case KalkulatorLiczbWymiernychParser.Potega:
                    liczba.licznik = (int) Math.pow(liczba1.licznik, liczba2.licznik);
                    liczba.mianownik = (int) Math.pow(liczba1.mianownik, liczba2.licznik);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            return nwd(liczba.licznik, liczba.mianownik);
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
