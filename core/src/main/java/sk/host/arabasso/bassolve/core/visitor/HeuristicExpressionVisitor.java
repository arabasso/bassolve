package sk.host.arabasso.bassolve.core.visitor;

import sk.host.arabasso.bassolve.core.HeuristicExpression;
import sk.host.arabasso.bassolve.core.ast.node.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by arabasso on 19/03/2017.
 *
 */
public class HeuristicExpressionVisitor extends AstVisitor<ExpressionNode> {

    private List<HeuristicExpression> heuristics = new ArrayList<>();

    public void addHeuristic(HeuristicExpression heuristic){
        heuristics.add(heuristic);
    }

    @Override
    public ExpressionNode visit(ExpressionNode node) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return super.visit(node);
    }

    @Override
    public ExpressionNode visit(AdditionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return node.newInstance(visit(node.getLeft()), visit(node.getRight()));
    }

    @Override
    public ExpressionNode visit(SubtractionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return node.newInstance(visit(node.getLeft()), visit(node.getRight()));
    }

    @Override
    public ExpressionNode visit(MultiplicationNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return node.newInstance(visit(node.getLeft()), visit(node.getRight()));
    }

    @Override
    public ExpressionNode visit(PowNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return node.newInstance(visit(node.getLeft()), visit(node.getRight()));
    }

    @Override
    public ExpressionNode visit(DivisionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return node.newInstance(visit(node.getLeft()), visit(node.getRight()));
    }

    @Override
    public ExpressionNode visit(NegateNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return new NegateNode(visit(node.getInnerNode()));
    }

    @Override
    public ExpressionNode visit(FunctionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return new FunctionNode(node.getFunction(), visit(node.getArgument()));
    }

    @Override
    public ExpressionNode visit(ParenthesisNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return new ParenthesisNode(visit(node.getInnerNode()));
    }

    @Override
    public ExpressionNode visit(NumberNode node) {
        return node;
    }
}
