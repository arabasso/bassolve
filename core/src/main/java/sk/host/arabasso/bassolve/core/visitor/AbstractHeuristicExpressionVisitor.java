package sk.host.arabasso.bassolve.core.visitor;

import sk.host.arabasso.bassolve.core.ast.node.ExpressionNode;

import java.lang.reflect.ParameterizedType;

/**
 * Created by arabasso on 20/03/2017.
 */
public abstract class AbstractHeuristicExpressionVisitor<T> extends HeuristicExpressionVisitor {

    @Override
    public boolean isApplicable(
            ExpressionNode node) {

        Class clazz = (Class) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

        if (!clazz.isInstance(node)) return false;

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
