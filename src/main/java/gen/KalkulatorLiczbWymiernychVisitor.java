package gen;// Generated from C:/Users/Jaroslaw/Desktop/com.bitplan.antlr-master/jfkanaliza/src/main/java\KalkulatorLiczbWymiernych.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link KalkulatorLiczbWymiernychParser#operacja1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacja1(KalkulatorLiczbWymiernychParser.Operacja1Context ctx);
	/**
	 * Visit a parse tree produced by {@link KalkulatorLiczbWymiernychParser#liczba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiczba(KalkulatorLiczbWymiernychParser.LiczbaContext ctx);
}