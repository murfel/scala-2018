// Generated from /Users/murfel/scala-2018/src/main/antlr/Exp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, Number=16, 
		WS=17;
	public static final int
		RULE_eval = 0, RULE_precedence15 = 1, RULE_precedence14 = 2, RULE_precedence10 = 3, 
		RULE_precedence9 = 4, RULE_precedence6 = 5, RULE_precedence5 = 6, RULE_atomExp = 7;
	public static final String[] ruleNames = {
		"eval", "precedence15", "precedence14", "precedence10", "precedence9", 
		"precedence6", "precedence5", "atomExp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "Number", "WS"
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
	public String getGrammarFileName() { return "Exp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EvalContext extends ParserRuleContext {
		public int value;
		public Precedence15Context exp;
		public Precedence15Context precedence15() {
			return getRuleContext(Precedence15Context.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitEval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitEval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((EvalContext)_localctx).exp = precedence15();
			((EvalContext)_localctx).value =  ((EvalContext)_localctx).exp.value;System.out.println("kekEval");
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

	public static class Precedence15Context extends ParserRuleContext {
		public int value;
		public Precedence14Context o1;
		public Precedence14Context o2;
		public List<Precedence14Context> precedence14() {
			return getRuleContexts(Precedence14Context.class);
		}
		public Precedence14Context precedence14(int i) {
			return getRuleContext(Precedence14Context.class,i);
		}
		public Precedence15Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence15; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterPrecedence15(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitPrecedence15(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitPrecedence15(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence15Context precedence15() throws RecognitionException {
		Precedence15Context _localctx = new Precedence15Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_precedence15);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			((Precedence15Context)_localctx).o1 = precedence14();
			((Precedence15Context)_localctx).value =  ((Precedence15Context)_localctx).o1.value;System.out.println("kek15");
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(21);
				match(T__0);
				setState(22);
				((Precedence15Context)_localctx).o2 = precedence14();
				((Precedence15Context)_localctx).value =  (((((Precedence15Context)_localctx).o1.value != 0) || (((Precedence15Context)_localctx).o2.value != 0))) ? 1 : 0;
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Precedence14Context extends ParserRuleContext {
		public int value;
		public Precedence10Context o1;
		public Precedence10Context o2;
		public List<Precedence10Context> precedence10() {
			return getRuleContexts(Precedence10Context.class);
		}
		public Precedence10Context precedence10(int i) {
			return getRuleContext(Precedence10Context.class,i);
		}
		public Precedence14Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence14; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterPrecedence14(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitPrecedence14(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitPrecedence14(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence14Context precedence14() throws RecognitionException {
		Precedence14Context _localctx = new Precedence14Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_precedence14);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((Precedence14Context)_localctx).o1 = precedence10();
			((Precedence14Context)_localctx).value =  ((Precedence14Context)_localctx).o1.value;System.out.println("kek14");
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(32);
				match(T__1);
				setState(33);
				((Precedence14Context)_localctx).o2 = precedence10();
				((Precedence14Context)_localctx).value =  (((((Precedence14Context)_localctx).o1.value != 0) && (((Precedence14Context)_localctx).o2.value != 0))) ? 1 : 0;
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Precedence10Context extends ParserRuleContext {
		public int value;
		public Precedence9Context o1;
		public Precedence9Context o2;
		public List<Precedence9Context> precedence9() {
			return getRuleContexts(Precedence9Context.class);
		}
		public Precedence9Context precedence9(int i) {
			return getRuleContext(Precedence9Context.class,i);
		}
		public Precedence10Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence10; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterPrecedence10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitPrecedence10(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitPrecedence10(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence10Context precedence10() throws RecognitionException {
		Precedence10Context _localctx = new Precedence10Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_precedence10);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			((Precedence10Context)_localctx).o1 = precedence9();
			((Precedence10Context)_localctx).value =  ((Precedence10Context)_localctx).o1.value;System.out.println("kek10");
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				setState(51);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(43);
					match(T__2);
					setState(44);
					((Precedence10Context)_localctx).o2 = precedence9();
					((Precedence10Context)_localctx).value =  (((Precedence10Context)_localctx).o1.value == ((Precedence10Context)_localctx).o2.value) ? 1 : 0;
					}
					break;
				case T__3:
					{
					setState(47);
					match(T__3);
					setState(48);
					((Precedence10Context)_localctx).o2 = precedence9();
					((Precedence10Context)_localctx).value =  (((Precedence10Context)_localctx).o1.value != ((Precedence10Context)_localctx).o2.value) ? 1 : 0;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Precedence9Context extends ParserRuleContext {
		public int value;
		public Precedence6Context o1;
		public Precedence6Context o2;
		public List<Precedence6Context> precedence6() {
			return getRuleContexts(Precedence6Context.class);
		}
		public Precedence6Context precedence6(int i) {
			return getRuleContext(Precedence6Context.class,i);
		}
		public Precedence9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterPrecedence9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitPrecedence9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitPrecedence9(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence9Context precedence9() throws RecognitionException {
		Precedence9Context _localctx = new Precedence9Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_precedence9);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((Precedence9Context)_localctx).o1 = precedence6();
			((Precedence9Context)_localctx).value =  ((Precedence9Context)_localctx).o1.value;System.out.println("kek9");
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(58);
					match(T__4);
					setState(59);
					((Precedence9Context)_localctx).o2 = precedence6();
					((Precedence9Context)_localctx).value =  (((Precedence9Context)_localctx).o1.value < ((Precedence9Context)_localctx).o2.value) ? 1 : 0;
					}
					break;
				case T__5:
					{
					setState(62);
					match(T__5);
					setState(63);
					((Precedence9Context)_localctx).o2 = precedence6();
					((Precedence9Context)_localctx).value =  (((Precedence9Context)_localctx).o1.value <= ((Precedence9Context)_localctx).o2.value) ? 1 : 0;
					}
					break;
				case T__6:
					{
					setState(66);
					match(T__6);
					setState(67);
					((Precedence9Context)_localctx).o2 = precedence6();
					((Precedence9Context)_localctx).value =  (((Precedence9Context)_localctx).o1.value > ((Precedence9Context)_localctx).o2.value) ? 1 : 0;
					}
					break;
				case T__7:
					{
					setState(70);
					match(T__7);
					setState(71);
					((Precedence9Context)_localctx).o2 = precedence6();
					((Precedence9Context)_localctx).value =  (((Precedence9Context)_localctx).o1.value >= ((Precedence9Context)_localctx).o2.value) ? 1 : 0;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Precedence6Context extends ParserRuleContext {
		public int value;
		public Precedence5Context o1;
		public Precedence5Context o2;
		public List<Precedence5Context> precedence5() {
			return getRuleContexts(Precedence5Context.class);
		}
		public Precedence5Context precedence5(int i) {
			return getRuleContext(Precedence5Context.class,i);
		}
		public Precedence6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterPrecedence6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitPrecedence6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitPrecedence6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence6Context precedence6() throws RecognitionException {
		Precedence6Context _localctx = new Precedence6Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_precedence6);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((Precedence6Context)_localctx).o1 = precedence5();
			((Precedence6Context)_localctx).value =   ((Precedence6Context)_localctx).o1.value;System.out.println("kek6");
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				setState(89);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(81);
					match(T__8);
					setState(82);
					((Precedence6Context)_localctx).o2 = precedence5();
					_localctx.value += ((Precedence6Context)_localctx).o2.value;
					}
					break;
				case T__9:
					{
					setState(85);
					match(T__9);
					setState(86);
					((Precedence6Context)_localctx).o2 = precedence5();
					_localctx.value -= ((Precedence6Context)_localctx).o2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Precedence5Context extends ParserRuleContext {
		public int value;
		public AtomExpContext o1;
		public AtomExpContext o2;
		public List<AtomExpContext> atomExp() {
			return getRuleContexts(AtomExpContext.class);
		}
		public AtomExpContext atomExp(int i) {
			return getRuleContext(AtomExpContext.class,i);
		}
		public Precedence5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterPrecedence5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitPrecedence5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitPrecedence5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence5Context precedence5() throws RecognitionException {
		Precedence5Context _localctx = new Precedence5Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_precedence5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((Precedence5Context)_localctx).o1 = atomExp();
			((Precedence5Context)_localctx).value =   ((Precedence5Context)_localctx).o1.value;System.out.println("kek5");
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				setState(108);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(96);
					match(T__10);
					setState(97);
					((Precedence5Context)_localctx).o2 = atomExp();
					_localctx.value *= ((Precedence5Context)_localctx).o2.value;
					}
					break;
				case T__11:
					{
					setState(100);
					match(T__11);
					setState(101);
					((Precedence5Context)_localctx).o2 = atomExp();
					_localctx.value /= ((Precedence5Context)_localctx).o2.value;
					}
					break;
				case T__12:
					{
					setState(104);
					match(T__12);
					setState(105);
					((Precedence5Context)_localctx).o2 = atomExp();
					_localctx.value %= ((Precedence5Context)_localctx).o2.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class AtomExpContext extends ParserRuleContext {
		public int value;
		public Token n;
		public Precedence15Context exp;
		public TerminalNode Number() { return getToken(ExpParser.Number, 0); }
		public Precedence15Context precedence15() {
			return getRuleContext(Precedence15Context.class,0);
		}
		public AtomExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitAtomExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitAtomExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomExpContext atomExp() throws RecognitionException {
		AtomExpContext _localctx = new AtomExpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atomExp);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((AtomExpContext)_localctx).n = match(Number);
				((AtomExpContext)_localctx).value =  Integer.parseInt((((AtomExpContext)_localctx).n!=null?((AtomExpContext)_localctx).n.getText():null));System.out.println("kekAtom");
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(T__13);
				setState(116);
				((AtomExpContext)_localctx).exp = precedence15();
				setState(117);
				match(T__14);
				((AtomExpContext)_localctx).value =  ((AtomExpContext)_localctx).exp.value;System.out.println("kekAtom");
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4\'\n\4\f\4\16\4*\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\66"+
		"\n\5\f\5\16\59\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bo\n\b\f\b\16\br\13\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t{\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2\u0082\2\22\3\2\2"+
		"\2\4\25\3\2\2\2\6 \3\2\2\2\b+\3\2\2\2\n:\3\2\2\2\fQ\3\2\2\2\16`\3\2\2"+
		"\2\20z\3\2\2\2\22\23\5\4\3\2\23\24\b\2\1\2\24\3\3\2\2\2\25\26\5\6\4\2"+
		"\26\35\b\3\1\2\27\30\7\3\2\2\30\31\5\6\4\2\31\32\b\3\1\2\32\34\3\2\2\2"+
		"\33\27\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\5\3\2\2\2"+
		"\37\35\3\2\2\2 !\5\b\5\2!(\b\4\1\2\"#\7\4\2\2#$\5\b\5\2$%\b\4\1\2%\'\3"+
		"\2\2\2&\"\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\7\3\2\2\2*(\3\2\2\2"+
		"+,\5\n\6\2,\67\b\5\1\2-.\7\5\2\2./\5\n\6\2/\60\b\5\1\2\60\66\3\2\2\2\61"+
		"\62\7\6\2\2\62\63\5\n\6\2\63\64\b\5\1\2\64\66\3\2\2\2\65-\3\2\2\2\65\61"+
		"\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\t\3\2\2\29\67\3\2\2\2"+
		":;\5\f\7\2;N\b\6\1\2<=\7\7\2\2=>\5\f\7\2>?\b\6\1\2?M\3\2\2\2@A\7\b\2\2"+
		"AB\5\f\7\2BC\b\6\1\2CM\3\2\2\2DE\7\t\2\2EF\5\f\7\2FG\b\6\1\2GM\3\2\2\2"+
		"HI\7\n\2\2IJ\5\f\7\2JK\b\6\1\2KM\3\2\2\2L<\3\2\2\2L@\3\2\2\2LD\3\2\2\2"+
		"LH\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\13\3\2\2\2PN\3\2\2\2QR\5\16"+
		"\b\2R]\b\7\1\2ST\7\13\2\2TU\5\16\b\2UV\b\7\1\2V\\\3\2\2\2WX\7\f\2\2XY"+
		"\5\16\b\2YZ\b\7\1\2Z\\\3\2\2\2[S\3\2\2\2[W\3\2\2\2\\_\3\2\2\2][\3\2\2"+
		"\2]^\3\2\2\2^\r\3\2\2\2_]\3\2\2\2`a\5\20\t\2ap\b\b\1\2bc\7\r\2\2cd\5\20"+
		"\t\2de\b\b\1\2eo\3\2\2\2fg\7\16\2\2gh\5\20\t\2hi\b\b\1\2io\3\2\2\2jk\7"+
		"\17\2\2kl\5\20\t\2lm\b\b\1\2mo\3\2\2\2nb\3\2\2\2nf\3\2\2\2nj\3\2\2\2o"+
		"r\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\17\3\2\2\2rp\3\2\2\2st\7\22\2\2t{\b\t\1"+
		"\2uv\7\20\2\2vw\5\4\3\2wx\7\21\2\2xy\b\t\1\2y{\3\2\2\2zs\3\2\2\2zu\3\2"+
		"\2\2{\21\3\2\2\2\r\35(\65\67LN[]npz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}