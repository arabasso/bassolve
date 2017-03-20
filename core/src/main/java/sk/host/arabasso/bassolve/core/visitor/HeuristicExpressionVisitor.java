package sk.host.arabasso.bassolve.core.visitor;

import sk.host.arabasso.bassolve.core.ast.node.*;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by arabasso on 20/03/2017.
 */
public class HeuristicExpressionVisitor extends AstVisitor<ExpressionNode> {

    public boolean isApplicable(ExpressionNode node) {
        return false;
    }

    public ExpressionNode apply(ExpressionNode node) {
        return node;
    }

    @Override
    public ExpressionNode visit(ExpressionNode node) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return super.visit(node);
    }

    @Override
    public ExpressionNode visit(AdditionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (isApplicable(node)) {
            return apply(node);
        }

        return node.newInstance(visit(node.getLeft()), visit(node.getRight()));
    }

    @Override
    public ExpressionNode visit(SubtractionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (isApplicable(node)) {
            return apply(node);
        }

        return node.newInstance(visit(node.getLeft()), visit(node.getRight()));
    }

    @Override
    public ExpressionNode visit(MultiplicationNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (isApplicable(node)) {
            return apply(node);
        }

        return node.newInstance(visit(node.getLeft()), visit(node.getRight()));
    }

    @Override
    public ExpressionNode visit(PowNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (isApplicable(node)) {
            return apply(node);
        }

        return node.newInstance(visit(node.getLeft()), visit(node.getRight()));
    }

    @Override
    public ExpressionNode visit(DivisionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (isApplicable(node)) {
            return apply(node);
        }

        return node.newInstance(visit(node.getLeft()), visit(node.getRight()));
    }

    @Override
    public ExpressionNode visit(NegateNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (isApplicable(node)) {
            return apply(node);
        }

        return new NegateNode(visit(node.getInnerNode()));
    }

    @Override
    public ExpressionNode visit(FunctionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (isApplicable(node)) {
            return apply(node);
        }

        return new FunctionNode(node.getFunction(), visit(node.getArgument()));
    }

    @Override
    public ExpressionNode visit(ParenthesisNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (isApplicable(node)) {
            return apply(node);
        }

        return new ParenthesisNode(visit(node.getInnerNode()));
    }

    @Override
    public ExpressionNode visit(NumberNode node) {
        return node;
    }
}
