package sk.host.arabasso.bassolve.core.visitor;

import sk.host.arabasso.bassolve.core.ast.node.*;
import sk.host.arabasso.bassolve.core.parser.ExpBaseVisitor;
import sk.host.arabasso.bassolve.core.parser.ExpLexer;
import sk.host.arabasso.bassolve.core.parser.ExpParser;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public class BuildAstVisitor extends ExpBaseVisitor<ExpressionNode> {
    public ExpressionNode visitCompileUnit(ExpParser.CompileUnitContext context) {
        return visit(context.equation());
    }

    @Override
    public ExpressionNode visitExpressionNext(ExpParser.ExpressionNextContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public ExpressionNode visitEquationExpression(ExpParser.EquationExpressionContext ctx) {
        InfixExpressionNode node;

        ExpressionNode left = visit(ctx.left);
        ExpressionNode right = visit(ctx.right);

        switch (ctx.op.getType()) {
            case ExpLexer.EQ:
                node = new EqualityNode(left, right);
                break;

            case ExpLexer.NEQ:
                node = new NotEqualityNode(left, right);
                break;

            default:
                throw new UnsupportedOperationException();
        }

        return node;
    }

    @Override
    public ExpressionNode visitPlusMinusExpression(ExpParser.PlusMinusExpressionContext ctx) {
        InfixExpressionNode node;

        ExpressionNode left = visit(ctx.left);
        ExpressionNode right = visit(ctx.right);

        switch (ctx.op.getType()) {
            case ExpLexer.PLUS:
                node = new AdditionNode(left, right);
                break;

            case ExpLexer.MINUS:
                node = new SubtractionNode(left, right);
                break;

            default:
                throw new UnsupportedOperationException();
        }

        return node;
    }

    @Override
    public ExpressionNode visitMultiplyingExpressionNext(ExpParser.MultiplyingExpressionNextContext ctx) {
        return visit(ctx.multiplyingExpr());
    }

    @Override
    public ExpressionNode visitTimesDivExpression(ExpParser.TimesDivExpressionContext ctx) {
        InfixExpressionNode node;

        ExpressionNode left = visit(ctx.left);
        ExpressionNode right = visit(ctx.right);

        switch (ctx.op.getType()) {
            case ExpLexer.TIMES:
                node = new MultiplicationNode(left, right);
                break;

            case ExpLexer.DIV:
                node = new DivisionNode(left, right);
                break;

            default:
                throw new UnsupportedOperationException();
        }

        return node;
    }

    @Override
    public ExpressionNode visitPowExpressionNext(ExpParser.PowExpressionNextContext ctx) {
        return visit(ctx.powExpr());
    }

    @Override
    public ExpressionNode visitPowExpression(ExpParser.PowExpressionContext ctx) {
        ExpressionNode left = visit(ctx.left);
        ExpressionNode right = visit(ctx.right);

        return new PowNode(left, right);
    }

    @Override
    public ExpressionNode visitAtomExpressionNext(ExpParser.AtomExpressionNextContext ctx) {
        return super.visitAtomExpressionNext(ctx);
    }

    @Override
    public ExpressionNode visitNumberExpression(ExpParser.NumberExpressionContext ctx) {
        return new NumberNode(Double.parseDouble(ctx.value.getText()));
    }

    @Override
    public ExpressionNode visitParensExpression(ExpParser.ParensExpressionContext ctx) {
        return new ParenthesisNode(visit(ctx.expression()));
    }

    @Override
    public ExpressionNode visitNumber(ExpParser.NumberContext ctx) {
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);

        try {
            return new NumberNode(df.parse(ctx.getText()).doubleValue());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return super.visitNumber(ctx);
    }

    @Override
    public ExpressionNode visitIdentifier(ExpParser.IdentifierContext ctx) {
        return super.visitIdentifier(ctx);
    }

    @Override
    public ExpressionNode visitFuncExpressionNext(ExpParser.FuncExpressionNextContext ctx) {
        return visit(ctx.func());
    }

    @Override
    public ExpressionNode visitFunc(ExpParser.FuncContext ctx) {
        return new FunctionNode(ctx.id.getText(), visit(ctx.expression()));
    }

    @Override
    public ExpressionNode visitUnaryExpression(ExpParser.UnaryExpressionContext ctx) {
        switch (ctx.op.getType()) {
            case ExpLexer.PLUS:
                return visit(ctx.expression());

            case ExpLexer.MINUS:
                return new NegateNode(visit(ctx.expression()));
            default:
                throw new UnsupportedOperationException();
        }
    }
}
