import sk.host.arabasso.bassolve.core.AbstractHeuristicExpression
import sk.host.arabasso.bassolve.core.ast.node.*

/**
 * Created by arabasso on 19/03/2017.
 */
class SubtractionHeuristic extends AbstractHeuristicExpression<ExpressionNode> {

    @Override
    boolean isApplicable(ExpressionNode node) {
        return false
    }

    @Override
    ExpressionNode apply(ExpressionNode node) {
        return node
    }
}
