package gen;// Generated from C:/Users/Jaroslaw/Desktop/com.bitplan.antlr-master/jfkanaliza/src/main/java\KalkulatorLiczbWymiernych.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link KalkulatorLiczbWymiernychVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class KalkulatorLiczbWymiernychBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements KalkulatorLiczbWymiernychVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWyrazenie(KalkulatorLiczbWymiernychParser.WyrazenieContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOperacja1(KalkulatorLiczbWymiernychParser.Operacja1Context ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLiczba(KalkulatorLiczbWymiernychParser.LiczbaContext ctx) { return visitChildren(ctx); }
}