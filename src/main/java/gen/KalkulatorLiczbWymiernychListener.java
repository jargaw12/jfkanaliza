// Generated from E:/GoogleDysk/Studia WAT/5Semestr/JFK/com.bitplan.antlr-master/jfkanaliza/src/main\KalkulatorLiczbWymiernych.g4 by ANTLR 4.7
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KalkulatorLiczbWymiernychParser}.
 */
public interface KalkulatorLiczbWymiernychListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KalkulatorLiczbWymiernychParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenie(KalkulatorLiczbWymiernychParser.WyrazenieContext ctx);
	/**
	 * Exit a parse tree produced by {@link KalkulatorLiczbWymiernychParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenie(KalkulatorLiczbWymiernychParser.WyrazenieContext ctx);
	/**
	 * Enter a parse tree produced by {@link KalkulatorLiczbWymiernychParser#funkcja1}.
	 * @param ctx the parse tree
	 */
	void enterFunkcja1(KalkulatorLiczbWymiernychParser.Funkcja1Context ctx);
	/**
	 * Exit a parse tree produced by {@link KalkulatorLiczbWymiernychParser#funkcja1}.
	 * @param ctx the parse tree
	 */
	void exitFunkcja1(KalkulatorLiczbWymiernychParser.Funkcja1Context ctx);
	/**
	 * Enter a parse tree produced by {@link KalkulatorLiczbWymiernychParser#funkcja2}.
	 * @param ctx the parse tree
	 */
	void enterFunkcja2(KalkulatorLiczbWymiernychParser.Funkcja2Context ctx);
	/**
	 * Exit a parse tree produced by {@link KalkulatorLiczbWymiernychParser#funkcja2}.
	 * @param ctx the parse tree
	 */
	void exitFunkcja2(KalkulatorLiczbWymiernychParser.Funkcja2Context ctx);
	/**
	 * Enter a parse tree produced by {@link KalkulatorLiczbWymiernychParser#liczba}.
	 * @param ctx the parse tree
	 */
	void enterLiczba(KalkulatorLiczbWymiernychParser.LiczbaContext ctx);
	/**
	 * Exit a parse tree produced by {@link KalkulatorLiczbWymiernychParser#liczba}.
	 * @param ctx the parse tree
	 */
	void exitLiczba(KalkulatorLiczbWymiernychParser.LiczbaContext ctx);
}