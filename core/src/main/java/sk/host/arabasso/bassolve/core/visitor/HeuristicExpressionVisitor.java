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

    public void addHeuristicExpression(HeuristicExpression heuristicExpressions){
        heuristics.add(heuristicExpressions);
    }

    public void addHeuristicExpressions(List<HeuristicExpression> heuristicExpressions){
        heuristics.addAll(heuristicExpressions);
    }

    @Override
    public ExpressionNode visit(ExpressionNode node) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return super.visit(node);
    }

    @Override
    public ExpressionNode visit(AdditionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ExpressionNode he = apply(node);

        return (he != null)
                ? he
                : node.newInstance(visit(node.getLeft()), visit(node.getRight()));
    }

    private ExpressionNode apply(ExpressionNode node) {
        for (HeuristicExpression he :
                heuristics) {
            if (he.isApplicable(node)){
                return he.apply(node);
            }
        }
        return null;
    }

    @Override
    public ExpressionNode visit(SubtractionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ExpressionNode he = apply(node);

        return (he != null)
                ? he
                : node.newInstance(visit(node.getLeft()), visit(node.getRight()));
    }

    @Override
    public ExpressionNode visit(MultiplicationNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ExpressionNode he = apply(node);

        return (he != null)
                ? he
                : node.newInstance(visit(node.getLeft()), visit(node.getRight()));
    }

    @Override
    public ExpressionNode visit(PowNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ExpressionNode he = apply(node);

        return (he != null)
                ? he
                : node.newInstance(visit(node.getLeft()), visit(node.getRight()));
    }

    @Override
    public ExpressionNode visit(DivisionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ExpressionNode he = apply(node);

        return (he != null)
                ? he
                : node.newInstance(visit(node.getLeft()), visit(node.getRight()));
    }

    @Override
    public ExpressionNode visit(NegateNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ExpressionNode he = apply(node);

        return (he != null)
                ? he
                : new NegateNode(visit(node.getInnerNode()));
    }

    @Override
    public ExpressionNode visit(FunctionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ExpressionNode he = apply(node);

        return (he != null)
                ? he
                : new FunctionNode(node.getFunction(), visit(node.getArgument()));
    }

    @Override
    public ExpressionNode visit(ParenthesisNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ExpressionNode he = apply(node);

        return (he != null)
                ? he
                : new ParenthesisNode(visit(node.getInnerNode()));
    }

    @Override
    public ExpressionNode visit(NumberNode node) {
        return node;
    }
}
