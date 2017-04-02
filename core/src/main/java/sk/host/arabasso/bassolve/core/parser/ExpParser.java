// Generated from Exp.g4 by ANTLR 4.5.3

package sk.host.arabasso.bassolve.core.parser;

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
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, PLUS=3, MINUS=4, TIMES=5, DIV=6, GT=7, GTE=8, LT=9, 
		LTE=10, EQ=11, NEQ=12, POINT=13, POW=14, LETTER=15, DIGIT=16, E=17, WS=18;
	public static final int
		RULE_compileUnit = 0, RULE_equation = 1, RULE_expression = 2, RULE_multiplyingExpr = 3, 
		RULE_powExpr = 4, RULE_atom = 5, RULE_number = 6, RULE_func = 7, RULE_identifier = 8;
	public static final String[] ruleNames = {
		"compileUnit", "equation", "expression", "multiplyingExpr", "powExpr", 
		"atom", "number", "func", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", 
		"'<='", "'='", null, "'.'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "GT", "GTE", 
		"LT", "LTE", "EQ", "NEQ", "POINT", "POW", "LETTER", "DIGIT", "E", "WS"
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
	public static class CompileUnitContext extends ParserRuleContext {
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExpParser.EOF, 0); }
		public CompileUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compileUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterCompileUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitCompileUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitCompileUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompileUnitContext compileUnit() throws RecognitionException {
		CompileUnitContext _localctx = new CompileUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compileUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			equation();
			setState(19);
			match(EOF);
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

	public static class EquationContext extends ParserRuleContext {
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
	 
		public EquationContext() { }
		public void copyFrom(EquationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EquationExpressionContext extends EquationContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ExpParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ExpParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(ExpParser.LT, 0); }
		public TerminalNode GT() { return getToken(ExpParser.GT, 0); }
		public TerminalNode LTE() { return getToken(ExpParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(ExpParser.GTE, 0); }
		public EquationExpressionContext(EquationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterEquationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitEquationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitEquationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionNextContext extends EquationContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionNextContext(EquationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterExpressionNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitExpressionNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitExpressionNext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_equation);
		int _la;
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new EquationExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				((EquationExpressionContext)_localctx).left = expression(0);
				setState(22);
				((EquationExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
					((EquationExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(23);
				((EquationExpressionContext)_localctx).right = expression(0);
				}
				break;
			case 2:
				_localctx = new ExpressionNextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				expression(0);
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplyingExpressionNextContext extends ExpressionContext {
		public MultiplyingExprContext multiplyingExpr() {
			return getRuleContext(MultiplyingExprContext.class,0);
		}
		public MultiplyingExpressionNextContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterMultiplyingExpressionNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitMultiplyingExpressionNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitMultiplyingExpressionNext(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public MultiplyingExprContext right;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultiplyingExprContext multiplyingExpr() {
			return getRuleContext(MultiplyingExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ExpParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ExpParser.MINUS, 0); }
		public PlusMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterPlusMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitPlusMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitPlusMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ExpParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ExpParser.MINUS, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(29);
				((UnaryExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((UnaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(30);
				expression(3);
				}
				break;
			case LPAREN:
			case LETTER:
			case DIGIT:
				{
				_localctx = new MultiplyingExpressionNextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				multiplyingExpr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PlusMinusExpressionContext(new ExpressionContext(_parentctx, _parentState));
					((PlusMinusExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(34);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(35);
					((PlusMinusExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((PlusMinusExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(36);
					((PlusMinusExpressionContext)_localctx).right = multiplyingExpr(0);
					}
					} 
				}
				setState(41);
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

	public static class MultiplyingExprContext extends ParserRuleContext {
		public MultiplyingExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpr; }
	 
		public MultiplyingExprContext() { }
		public void copyFrom(MultiplyingExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimesDivExpressionContext extends MultiplyingExprContext {
		public MultiplyingExprContext left;
		public Token op;
		public PowExprContext right;
		public MultiplyingExprContext multiplyingExpr() {
			return getRuleContext(MultiplyingExprContext.class,0);
		}
		public PowExprContext powExpr() {
			return getRuleContext(PowExprContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(ExpParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(ExpParser.DIV, 0); }
		public TimesDivExpressionContext(MultiplyingExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterTimesDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitTimesDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitTimesDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExpressionNextContext extends MultiplyingExprContext {
		public PowExprContext powExpr() {
			return getRuleContext(PowExprContext.class,0);
		}
		public PowExpressionNextContext(MultiplyingExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterPowExpressionNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitPowExpressionNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitPowExpressionNext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingExprContext multiplyingExpr() throws RecognitionException {
		return multiplyingExpr(0);
	}

	private MultiplyingExprContext multiplyingExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplyingExprContext _localctx = new MultiplyingExprContext(_ctx, _parentState);
		MultiplyingExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_multiplyingExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PowExpressionNextContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(43);
			powExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TimesDivExpressionContext(new MultiplyingExprContext(_parentctx, _parentState));
					((TimesDivExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_multiplyingExpr);
					setState(45);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(46);
					((TimesDivExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIV) ) {
						((TimesDivExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(47);
					((TimesDivExpressionContext)_localctx).right = powExpr(0);
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class PowExprContext extends ParserRuleContext {
		public PowExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powExpr; }
	 
		public PowExprContext() { }
		public void copyFrom(PowExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PowExpressionContext extends PowExprContext {
		public PowExprContext left;
		public Token op;
		public AtomContext right;
		public PowExprContext powExpr() {
			return getRuleContext(PowExprContext.class,0);
		}
		public TerminalNode POW() { return getToken(ExpParser.POW, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public PowExpressionContext(PowExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterPowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitPowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitPowExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExpressionNextContext extends PowExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExpressionNextContext(PowExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterAtomExpressionNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitAtomExpressionNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitAtomExpressionNext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowExprContext powExpr() throws RecognitionException {
		return powExpr(0);
	}

	private PowExprContext powExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PowExprContext _localctx = new PowExprContext(_ctx, _parentState);
		PowExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_powExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AtomExpressionNextContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(54);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PowExpressionContext(new PowExprContext(_parentctx, _parentState));
					((PowExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_powExpr);
					setState(56);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(57);
					((PowExpressionContext)_localctx).op = match(POW);
					setState(58);
					((PowExpressionContext)_localctx).right = atom();
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberExpressionContext extends AtomContext {
		public NumberContext value;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberExpressionContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExpressionNextContext extends AtomContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public FuncExpressionNextContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterFuncExpressionNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitFuncExpressionNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitFuncExpressionNext(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensExpressionContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(ExpParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExpParser.RPAREN, 0); }
		public ParensExpressionContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterParensExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitParensExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitParensExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentfierExpressionContext extends AtomContext {
		public IdentifierContext value;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentfierExpressionContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterIdentfierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitIdentfierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitIdentfierExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new NumberExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				((NumberExpressionContext)_localctx).value = number();
				}
				break;
			case 2:
				_localctx = new IdentfierExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				((IdentfierExpressionContext)_localctx).value = identifier();
				}
				break;
			case 3:
				_localctx = new FuncExpressionNextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				func();
				}
				break;
			case 4:
				_localctx = new ParensExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(LPAREN);
				setState(68);
				expression(0);
				setState(69);
				match(RPAREN);
				}
				break;
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

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ExpParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ExpParser.DIGIT, i);
		}
		public TerminalNode POINT() { return getToken(ExpParser.POINT, 0); }
		public TerminalNode E() { return getToken(ExpParser.E, 0); }
		public TerminalNode PLUS() { return getToken(ExpParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ExpParser.MINUS, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(73);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(76); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(78);
				match(POINT);
				setState(80); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(79);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(82); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(86);
				match(E);
				setState(87);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(89); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(88);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(91); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
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

	public static class FuncContext extends ParserRuleContext {
		public IdentifierContext id;
		public TerminalNode LPAREN() { return getToken(ExpParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExpParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			((FuncContext)_localctx).id = identifier();
			setState(96);
			match(LPAREN);
			setState(97);
			expression(0);
			setState(98);
			match(RPAREN);
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(ExpParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(ExpParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ExpParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ExpParser.DIGIT, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(LETTER);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					_la = _input.LA(1);
					if ( !(_la==LETTER || _la==DIGIT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 3:
			return multiplyingExpr_sempred((MultiplyingExprContext)_localctx, predIndex);
		case 4:
			return powExpr_sempred((PowExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplyingExpr_sempred(MultiplyingExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean powExpr_sempred(PowExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24n\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\5\4#\n\4\3\4\3\4\3\4\7"+
		"\4(\n\4\f\4\16\4+\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\63\n\5\f\5\16\5\66"+
		"\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7J\n\7\3\b\6\bM\n\b\r\b\16\bN\3\b\3\b\6\bS\n\b\r\b\16\b"+
		"T\5\bW\n\b\3\b\3\b\3\b\6\b\\\n\b\r\b\16\b]\5\b`\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\7\ni\n\n\f\n\16\nl\13\n\3\n\2\5\6\b\n\13\2\4\6\b\n\f\16\20"+
		"\22\2\6\3\2\t\16\3\2\5\6\3\2\7\b\3\2\21\22r\2\24\3\2\2\2\4\34\3\2\2\2"+
		"\6\"\3\2\2\2\b,\3\2\2\2\n\67\3\2\2\2\fI\3\2\2\2\16L\3\2\2\2\20a\3\2\2"+
		"\2\22f\3\2\2\2\24\25\5\4\3\2\25\26\7\2\2\3\26\3\3\2\2\2\27\30\5\6\4\2"+
		"\30\31\t\2\2\2\31\32\5\6\4\2\32\35\3\2\2\2\33\35\5\6\4\2\34\27\3\2\2\2"+
		"\34\33\3\2\2\2\35\5\3\2\2\2\36\37\b\4\1\2\37 \t\3\2\2 #\5\6\4\5!#\5\b"+
		"\5\2\"\36\3\2\2\2\"!\3\2\2\2#)\3\2\2\2$%\f\4\2\2%&\t\3\2\2&(\5\b\5\2\'"+
		"$\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\7\3\2\2\2+)\3\2\2\2,-\b\5\1"+
		"\2-.\5\n\6\2.\64\3\2\2\2/\60\f\4\2\2\60\61\t\4\2\2\61\63\5\n\6\2\62/\3"+
		"\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\t\3\2\2\2\66\64\3"+
		"\2\2\2\678\b\6\1\289\5\f\7\29?\3\2\2\2:;\f\4\2\2;<\7\20\2\2<>\5\f\7\2"+
		"=:\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\13\3\2\2\2A?\3\2\2\2BJ\5\16"+
		"\b\2CJ\5\22\n\2DJ\5\20\t\2EF\7\3\2\2FG\5\6\4\2GH\7\4\2\2HJ\3\2\2\2IB\3"+
		"\2\2\2IC\3\2\2\2ID\3\2\2\2IE\3\2\2\2J\r\3\2\2\2KM\7\22\2\2LK\3\2\2\2M"+
		"N\3\2\2\2NL\3\2\2\2NO\3\2\2\2OV\3\2\2\2PR\7\17\2\2QS\7\22\2\2RQ\3\2\2"+
		"\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VP\3\2\2\2VW\3\2\2\2W_\3\2\2"+
		"\2XY\7\23\2\2Y[\t\3\2\2Z\\\7\22\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3"+
		"\2\2\2^`\3\2\2\2_X\3\2\2\2_`\3\2\2\2`\17\3\2\2\2ab\5\22\n\2bc\7\3\2\2"+
		"cd\5\6\4\2de\7\4\2\2e\21\3\2\2\2fj\7\21\2\2gi\t\5\2\2hg\3\2\2\2il\3\2"+
		"\2\2jh\3\2\2\2jk\3\2\2\2k\23\3\2\2\2lj\3\2\2\2\16\34\")\64?INTV]_j";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}