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
		LPAREN=1, RPAREN=2, PLUS=3, MINUS=4, TIMES=5, DIV=6, GT=7, LT=8, EQ=9, 
		POINT=10, E=11, POW=12, LETTER=13, DIGIT=14, WS=15;
	public static final int
		RULE_equation = 0, RULE_expression = 1, RULE_multiplyingExpression = 2, 
		RULE_powExpression = 3, RULE_atom = 4, RULE_scientific = 5, RULE_func = 6, 
		RULE_relop = 7, RULE_number = 8, RULE_variable = 9, RULE_identifier = 10;
	public static final String[] ruleNames = {
		"equation", "expression", "multiplyingExpression", "powExpression", "atom", 
		"scientific", "func", "relop", "number", "variable", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'='", "'.'", 
		null, "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "GT", "LT", 
		"EQ", "POINT", "E", "POW", "LETTER", "DIGIT", "WS"
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
	public static class EquationContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_equation);
		try {
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				expression();
				setState(24);
				relop();
				setState(25);
				expression();
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
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ExpParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ExpParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ExpParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ExpParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			multiplyingExpression();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(30);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(31);
				multiplyingExpression();
				}
				}
				setState(36);
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

	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public List<PowExpressionContext> powExpression() {
			return getRuleContexts(PowExpressionContext.class);
		}
		public PowExpressionContext powExpression(int i) {
			return getRuleContext(PowExpressionContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(ExpParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(ExpParser.TIMES, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ExpParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ExpParser.DIV, i);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterMultiplyingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitMultiplyingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitMultiplyingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multiplyingExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			powExpression();
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIV) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(39);
					powExpression();
					}
					} 
				}
				setState(44);
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
			exitRule();
		}
		return _localctx;
	}

	public static class PowExpressionContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode POW() { return getToken(ExpParser.POW, 0); }
		public MultiplyingExpressionContext multiplyingExpression() {
			return getRuleContext(MultiplyingExpressionContext.class,0);
		}
		public PowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powExpression; }
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

	public final PowExpressionContext powExpression() throws RecognitionException {
		PowExpressionContext _localctx = new PowExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_powExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			atom();
			setState(48);
			_la = _input.LA(1);
			if (_la==POW) {
				{
				setState(46);
				match(POW);
				setState(47);
				multiplyingExpression();
				}
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

	public static class AtomContext extends ParserRuleContext {
		public ScientificContext scientific() {
			return getRuleContext(ScientificContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ExpParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExpParser.RPAREN, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				scientific();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(LPAREN);
				setState(53);
				expression();
				setState(54);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				func();
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

	public static class ScientificContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode E() { return getToken(ExpParser.E, 0); }
		public ScientificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientific; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterScientific(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitScientific(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitScientific(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScientificContext scientific() throws RecognitionException {
		ScientificContext _localctx = new ScientificContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scientific);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			number();
			setState(62);
			_la = _input.LA(1);
			if (_la==E) {
				{
				setState(60);
				match(E);
				setState(61);
				number();
				}
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ExpParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExpParser.RPAREN, 0); }
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
		enterRule(_localctx, 12, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			identifier();
			setState(65);
			match(LPAREN);
			setState(66);
			expression();
			setState(67);
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(ExpParser.EQ, 0); }
		public TerminalNode GT() { return getToken(ExpParser.GT, 0); }
		public TerminalNode LT() { return getToken(ExpParser.LT, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(ExpParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(ExpParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ExpParser.DIGIT, i);
		}
		public TerminalNode POINT() { return getToken(ExpParser.POINT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_number);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(71);
					match(MINUS);
					}
				}

				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(74);
					match(DIGIT);
					}
					}
					setState(77); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(85);
				_la = _input.LA(1);
				if (_la==POINT) {
					{
					setState(79);
					match(POINT);
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(80);
						match(DIGIT);
						}
						}
						setState(83); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==DIGIT );
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(87);
					match(MINUS);
					}
				}

				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(90);
					match(DIGIT);
					}
					}
					setState(93); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(101);
				_la = _input.LA(1);
				if (_la==POINT) {
					{
					setState(95);
					match(POINT);
					setState(97); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(96);
						match(DIGIT);
						}
						}
						setState(99); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==DIGIT );
					}
				}

				setState(103);
				variable();
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

	public static class VariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(ExpParser.MINUS, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpListener ) ((ExpListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpVisitor ) return ((ExpVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(106);
				match(MINUS);
				}
			}

			setState(109);
			identifier();
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
		enterRule(_localctx, 20, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(LETTER);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTER || _la==DIGIT) {
				{
				{
				setState(112);
				_la = _input.LA(1);
				if ( !(_la==LETTER || _la==DIGIT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(117);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\3\2\5\2\36\n\2\3\3\3\3\3\3\7\3#\n\3\f\3\16\3&\13"+
		"\3\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\5\3\5\3\5\5\5\63\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6<\n\6\3\7\3\7\3\7\5\7A\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\5\nK\n\n\3\n\6\nN\n\n\r\n\16\nO\3\n\3\n\6\nT\n\n\r\n\16\n"+
		"U\5\nX\n\n\3\n\5\n[\n\n\3\n\6\n^\n\n\r\n\16\n_\3\n\3\n\6\nd\n\n\r\n\16"+
		"\ne\5\nh\n\n\3\n\5\nk\n\n\3\13\5\13n\n\13\3\13\3\13\3\f\3\f\7\ft\n\f\f"+
		"\f\16\fw\13\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\6\3\2\5\6\3\2\7\b"+
		"\3\2\t\13\3\2\17\20\u0080\2\35\3\2\2\2\4\37\3\2\2\2\6\'\3\2\2\2\b/\3\2"+
		"\2\2\n;\3\2\2\2\f=\3\2\2\2\16B\3\2\2\2\20G\3\2\2\2\22j\3\2\2\2\24m\3\2"+
		"\2\2\26q\3\2\2\2\30\36\5\4\3\2\31\32\5\4\3\2\32\33\5\20\t\2\33\34\5\4"+
		"\3\2\34\36\3\2\2\2\35\30\3\2\2\2\35\31\3\2\2\2\36\3\3\2\2\2\37$\5\6\4"+
		"\2 !\t\2\2\2!#\5\6\4\2\" \3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\5\3"+
		"\2\2\2&$\3\2\2\2\',\5\b\5\2()\t\3\2\2)+\5\b\5\2*(\3\2\2\2+.\3\2\2\2,*"+
		"\3\2\2\2,-\3\2\2\2-\7\3\2\2\2.,\3\2\2\2/\62\5\n\6\2\60\61\7\16\2\2\61"+
		"\63\5\6\4\2\62\60\3\2\2\2\62\63\3\2\2\2\63\t\3\2\2\2\64<\5\f\7\2\65<\5"+
		"\24\13\2\66\67\7\3\2\2\678\5\4\3\289\7\4\2\29<\3\2\2\2:<\5\16\b\2;\64"+
		"\3\2\2\2;\65\3\2\2\2;\66\3\2\2\2;:\3\2\2\2<\13\3\2\2\2=@\5\22\n\2>?\7"+
		"\r\2\2?A\5\22\n\2@>\3\2\2\2@A\3\2\2\2A\r\3\2\2\2BC\5\26\f\2CD\7\3\2\2"+
		"DE\5\4\3\2EF\7\4\2\2F\17\3\2\2\2GH\t\4\2\2H\21\3\2\2\2IK\7\6\2\2JI\3\2"+
		"\2\2JK\3\2\2\2KM\3\2\2\2LN\7\20\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3"+
		"\2\2\2PW\3\2\2\2QS\7\f\2\2RT\7\20\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV"+
		"\3\2\2\2VX\3\2\2\2WQ\3\2\2\2WX\3\2\2\2Xk\3\2\2\2Y[\7\6\2\2ZY\3\2\2\2Z"+
		"[\3\2\2\2[]\3\2\2\2\\^\7\20\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2"+
		"\2`g\3\2\2\2ac\7\f\2\2bd\7\20\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2"+
		"\2\2fh\3\2\2\2ga\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\5\24\13\2jJ\3\2\2\2jZ\3"+
		"\2\2\2k\23\3\2\2\2ln\7\6\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\5\26\f\2"+
		"p\25\3\2\2\2qu\7\17\2\2rt\t\5\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2"+
		"\2\2v\27\3\2\2\2wu\3\2\2\2\23\35$,\62;@JOUWZ_egjmu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}