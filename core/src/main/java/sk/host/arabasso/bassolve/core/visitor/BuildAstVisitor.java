package sk.host.arabasso.bassolve.core.visitor;

import sk.host.arabasso.bassolve.core.ast.node.*;
import sk.host.arabasso.bassolve.core.parser.ExpBaseVisitor;
import sk.host.arabasso.bassolve.core.parser.ExpLexer;
import sk.host.arabasso.bassolve.core.parser.ExpParser;

import java.lang.reflect.Method;

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

    //    @Override
//    public ExpressionNode visitEquation(ExpParser.EquationContext ctx) {
//        InfixExpressionNode node;
//
//        ExpressionNode left = visit(ctx.left);
//        ExpressionNode right = visit(ctx.right);
//
//        switch (ctx.op.getType()) {
//            case ExpLexer.EQ:
//                node = new EqualityNode(left, right);
//                break;
//
//            case ExpLexer.NEQ:
//                node = new NotEqualityNode(left, right);
//                break;
//
//            default:
//                throw new UnsupportedOperationException();
//        }
//
//        return node;
//    }

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

//    @Override
//    public ExpressionNode visitIdentfierExpression(ExpParser.IdentfierExpressionContext ctx) {
//        return super.visitIdentfierExpression(ctx);
//    }

    @Override
    public ExpressionNode visitParensExpression(ExpParser.ParensExpressionContext ctx) {
        return new ParenthesisNode(visit(ctx.expression()));
    }

    @Override
    public ExpressionNode visitNumber(ExpParser.NumberContext ctx) {
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
//        Method method = null;
//        try {
//            method = Math.class.getMethod(ctx.id.getText(), double.class);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }

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

    //    @Override
//    public ExpressionNode visitNumberExpr(ExpParser.NumberExprContext context) {
//        return new NumberNode(Double.parseDouble(context.value.getText()));
//    }
//
//    @Override
//    public ExpressionNode visitParensExpression(ExpParser.ParensExpressionContext context) {
//        return new ParenthesisNode(visit(context.expression()));
//    }
//
//    @Override
//    public ExpressionNode visitInfixExpression(ExpParser.InfixExpressionContext context) {
//        InfixExpressionNode node;
//
//        ExpressionNode left = visit(context.left);
//        ExpressionNode right = visit(context.right);
//
//        switch (context.op.getType()) {
//            case ExpLexer.PLUS:
//                node = new AdditionNode(left, right);
//                break;
//
//            case ExpLexer.MINUS:
//                node = new SubtractionNode(left, right);
//                break;
//
//            case ExpLexer.TIMES:
//                node = new MultiplicationNode(left, right);
//                break;
//
//            case ExpLexer.POW:
//                node = new PowNode(left, right);
//                break;
//
//            case ExpLexer.DIV:
//                node = new DivisionNode(left, right);
//                break;
//
//            default:
//                throw new UnsupportedOperationException();
//        }
//
//        return node;
//    }
//
//    @Override
//    public ExpressionNode visitUnaryExpression(ExpParser.UnaryExpressionContext context) {
//        switch (context.op.getType()) {
//            case ExpLexer.PLUS:
//                return visit(context.expression());
//
//            case ExpLexer.MINUS:
//                return new NegateNode(visit(context.expression()));
//            default:
//                throw new UnsupportedOperationException();
//        }
//    }
//
//    @Override
//    public ExpressionNode visitFuncExpression(ExpParser.FuncExpressionContext context) {
//        Method method = null;
//        try {
//            method = Math.class.getMethod(context.id.getText(), double.class);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//
//        return new FunctionNode(method, visit(context.expression()));
//    }
}
