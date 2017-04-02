package sk.host.arabasso.bassolve.core.visitor;

import sk.host.arabasso.bassolve.core.ast.node.ExpressionNode;
import sk.host.arabasso.bassolve.core.ast.node.InfixExpressionNode;
import sk.host.arabasso.bassolve.core.ast.node.NumberNode;

/**
 * Created by arabasso on 20/03/2017.
 */
public abstract class InfixHeuristicExpressionVisitor<T extends InfixExpressionNode> extends AbstractHeuristicExpressionVisitor<T> {
    protected InfixHeuristicExpressionVisitor(Class classNode) {
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

        return apply(nl, nr);
    }

    public abstract ExpressionNode apply(ExpressionNode left, ExpressionNode right);
}
