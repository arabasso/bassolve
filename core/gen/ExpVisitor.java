// Generated from C:/Users/arabasso/IdeaProjects/bassolve/core/src/main/antlr\Exp.g4 by ANTLR 4.7

package sk.host.arabasso.bassolve.core.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpParser#compileUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompileUnit(ExpParser.CompileUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equationExpression}
	 * labeled alternative in {@link ExpParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquationExpression(ExpParser.EquationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionNext}
	 * labeled alternative in {@link ExpParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNext(ExpParser.ExpressionNextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyingExpressionNext}
	 * labeled alternative in {@link ExpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpressionNext(ExpParser.MultiplyingExpressionNextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinusExpression}
	 * labeled alternative in {@link ExpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExpression(ExpParser.PlusMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link ExpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(ExpParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timesDivExpression}
	 * labeled alternative in {@link ExpParser#multiplyingExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesDivExpression(ExpParser.TimesDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpressionNext}
	 * labeled alternative in {@link ExpParser#multiplyingExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpressionNext(ExpParser.PowExpressionNextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpression}
	 * labeled alternative in {@link ExpParser#powExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpression(ExpParser.PowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpressionNext}
	 * labeled alternative in {@link ExpParser#powExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpressionNext(ExpParser.AtomExpressionNextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link ExpParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(ExpParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identfierExpression}
	 * labeled alternative in {@link ExpParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentfierExpression(ExpParser.IdentfierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcExpressionNext}
	 * labeled alternative in {@link ExpParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpressionNext(ExpParser.FuncExpressionNextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensExpression}
	 * labeled alternative in {@link ExpParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpression(ExpParser.ParensExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ExpParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(ExpParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ExpParser.IdentifierContext ctx);
}