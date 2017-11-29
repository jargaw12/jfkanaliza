// Generated from E:/GoogleDysk/Studia WAT/5Semestr/JFK/com.bitplan.antlr-master/jfkanaliza/src/main\KalkulatorLiczbWymiernych.g4 by ANTLR 4.7
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KalkulatorLiczbWymiernychLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Dodawanie=4, Odejmowanie=5, Mnozenie=6, Dzielenie=7, 
		Modulo=8, WartoscBezwzgledna=9, Podloga=10, Sufit=11, Zaokraglenie=12, 
		Negacja=13, Kongruencja=14, Potega=15, Pierwiastek=16, Max=17, Min=18, 
		LICZBA=19, WS=20, Licznik=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "Dodawanie", "Odejmowanie", "Mnozenie", "Dzielenie", 
		"Modulo", "WartoscBezwzgledna", "Podloga", "Sufit", "Zaokraglenie", "Negacja", 
		"Kongruencja", "Potega", "Pierwiastek", "Max", "Min", "LICZBA", "WS", 
		"Licznik", "KRESKAULAMKOWA", "MIANOWNIK"
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


	public KalkulatorLiczbWymiernychLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KalkulatorLiczbWymiernych.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\5"+
		"\24a\n\24\3\24\3\24\3\24\3\24\3\24\5\24h\n\24\3\24\3\24\5\24l\n\24\3\25"+
		"\6\25o\n\25\r\25\16\25p\3\25\3\25\3\26\3\26\6\26w\n\26\r\26\16\26x\3\26"+
		"\7\26|\n\26\f\26\16\26\177\13\26\3\26\3\26\3\26\3\26\6\26\u0085\n\26\r"+
		"\26\16\26\u0086\3\26\7\26\u008a\n\26\f\26\16\26\u008d\13\26\3\26\5\26"+
		"\u0090\n\26\3\27\3\27\3\30\3\30\6\30\u0096\n\30\r\30\16\30\u0097\3\30"+
		"\7\30\u009b\n\30\f\30\16\30\u009e\13\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\2/\2\3\2\5\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\2\u00a8\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2"+
		"\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2"+
		"\2\2\23A\3\2\2\2\25E\3\2\2\2\27G\3\2\2\2\31I\3\2\2\2\33K\3\2\2\2\35M\3"+
		"\2\2\2\37O\3\2\2\2!Q\3\2\2\2#V\3\2\2\2%Z\3\2\2\2\'k\3\2\2\2)n\3\2\2\2"+
		"+\u008f\3\2\2\2-\u0091\3\2\2\2/\u0093\3\2\2\2\61\62\7*\2\2\62\4\3\2\2"+
		"\2\63\64\7+\2\2\64\6\3\2\2\2\65\66\7.\2\2\66\b\3\2\2\2\678\7-\2\28\n\3"+
		"\2\2\29:\7/\2\2:\f\3\2\2\2;<\7,\2\2<\16\3\2\2\2=>\7<\2\2>\20\3\2\2\2?"+
		"@\7\'\2\2@\22\3\2\2\2AB\7c\2\2BC\7d\2\2CD\7u\2\2D\24\3\2\2\2EF\7r\2\2"+
		"F\26\3\2\2\2GH\7u\2\2H\30\3\2\2\2IJ\7|\2\2J\32\3\2\2\2KL\7#\2\2L\34\3"+
		"\2\2\2MN\7m\2\2N\36\3\2\2\2OP\7`\2\2P \3\2\2\2QR\7u\2\2RS\7s\2\2ST\7t"+
		"\2\2TU\7v\2\2U\"\3\2\2\2VW\7o\2\2WX\7c\2\2XY\7z\2\2Y$\3\2\2\2Z[\7o\2\2"+
		"[\\\7k\2\2\\]\7p\2\2]&\3\2\2\2^`\5+\26\2_a\5/\30\2`_\3\2\2\2`a\3\2\2\2"+
		"al\3\2\2\2bc\7*\2\2cd\7/\2\2de\3\2\2\2eg\5+\26\2fh\5/\30\2gf\3\2\2\2g"+
		"h\3\2\2\2hi\3\2\2\2ij\7+\2\2jl\3\2\2\2k^\3\2\2\2kb\3\2\2\2l(\3\2\2\2m"+
		"o\t\2\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\b\25\2\2"+
		"s*\3\2\2\2t\u0090\7\62\2\2uw\t\3\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3"+
		"\2\2\2y}\3\2\2\2z|\t\4\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2"+
		"~\u0090\3\2\2\2\177}\3\2\2\2\u0080\u0081\7*\2\2\u0081\u0082\7/\2\2\u0082"+
		"\u0084\3\2\2\2\u0083\u0085\t\3\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008b\3\2\2\2\u0088"+
		"\u008a\t\4\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0090\7+\2\2\u008ft\3\2\2\2\u008fv\3\2\2\2\u008f\u0080\3\2\2\2\u0090"+
		",\3\2\2\2\u0091\u0092\7\61\2\2\u0092.\3\2\2\2\u0093\u0095\5-\27\2\u0094"+
		"\u0096\t\3\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u009c\3\2\2\2\u0099\u009b\t\4\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\60\3\2\2\2\u009e\u009c\3\2\2\2\16\2`gkpx}\u0086\u008b\u008f"+
		"\u0097\u009c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}