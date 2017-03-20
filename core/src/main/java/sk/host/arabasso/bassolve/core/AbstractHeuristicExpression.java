package sk.host.arabasso.bassolve.core;

import sk.host.arabasso.bassolve.core.ast.node.ExpressionNode;

import java.lang.reflect.ParameterizedType;

/**
 * Created by arabasso on 19/03/2017.
 */
public abstract class AbstractHeuristicExpression<T>
        extends HeuristicExpression {

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
