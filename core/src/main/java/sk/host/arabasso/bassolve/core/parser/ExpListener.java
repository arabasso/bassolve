// Generated from Exp.g4 by ANTLR 4.5.3

package sk.host.arabasso.bassolve.core.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpParser}.
 */
public interface ExpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompileUnit(ExpParser.CompileUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompileUnit(ExpParser.CompileUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equationExpression}
	 * labeled alternative in {@link ExpParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquationExpression(ExpParser.EquationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equationExpression}
	 * labeled alternative in {@link ExpParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquationExpression(ExpParser.EquationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNext}
	 * labeled alternative in {@link ExpParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNext(ExpParser.ExpressionNextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNext}
	 * labeled alternative in {@link ExpParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNext(ExpParser.ExpressionNextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyingExpressionNext}
	 * labeled alternative in {@link ExpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpressionNext(ExpParser.MultiplyingExpressionNextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyingExpressionNext}
	 * labeled alternative in {@link ExpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpressionNext(ExpParser.MultiplyingExpressionNextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinusExpression}
	 * labeled alternative in {@link ExpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpression(ExpParser.PlusMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinusExpression}
	 * labeled alternative in {@link ExpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpression(ExpParser.PlusMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link ExpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ExpParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link ExpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ExpParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timesDivExpression}
	 * labeled alternative in {@link ExpParser#multiplyingExpr}.
	 * @param ctx the parse tree
	 */
	void enterTimesDivExpression(ExpParser.TimesDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timesDivExpression}
	 * labeled alternative in {@link ExpParser#multiplyingExpr}.
	 * @param ctx the parse tree
	 */
	void exitTimesDivExpression(ExpParser.TimesDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpressionNext}
	 * labeled alternative in {@link ExpParser#multiplyingExpr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpressionNext(ExpParser.PowExpressionNextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpressionNext}
	 * labeled alternative in {@link ExpParser#multiplyingExpr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpressionNext(ExpParser.PowExpressionNextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpression}
	 * labeled alternative in {@link ExpParser#powExpr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpression(ExpParser.PowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpression}
	 * labeled alternative in {@link ExpParser#powExpr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpression(ExpParser.PowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpressionNext}
	 * labeled alternative in {@link ExpParser#powExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpressionNext(ExpParser.AtomExpressionNextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpressionNext}
	 * labeled alternative in {@link ExpParser#powExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpressionNext(ExpParser.AtomExpressionNextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link ExpParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(ExpParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link ExpParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(ExpParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identfierExpression}
	 * labeled alternative in {@link ExpParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdentfierExpression(ExpParser.IdentfierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identfierExpression}
	 * labeled alternative in {@link ExpParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdentfierExpression(ExpParser.IdentfierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcExpressionNext}
	 * labeled alternative in {@link ExpParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpressionNext(ExpParser.FuncExpressionNextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcExpressionNext}
	 * labeled alternative in {@link ExpParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpressionNext(ExpParser.FuncExpressionNextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensExpression}
	 * labeled alternative in {@link ExpParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParensExpression(ExpParser.ParensExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensExpression}
	 * labeled alternative in {@link ExpParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParensExpression(ExpParser.ParensExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ExpParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ExpParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(ExpParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(ExpParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ExpParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ExpParser.IdentifierContext ctx);
}