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
		RULE_start_rule = 0, RULE_wyrazenie = 1, RULE_operacja1 = 2, RULE_liczba = 3, 
		RULE_potega = 4;
	public static final String[] ruleNames = {
		"start_rule", "wyrazenie", "operacja1", "liczba", "potega"
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
	public static class Start_ruleContext extends ParserRuleContext {
		public Start_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_rule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KalkulatorLiczbWymiernychVisitor ) return ((KalkulatorLiczbWymiernychVisitor<? extends T>)visitor).visitStart_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_ruleContext start_rule() throws RecognitionException {
		Start_ruleContext _localctx = new Start_ruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_wyrazenie, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
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
				setState(13);
				operacja1();
				}
				break;
			case LICZBA:
				{
				setState(14);
				liczba();
				}
				break;
			case T__0:
				{
				setState(15);
				match(T__0);
				setState(16);
				wyrazenie(0);
				setState(17);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(33);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new WyrazenieContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(21);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(22);
						match(Potega);
						}
						setState(23);
						wyrazenie(7);
						}
						break;
					case 2:
						{
						_localctx = new WyrazenieContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(24);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(25);
						_la = _input.LA(1);
						if ( !(_la==Mnozenie || _la==Dzielenie) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(26);
						wyrazenie(7);
						}
						break;
					case 3:
						{
						_localctx = new WyrazenieContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(27);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(28);
						_la = _input.LA(1);
						if ( !(_la==Modulo || _la==Kongruencja) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(29);
						wyrazenie(6);
						}
						break;
					case 4:
						{
						_localctx = new WyrazenieContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(30);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(31);
						_la = _input.LA(1);
						if ( !(_la==Dodawanie || _la==Odejmowanie) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(32);
						wyrazenie(5);
						}
						break;
					}
					} 
				}
				setState(37);
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
		public Token opm;
		public TerminalNode WartoscBezwzgledna() { return getToken(KalkulatorLiczbWymiernychParser.WartoscBezwzgledna, 0); }
		public TerminalNode Podloga() { return getToken(KalkulatorLiczbWymiernychParser.Podloga, 0); }
		public TerminalNode Sufit() { return getToken(KalkulatorLiczbWymiernychParser.Sufit, 0); }
		public TerminalNode Zaokraglenie() { return getToken(KalkulatorLiczbWymiernychParser.Zaokraglenie, 0); }
		public TerminalNode Negacja() { return getToken(KalkulatorLiczbWymiernychParser.Negacja, 0); }
		public TerminalNode Pierwiastek() { return getToken(KalkulatorLiczbWymiernychParser.Pierwiastek, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KalkulatorLiczbWymiernychVisitor ) return ((KalkulatorLiczbWymiernychVisitor<? extends T>)visitor).visitOperacja1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operacja1Context operacja1() throws RecognitionException {
		Operacja1Context _localctx = new Operacja1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_operacja1);
		int _la;
		try {
			setState(50);
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
				setState(38);
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
				setState(39);
				match(T__0);
				{
				setState(40);
				wyrazenie(0);
				}
				setState(41);
				match(T__1);
				}
				break;
			case Max:
			case Min:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				((Operacja1Context)_localctx).opm = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Max || _la==Min) ) {
					((Operacja1Context)_localctx).opm = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(44);
				match(T__0);
				setState(45);
				wyrazenie(0);
				setState(46);
				match(T__2);
				setState(47);
				wyrazenie(0);
				setState(48);
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
			setState(52);
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
			setState(54);
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
		case 1:
			return wyrazenie_sempred((WyrazenieContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean wyrazenie_sempred(WyrazenieContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27;\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\26"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3$\n\3\f\3\16\3"+
		"\'\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\65\n\4\3\5"+
		"\3\5\3\6\3\6\3\6\2\3\4\7\2\4\6\b\n\2\7\3\2\b\t\4\2\n\n\20\20\3\2\6\7\4"+
		"\2\13\17\22\22\3\2\23\24\2<\2\f\3\2\2\2\4\25\3\2\2\2\6\64\3\2\2\2\b\66"+
		"\3\2\2\2\n8\3\2\2\2\f\r\3\2\2\2\r\3\3\2\2\2\16\17\b\3\1\2\17\26\5\6\4"+
		"\2\20\26\5\b\5\2\21\22\7\3\2\2\22\23\5\4\3\2\23\24\7\4\2\2\24\26\3\2\2"+
		"\2\25\16\3\2\2\2\25\20\3\2\2\2\25\21\3\2\2\2\26%\3\2\2\2\27\30\f\t\2\2"+
		"\30\31\7\21\2\2\31$\5\4\3\t\32\33\f\b\2\2\33\34\t\2\2\2\34$\5\4\3\t\35"+
		"\36\f\7\2\2\36\37\t\3\2\2\37$\5\4\3\b !\f\6\2\2!\"\t\4\2\2\"$\5\4\3\7"+
		"#\27\3\2\2\2#\32\3\2\2\2#\35\3\2\2\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&"+
		"\3\2\2\2&\5\3\2\2\2\'%\3\2\2\2()\t\5\2\2)*\7\3\2\2*+\5\4\3\2+,\7\4\2\2"+
		",\65\3\2\2\2-.\t\6\2\2./\7\3\2\2/\60\5\4\3\2\60\61\7\5\2\2\61\62\5\4\3"+
		"\2\62\63\7\4\2\2\63\65\3\2\2\2\64(\3\2\2\2\64-\3\2\2\2\65\7\3\2\2\2\66"+
		"\67\7\25\2\2\67\t\3\2\2\289\7\27\2\29\13\3\2\2\2\6\25#%\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}