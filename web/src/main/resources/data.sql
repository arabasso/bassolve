SELECT 1;
INSERT INTO user (username, password, enabled) VALUES ('admin', 'admin', 1);
INSERT INTO user (username, password, enabled) VALUES ('arabasso', '123', 1);
INSERT INTO user (username, password, enabled) VALUES ('raphael', '456', 0);
INSERT INTO role (name, user_id) VALUES ('ROLE_ADMIN', 1);
INSERT INTO role (name, user_id) VALUES ('ROLE_USER', 2);
INSERT INTO role (name, user_id) VALUES ('ROLE_USER', 3);
INSERT INTO heuristic (name, date, source) VALUES ('Addition', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.AbstractHeuristicExpression
import sk.host.arabasso.bassolve.core.ast.node.*

/**
 * Created by arabasso on 19/03/2017.
 */
class AdditionHeuristic
        extends AbstractHeuristicExpression<AdditionNode> {

    @Override
    boolean isApplicable(AdditionNode node) {
        return node.getLeft() instanceof NumberNode && node.getRight() instanceof NumberNode;
    }

    @Override
    ExpressionNode apply(AdditionNode node) {
        NumberNode nl = (NumberNode) node.getLeft();
        NumberNode nr = (NumberNode) node.getRight();

        return new NumberNode(nl.getValue() + nr.getValue());
    }
}');
INSERT INTO heuristic (name,date,source) VALUES ('Subtraction', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.AbstractHeuristicExpression
import sk.host.arabasso.bassolve.core.ast.node.*

/**
 * Created by arabasso on 19/03/2017.
 */
class SubtractionHeuristic
        extends AbstractHeuristicExpression<SubtractionNode> {

    @Override
    boolean isApplicable(SubtractionNode node) {
        return node.getLeft() instanceof NumberNode && node.getRight() instanceof NumberNode
    }

    @Override
    ExpressionNode apply(SubtractionNode node) {
        NumberNode nl = (NumberNode) node.getLeft();
        NumberNode nr = (NumberNode) node.getRight();

        return new NumberNode(nl.getValue() - nr.getValue())
    }
}
');

INSERT INTO heuristic (name,date,source) VALUES ('Parenthesis', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.AbstractHeuristicExpression
import sk.host.arabasso.bassolve.core.ast.node.*

/**
 * Created by arabasso on 19/03/2017.
 */
class SubtractionHeuristic extends AbstractHeuristicExpression<ParenthesisNode> {

    @Override
    boolean isApplicable(ParenthesisNode node) {
        return node.getInnerNode() instanceof NumberNode
    }

    @Override
    ExpressionNode apply(ParenthesisNode node) {
        return node.getInnerNode()
    }
}');