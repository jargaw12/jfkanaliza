// Generated from E:/GoogleDysk/Studia WAT/5Semestr/JFK/com.bitplan.antlr-master/jfkanaliza/src/main\KalkulatorLiczbWymiernych.g4 by ANTLR 4.7
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KalkulatorLiczbWymiernychParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Dodawanie=4, Odejmowanie=5, Mnozenie=6, Dzielenie=7, 
		Modulo=8, WartoscBezwzgledna=9, Podloga=10, Sufit=11, Zaokraglenie=12, 
		Negacja=13, Kongruencja=14, Potega=15, Pierwiastek=16, Max=17, Min=18, 
		LICZBA=19, WS=20, Licznik=21;
	public static final int
		RULE_wyrazenie = 0, RULE_funkcja1 = 1, RULE_funkcja2 = 2, RULE_liczba = 3, 
		RULE_potega = 4;
	public static final String[] ruleNames = {
		"wyrazenie", "funkcja1", "funkcja2", "liczba", "potega"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'+'", "'-'", "'*'", "':'", "'%'", "'abs'", 
		"'p'", "'s'", "'z'", "'!'", "'k'", "'^'", "'sqrt'", "'max'", "'min'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "Dodawanie", "Odejmowanie", "Mnozenie", "Dzielenie", 
		"Modulo", "WartoscBezwzgledna", "Podloga", "Sufit", "Zaokraglenie", "Negacja", 
		"Kongruencja", "Potega", "Pierwiastek", "Max", "Min", "LICZBA", "WS", 
		"Licznik"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "KalkulatorLiczbWymiernych.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KalkulatorLiczbWymiernychParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class WyrazenieContext extends ParserRuleContext {
		public Funkcja1Context funkcja1() {
			return getRuleContext(Funkcja1Context.class,0);
		}
		public Funkcja2Context funkcja2() {
			return getRuleContext(Funkcja2Context.class,0);
		}
		public LiczbaContext liczba() {
			return getRuleContext(LiczbaContext.class,0);
		}
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public TerminalNode Potega() { return getToken(KalkulatorLiczbWymiernychParser.Potega, 0); }
		public TerminalNode Mnozenie() { return getToken(KalkulatorLiczbWymiernychParser.Mnozenie, 0); }
		public TerminalNode Dzielenie() { return getToken(KalkulatorLiczbWymiernychParser.Dzielenie, 0); }
		public TerminalNode Modulo() { return getToken(KalkulatorLiczbWymiernychParser.Modulo, 0); }
		public TerminalNode Kongruencja() { return getToken(KalkulatorLiczbWymiernychParser.Kongruencja, 0); }
		public TerminalNode Dodawanie() { return getToken(KalkulatorLiczbWymiernychParser.Dodawanie, 0); }
		public TerminalNode Odejmowanie() { return getToken(KalkulatorLiczbWymiernychParser.Odejmowanie, 0); }
		public WyrazenieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wyrazenie; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KalkulatorLiczbWymiernychVisitor ) return ((KalkulatorLiczbWymiernychVisitor<? extends T>)visitor).visitWyrazenie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WyrazenieContext wyrazenie() throws RecognitionException {
		return wyrazenie(0);
	}

	private WyrazenieContext wyrazenie(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		WyrazenieContext _localctx = new WyrazenieContext(_ctx, _parentState);
		WyrazenieContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_wyrazenie, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WartoscBezwzgledna:
			case Podloga:
			case Sufit:
			case Zaokraglenie:
			case Negacja:
			case Pierwiastek:
				{
				setState(11);
				funkcja1();
				}
				break;
			case Max:
			case Min:
				{
				setState(12);
				funkcja2();
				}
				break;
			case LICZBA:
				{
				setState(13);
				liczba();
				}
				break;
			case T__0:
				{
				setState(14);
				match(T__0);
				setState(15);
				wyrazenie(0);
				setState(16);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(32);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new WyrazenieContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(20);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						{
						setState(21);
						match(Potega);
						}
						setState(22);
						wyrazenie(8);
						}
						break;
					case 2:
						{
						_localctx = new WyrazenieContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(23);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(24);
						_la = _input.LA(1);
						if ( !(_la==Mnozenie || _la==Dzielenie) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(25);
						wyrazenie(8);
						}
						break;
					case 3:
						{
						_localctx = new WyrazenieContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(26);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(27);
						_la = _input.LA(1);
						if ( !(_la==Modulo || _la==Kongruencja) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(28);
						wyrazenie(7);
						}
						break;
					case 4:
						{
						_localctx = new WyrazenieContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(29);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(30);
						_la = _input.LA(1);
						if ( !(_la==Dodawanie || _la==Odejmowanie) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(31);
						wyrazenie(6);
						}
						break;
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Funkcja1Context extends ParserRuleContext {
		public Token f1;
		public TerminalNode WartoscBezwzgledna() { return getToken(KalkulatorLiczbWymiernychParser.WartoscBezwzgledna, 0); }
		public TerminalNode Podloga() { return getToken(KalkulatorLiczbWymiernychParser.Podloga, 0); }
		public TerminalNode Sufit() { return getToken(KalkulatorLiczbWymiernychParser.Sufit, 0); }
		public TerminalNode Zaokraglenie() { return getToken(KalkulatorLiczbWymiernychParser.Zaokraglenie, 0); }
		public TerminalNode Negacja() { return getToken(KalkulatorLiczbWymiernychParser.Negacja, 0); }
		public TerminalNode Pierwiastek() { return getToken(KalkulatorLiczbWymiernychParser.Pierwiastek, 0); }
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public Funkcja1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funkcja1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KalkulatorLiczbWymiernychVisitor ) return ((KalkulatorLiczbWymiernychVisitor<? extends T>)visitor).visitFunkcja1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funkcja1Context funkcja1() throws RecognitionException {
		Funkcja1Context _localctx = new Funkcja1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_funkcja1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			((Funkcja1Context)_localctx).f1 = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WartoscBezwzgledna) | (1L << Podloga) | (1L << Sufit) | (1L << Zaokraglenie) | (1L << Negacja) | (1L << Pierwiastek))) != 0)) ) {
				((Funkcja1Context)_localctx).f1 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(38);
			match(T__0);
			{
			setState(39);
			wyrazenie(0);
			}
			setState(40);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funkcja2Context extends ParserRuleContext {
		public Token f2;
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public TerminalNode Max() { return getToken(KalkulatorLiczbWymiernychParser.Max, 0); }
		public TerminalNode Min() { return getToken(KalkulatorLiczbWymiernychParser.Min, 0); }
		public Funkcja2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funkcja2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KalkulatorLiczbWymiernychVisitor ) return ((KalkulatorLiczbWymiernychVisitor<? extends T>)visitor).visitFunkcja2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funkcja2Context funkcja2() throws RecognitionException {
		Funkcja2Context _localctx = new Funkcja2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_funkcja2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			((Funkcja2Context)_localctx).f2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Max || _la==Min) ) {
				((Funkcja2Context)_localctx).f2 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(43);
			match(T__0);
			setState(44);
			wyrazenie(0);
			setState(45);
			match(T__2);
			setState(46);
			wyrazenie(0);
			setState(47);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiczbaContext extends ParserRuleContext {
		public TerminalNode LICZBA() { return getToken(KalkulatorLiczbWymiernychParser.LICZBA, 0); }
		public LiczbaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liczba; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KalkulatorLiczbWymiernychVisitor ) return ((KalkulatorLiczbWymiernychVisitor<? extends T>)visitor).visitLiczba(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiczbaContext liczba() throws RecognitionException {
		LiczbaContext _localctx = new LiczbaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_liczba);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(LICZBA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PotegaContext extends ParserRuleContext {
		public TerminalNode Licznik() { return getToken(KalkulatorLiczbWymiernychParser.Licznik, 0); }
		public PotegaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potega; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KalkulatorLiczbWymiernychVisitor ) return ((KalkulatorLiczbWymiernychVisitor<? extends T>)visitor).visitPotega(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotegaContext potega() throws RecognitionException {
		PotegaContext _localctx = new PotegaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_potega);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(Licznik);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return wyrazenie_sempred((WyrazenieContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean wyrazenie_sempred(WyrazenieContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\278\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\25\n\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2#\n\2\f\2\16\2&\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\2\3\2\7\2\4\6\b\n\2\7\3\2\b\t\4\2\n\n\20\20\3\2\6\7\4\2\13\17\22\22\3"+
		"\2\23\24\29\2\24\3\2\2\2\4\'\3\2\2\2\6,\3\2\2\2\b\63\3\2\2\2\n\65\3\2"+
		"\2\2\f\r\b\2\1\2\r\25\5\4\3\2\16\25\5\6\4\2\17\25\5\b\5\2\20\21\7\3\2"+
		"\2\21\22\5\2\2\2\22\23\7\4\2\2\23\25\3\2\2\2\24\f\3\2\2\2\24\16\3\2\2"+
		"\2\24\17\3\2\2\2\24\20\3\2\2\2\25$\3\2\2\2\26\27\f\n\2\2\27\30\7\21\2"+
		"\2\30#\5\2\2\n\31\32\f\t\2\2\32\33\t\2\2\2\33#\5\2\2\n\34\35\f\b\2\2\35"+
		"\36\t\3\2\2\36#\5\2\2\t\37 \f\7\2\2 !\t\4\2\2!#\5\2\2\b\"\26\3\2\2\2\""+
		"\31\3\2\2\2\"\34\3\2\2\2\"\37\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%"+
		"\3\3\2\2\2&$\3\2\2\2\'(\t\5\2\2()\7\3\2\2)*\5\2\2\2*+\7\4\2\2+\5\3\2\2"+
		"\2,-\t\6\2\2-.\7\3\2\2./\5\2\2\2/\60\7\5\2\2\60\61\5\2\2\2\61\62\7\4\2"+
		"\2\62\7\3\2\2\2\63\64\7\25\2\2\64\t\3\2\2\2\65\66\7\27\2\2\66\13\3\2\2"+
		"\2\5\24\"$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}