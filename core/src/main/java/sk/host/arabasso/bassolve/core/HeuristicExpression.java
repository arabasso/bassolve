package sk.host.arabasso.bassolve.core;

import sk.host.arabasso.bassolve.core.ast.node.ExpressionNode;

/**
 * Created by arabasso on 19/03/2017.
 *
 */
public interface HeuristicExpression {

    boolean isApplicable(ExpressionNode node);
    ExpressionNode  apply(ExpressionNode node);
}
