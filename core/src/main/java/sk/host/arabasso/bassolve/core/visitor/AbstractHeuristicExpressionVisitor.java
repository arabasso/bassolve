package sk.host.arabasso.bassolve.core.visitor;

import sk.host.arabasso.bassolve.core.ast.node.ExpressionNode;

/**
 * Created by arabasso on 20/03/2017.
 */
public abstract class AbstractHeuristicExpressionVisitor<T> extends HeuristicExpressionVisitor {

    private Class classNode;

    protected AbstractHeuristicExpressionVisitor(Class classNode){
        this.classNode = classNode;
    }

    @Override
    public boolean isApplicable(
            ExpressionNode node) {

        if (!classNode.isInstance(node)) return false;

        return isApplicable((T) node);
    }

    public abstract boolean isApplicable(
            T node);

    @Override
    public ExpressionNode apply(
            ExpressionNode node) {

        return apply((T) node);
    }

    public abstract ExpressionNode apply(
            T node);
}
