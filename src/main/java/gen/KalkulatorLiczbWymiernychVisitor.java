// Generated from E:/GoogleDysk/Studia WAT/5Semestr/JFK/com.bitplan.antlr-master/jfkanaliza/src/main\KalkulatorLiczbWymiernych.g4 by ANTLR 4.7
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KalkulatorLiczbWymiernychParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KalkulatorLiczbWymiernychVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KalkulatorLiczbWymiernychParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenie(KalkulatorLiczbWymiernychParser.WyrazenieContext ctx);
	/**
	 * Visit a parse tree produced by {@link KalkulatorLiczbWymiernychParser#funkcja1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunkcja1(KalkulatorLiczbWymiernychParser.Funkcja1Context ctx);
	/**
	 * Visit a parse tree produced by {@link KalkulatorLiczbWymiernychParser#funkcja2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunkcja2(KalkulatorLiczbWymiernychParser.Funkcja2Context ctx);
	/**
	 * Visit a parse tree produced by {@link KalkulatorLiczbWymiernychParser#liczba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiczba(KalkulatorLiczbWymiernychParser.LiczbaContext ctx);
	/**
	 * Visit a parse tree produced by {@link KalkulatorLiczbWymiernychParser#potega}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotega(KalkulatorLiczbWymiernychParser.PotegaContext ctx);
}