package gen;// Generated from C:/Users/Jaroslaw/Desktop/com.bitplan.antlr-master/jfkanaliza/src/main/java\KalkulatorLiczbWymiernych.g4 by ANTLR 4.7
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
		LICZBA=19, WS=20, Licznik=21, Ulamek=22;
	public static final int
		RULE_wyrazenie = 0, RULE_operacja1 = 1, RULE_liczba = 2;
	public static final String[] ruleNames = {
		"wyrazenie", "operacja1", "liczba"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'+'", "'-'", "'*'", "':'", "'%'", "'abs'", 
		"'p'", "'s'", "'z'", "'~'", "'k'", "'^'", "'sqrt'", "'max'", "'min'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "Dodawanie", "Odejmowanie", "Mnozenie", "Dzielenie", 
		"Modulo", "WartoscBezwzgledna", "Podloga", "Sufit", "Zaokraglenie", "Negacja", 
		"Kongruencja", "Potega", "Pierwiastek", "Max", "Min", "LICZBA", "WS", 
		"Licznik", "Ulamek"
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
		public Operacja1Context operacja1() {
			return getRuleContext(Operacja1Context.class,0);
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
		public TerminalNode Mnozenie() { return getToken(KalkulatorLiczbWymiernychParser.Mnozenie, 0); }
		public TerminalNode Dzielenie() { return getToken(KalkulatorLiczbWymiernychParser.Dzielenie, 0); }
		public TerminalNode Modulo() { return getToken(KalkulatorLiczbWymiernychParser.Modulo, 0); }
		public TerminalNode Kongruencja() { return getToken(KalkulatorLiczbWymiernychParser.Kongruencja, 0); }
		public TerminalNode Dodawanie() { return getToken(KalkulatorLiczbWymiernychParser.Dodawanie, 0); }
		public TerminalNode Odejmowanie() { return getToken(KalkulatorLiczbWymiernychParser.Odejmowanie, 0); }
		public TerminalNode Licznik() { return getToken(KalkulatorLiczbWymiernychParser.Licznik, 0); }
		public TerminalNode Potega() { return getToken(KalkulatorLiczbWymiernychParser.Potega, 0); }
		public WyrazenieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wyrazenie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KalkulatorLiczbWymiernychListener ) ((KalkulatorLiczbWymiernychListener)listener).enterWyrazenie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KalkulatorLiczbWymiernychListener ) ((KalkulatorLiczbWymiernychListener)listener).exitWyrazenie(this);
		}
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
			setState(13);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WartoscBezwzgledna:
			case Podloga:
			case Sufit:
			case Zaokraglenie:
			case Negacja:
			case Pierwiastek:
			case Max:
			case Min:
				{
				setState(7);
				operacja1();
				}
				break;
			case LICZBA:
				{
				setState(8);
				liczba();
				}
				break;
			case T__0:
				{
				setState(9);
				match(T__0);
				setState(10);
				wyrazenie(0);
				setState(11);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(27);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new WyrazenieContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(15);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(16);
						_la = _input.LA(1);
						if ( !(_la==Mnozenie || _la==Dzielenie) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(17);
						wyrazenie(7);
						}
						break;
					case 2:
						{
						_localctx = new WyrazenieContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(18);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(19);
						_la = _input.LA(1);
						if ( !(_la==Modulo || _la==Kongruencja) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(20);
						wyrazenie(6);
						}
						break;
					case 3:
						{
						_localctx = new WyrazenieContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(21);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(22);
						_la = _input.LA(1);
						if ( !(_la==Dodawanie || _la==Odejmowanie) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(23);
						wyrazenie(5);
						}
						break;
					case 4:
						{
						_localctx = new WyrazenieContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(24);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(25);
						match(Potega);
						}
						setState(26);
						match(Licznik);
						}
						break;
					}
					} 
				}
				setState(31);
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

	public static class Operacja1Context extends ParserRuleContext {
		public Token op;
		public TerminalNode WartoscBezwzgledna() { return getToken(KalkulatorLiczbWymiernychParser.WartoscBezwzgledna, 0); }
		public TerminalNode Podloga() { return getToken(KalkulatorLiczbWymiernychParser.Podloga, 0); }
		public TerminalNode Sufit() { return getToken(KalkulatorLiczbWymiernychParser.Sufit, 0); }
		public TerminalNode Zaokraglenie() { return getToken(KalkulatorLiczbWymiernychParser.Zaokraglenie, 0); }
		public TerminalNode Negacja() { return getToken(KalkulatorLiczbWymiernychParser.Negacja, 0); }
		public TerminalNode Pierwiastek() { return getToken(KalkulatorLiczbWymiernychParser.Pierwiastek, 0); }
		public LiczbaContext liczba() {
			return getRuleContext(LiczbaContext.class,0);
		}
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public TerminalNode Max() { return getToken(KalkulatorLiczbWymiernychParser.Max, 0); }
		public TerminalNode Min() { return getToken(KalkulatorLiczbWymiernychParser.Min, 0); }
		public Operacja1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacja1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KalkulatorLiczbWymiernychListener ) ((KalkulatorLiczbWymiernychListener)listener).enterOperacja1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KalkulatorLiczbWymiernychListener ) ((KalkulatorLiczbWymiernychListener)listener).exitOperacja1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KalkulatorLiczbWymiernychVisitor ) return ((KalkulatorLiczbWymiernychVisitor<? extends T>)visitor).visitOperacja1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operacja1Context operacja1() throws RecognitionException {
		Operacja1Context _localctx = new Operacja1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_operacja1);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WartoscBezwzgledna:
			case Podloga:
			case Sufit:
			case Zaokraglenie:
			case Negacja:
			case Pierwiastek:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				((Operacja1Context)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WartoscBezwzgledna) | (1L << Podloga) | (1L << Sufit) | (1L << Zaokraglenie) | (1L << Negacja) | (1L << Pierwiastek))) != 0)) ) {
					((Operacja1Context)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(33);
				match(T__0);
				setState(36);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(34);
					liczba();
					}
					break;
				case 2:
					{
					setState(35);
					wyrazenie(0);
					}
					break;
				}
				setState(38);
				match(T__1);
				}
				break;
			case Max:
			case Min:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				_la = _input.LA(1);
				if ( !(_la==Max || _la==Min) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(41);
				match(T__0);
				setState(42);
				wyrazenie(0);
				setState(43);
				match(T__2);
				setState(44);
				wyrazenie(0);
				setState(45);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KalkulatorLiczbWymiernychListener ) ((KalkulatorLiczbWymiernychListener)listener).enterLiczba(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KalkulatorLiczbWymiernychListener ) ((KalkulatorLiczbWymiernychListener)listener).exitLiczba(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KalkulatorLiczbWymiernychVisitor ) return ((KalkulatorLiczbWymiernychVisitor<? extends T>)visitor).visitLiczba(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiczbaContext liczba() throws RecognitionException {
		LiczbaContext _localctx = new LiczbaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_liczba);
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
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\20\n\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3\3\3\3\3\3"+
		"\3\5\3\'\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3\4\3"+
		"\4\2\3\2\5\2\4\6\2\7\3\2\b\t\4\2\n\n\20\20\3\2\6\7\4\2\13\17\22\22\3\2"+
		"\23\24\2:\2\17\3\2\2\2\4\61\3\2\2\2\6\63\3\2\2\2\b\t\b\2\1\2\t\20\5\4"+
		"\3\2\n\20\5\6\4\2\13\f\7\3\2\2\f\r\5\2\2\2\r\16\7\4\2\2\16\20\3\2\2\2"+
		"\17\b\3\2\2\2\17\n\3\2\2\2\17\13\3\2\2\2\20\37\3\2\2\2\21\22\f\b\2\2\22"+
		"\23\t\2\2\2\23\36\5\2\2\t\24\25\f\7\2\2\25\26\t\3\2\2\26\36\5\2\2\b\27"+
		"\30\f\6\2\2\30\31\t\4\2\2\31\36\5\2\2\7\32\33\f\t\2\2\33\34\7\21\2\2\34"+
		"\36\7\27\2\2\35\21\3\2\2\2\35\24\3\2\2\2\35\27\3\2\2\2\35\32\3\2\2\2\36"+
		"!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\37\3\2\2\2\"#\t\5\2\2"+
		"#&\7\3\2\2$\'\5\6\4\2%\'\5\2\2\2&$\3\2\2\2&%\3\2\2\2\'(\3\2\2\2()\7\4"+
		"\2\2)\62\3\2\2\2*+\t\6\2\2+,\7\3\2\2,-\5\2\2\2-.\7\5\2\2./\5\2\2\2/\60"+
		"\7\4\2\2\60\62\3\2\2\2\61\"\3\2\2\2\61*\3\2\2\2\62\5\3\2\2\2\63\64\7\25"+
		"\2\2\64\7\3\2\2\2\7\17\35\37&\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}