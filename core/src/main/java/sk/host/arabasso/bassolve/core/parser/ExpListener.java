// Generated from Exp.g4 by ANTLR 4.5.3

package sk.host.arabasso.bassolve.core.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpParser}.
 */
public interface ExpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(ExpParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(ExpParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExpParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExpParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(ExpParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(ExpParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowExpression(ExpParser.PowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowExpression(ExpParser.PowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ExpParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ExpParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(ExpParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(ExpParser.ScientificContext ctx);
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
	 * Enter a parse tree produced by {@link ExpParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(ExpParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(ExpParser.RelopContext ctx);
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
	 * Enter a parse tree produced by {@link ExpParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ExpParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ExpParser.VariableContext ctx);
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