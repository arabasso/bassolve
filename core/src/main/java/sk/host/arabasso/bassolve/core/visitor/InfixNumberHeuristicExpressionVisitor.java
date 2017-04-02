package sk.host.arabasso.bassolve.core.visitor;

import sk.host.arabasso.bassolve.core.ast.node.ExpressionNode;
import sk.host.arabasso.bassolve.core.ast.node.InfixExpressionNode;
import sk.host.arabasso.bassolve.core.ast.node.NumberNode;

/**
 * Created by arabasso on 20/03/2017.
 */
public abstract class InfixNumberHeuristicExpressionVisitor<T extends InfixExpressionNode> extends AbstractHeuristicExpressionVisitor<T> {
    protected InfixNumberHeuristicExpressionVisitor(Class classNode) {
        super(classNode);
    }

    @Override
    public boolean isApplicable(T node) {
        return node.isNumberLeftAndRight();
    }

    @Override
    public ExpressionNode apply(T node) {
        NumberNode nl = node.getLeftAsNumber();
        NumberNode nr = node.getRightAsNumber();

        return new NumberNode(apply(nl.getValue(), nr.getValue()));
    }

    public abstract double apply(double left, double right);
}
