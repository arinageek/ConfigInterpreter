// Generated from myLang.g4 by ANTLR 4.0

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myLangLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, COMMENT=8, LINE_COMMENT=9, 
		LCURLY=10, LBRACK=11, STRING=12, NUMBER=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'null'", "'true'", "')'", "';'", "'='", "'}'", "'false'", "COMMENT", 
		"LINE_COMMENT", "'{'", "'('", "STRING", "NUMBER", "WS"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "COMMENT", "LINE_COMMENT", 
		"LCURLY", "LBRACK", "STRING", "ESC", "UNICODE", "HEX", "NUMBER", "INT", 
		"EXP", "WS"
	};


	public myLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "myLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 7: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 8: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 18: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\20\u00a1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\7\tF\n\t\f\t\16\tI\13\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\7\nT\n\n\f\n\16\nW\13\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\7\rb\n\r\f\r\16\re\13\r\3\r\3\r\3\16\3\16\3\16\5\16l\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\21\5\21w\n\21\3\21\3\21\3\21\3\21\5\21"+
		"}\n\21\3\21\5\21\u0080\n\21\3\21\3\21\3\21\3\21\5\21\u0086\n\21\3\21\5"+
		"\21\u0089\n\21\3\22\3\22\3\22\7\22\u008e\n\22\f\22\16\22\u0091\13\22\5"+
		"\22\u0093\n\22\3\23\3\23\5\23\u0097\n\23\3\23\3\23\3\24\6\24\u009c\n\24"+
		"\r\24\16\24\u009d\3\24\3\24\3G\25\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1"+
		"\17\t\1\21\n\2\23\13\3\25\f\1\27\r\1\31\16\1\33\2\1\35\2\1\37\2\1!\17"+
		"\1#\2\1%\2\1\'\20\4\3\2\t\4\f\f\17\17\4$$^^\n$$\61\61^^ddhhppttvv\5\62"+
		";CHch\4GGgg\4--//\5\13\f\17\17\"\"\u00aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2!\3\2\2\2\2\'\3"+
		"\2\2\2\3)\3\2\2\2\5.\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r"+
		"9\3\2\2\2\17;\3\2\2\2\21A\3\2\2\2\23O\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2"+
		"\31^\3\2\2\2\33h\3\2\2\2\35m\3\2\2\2\37s\3\2\2\2!\u0088\3\2\2\2#\u0092"+
		"\3\2\2\2%\u0094\3\2\2\2\'\u009b\3\2\2\2)*\7p\2\2*+\7w\2\2+,\7n\2\2,-\7"+
		"n\2\2-\4\3\2\2\2./\7v\2\2/\60\7t\2\2\60\61\7w\2\2\61\62\7g\2\2\62\6\3"+
		"\2\2\2\63\64\7+\2\2\64\b\3\2\2\2\65\66\7=\2\2\66\n\3\2\2\2\678\7?\2\2"+
		"8\f\3\2\2\29:\7\177\2\2:\16\3\2\2\2;<\7h\2\2<=\7c\2\2=>\7n\2\2>?\7u\2"+
		"\2?@\7g\2\2@\20\3\2\2\2AB\7\61\2\2BC\7,\2\2CG\3\2\2\2DF\13\2\2\2ED\3\2"+
		"\2\2FI\3\2\2\2GH\3\2\2\2GE\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7,\2\2KL\7\61"+
		"\2\2LM\3\2\2\2MN\b\t\2\2N\22\3\2\2\2OP\7\61\2\2PQ\7\61\2\2QU\3\2\2\2R"+
		"T\n\2\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2"+
		"XY\b\n\3\2Y\24\3\2\2\2Z[\7}\2\2[\26\3\2\2\2\\]\7*\2\2]\30\3\2\2\2^c\7"+
		"$\2\2_b\5\33\16\2`b\n\3\2\2a_\3\2\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd"+
		"\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7$\2\2g\32\3\2\2\2hk\7^\2\2il\t\4\2\2j"+
		"l\5\35\17\2ki\3\2\2\2kj\3\2\2\2l\34\3\2\2\2mn\7w\2\2no\5\37\20\2op\5\37"+
		"\20\2pq\5\37\20\2qr\5\37\20\2r\36\3\2\2\2st\t\5\2\2t \3\2\2\2uw\7/\2\2"+
		"vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\5#\22\2yz\7\60\2\2z|\5#\22\2{}\5%\23"+
		"\2|{\3\2\2\2|}\3\2\2\2}\u0089\3\2\2\2~\u0080\7/\2\2\177~\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\5#\22\2\u0082\u0083\5%\23\2\u0083"+
		"\u0089\3\2\2\2\u0084\u0086\7/\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0089\5#\22\2\u0088v\3\2\2\2\u0088\177"+
		"\3\2\2\2\u0088\u0085\3\2\2\2\u0089\"\3\2\2\2\u008a\u0093\7\62\2\2\u008b"+
		"\u008f\4\63;\2\u008c\u008e\4\62;\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008b\3\2\2\2\u0093$\3\2\2\2"+
		"\u0094\u0096\t\6\2\2\u0095\u0097\t\7\2\2\u0096\u0095\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\5#\22\2\u0099&\3\2\2\2\u009a"+
		"\u009c\t\b\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\24\4\2\u00a0"+
		"(\3\2\2\2\21\2GUackv|\177\u0085\u0088\u008f\u0092\u0096\u009d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}