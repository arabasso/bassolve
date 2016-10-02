// Generated from Exp.g4 by ANTLR 4.5.3

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
	 * Visit a parse tree produced by {@link ExpParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(ExpParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ExpParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(ExpParser.MultiplyingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#powExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpression(ExpParser.PowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ExpParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(ExpParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(ExpParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(ExpParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ExpParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ExpParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ExpParser.IdentifierContext ctx);
}