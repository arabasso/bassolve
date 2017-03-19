package sk.host.arabasso.bassolve.core.visitor;

import sk.host.arabasso.bassolve.core.ast.node.*;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public class EvaluateExpressionVisitor extends AstVisitor<Double> {
    @Override
    public Double visit(AdditionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return visit(node.getLeft()) + visit(node.getRight());
    }

    @Override
    public Double visit(SubtractionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return visit(node.getLeft()) - visit(node.getRight());
    }

    @Override
    public Double visit(MultiplicationNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return visit(node.getLeft()) * visit(node.getRight());
    }

    @Override
    public Double visit(PowNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return Math.pow(visit(node.getLeft()), visit(node.getRight()));
    }

    @Override
    public Double visit(DivisionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return visit(node.getLeft()) / visit(node.getRight());
    }

    @Override
    public Double visit(ParenthesisNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return visit(node.getInnerNode());
    }

    @Override
    public Double visit(NegateNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return -visit(node.getInnerNode());
    }

    @Override
    public Double visit(FunctionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return (Double) node.getFunction().invoke(null, visit(node.getArgument()));
    }

    @Override
    public Double visit(NumberNode node) {
        return node.getValue();
    }
}
