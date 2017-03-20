package sk.host.arabasso.bassolve.core;

import sk.host.arabasso.bassolve.core.ast.node.ExpressionNode;

/**
 * Created by arabasso on 19/03/2017.
 *
 */
public class HeuristicExpression {

    public boolean isApplicable(ExpressionNode node) {
        return false;
    }

    public ExpressionNode apply(ExpressionNode node) {
        return node;
    }
}
