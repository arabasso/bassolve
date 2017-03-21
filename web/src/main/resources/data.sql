SELECT 1;
INSERT INTO user (username, password, enabled) VALUES ('admin', 'admin', 1);
INSERT INTO user (username, password, enabled) VALUES ('arabasso', '123', 1);
INSERT INTO user (username, password, enabled) VALUES ('raphael', '456', 0);
INSERT INTO role (name, user_id) VALUES ('ROLE_ADMIN', 1);
INSERT INTO role (name, user_id) VALUES ('ROLE_USER', 2);
INSERT INTO role (name, user_id) VALUES ('ROLE_USER', 3);
INSERT INTO heuristic (name, date, source) VALUES ('Addition', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.ast.node.AdditionNode
import sk.host.arabasso.bassolve.core.ast.node.ExpressionNode
import sk.host.arabasso.bassolve.core.ast.node.NumberNode
import sk.host.arabasso.bassolve.core.visitor.AbstractHeuristicExpressionVisitor

/**
 * Created by arabasso on 20/03/2017.
 */
class AdditionHeuristicVisitor extends AbstractHeuristicExpressionVisitor<AdditionNode> {
    @Override
    boolean isApplicable(AdditionNode node) {
        return node.getLeft() instanceof NumberNode && node.getRight() instanceof NumberNode
    }

    @Override
    ExpressionNode apply(AdditionNode node) {
        NumberNode nl = (NumberNode) node.getLeft();
        NumberNode nr = (NumberNode) node.getRight();

        return new NumberNode(nl.getValue() + nr.getValue());
    }
}');
INSERT INTO heuristic (name, date, source) VALUES ('Subtraction', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.ast.node.*
import sk.host.arabasso.bassolve.core.visitor.AbstractHeuristicExpressionVisitor

/**
 * Created by arabasso on 20/03/2017.
 */
@groovy.transform.TypeChecked
class SubtractionHeuristicVisitor extends AbstractHeuristicExpressionVisitor<SubtractionNode> {
    @Override
    boolean isApplicable(SubtractionNode node) {
        return node.getLeft() instanceof NumberNode && node.getRight() instanceof NumberNode
    }

    @Override
    ExpressionNode apply(SubtractionNode node) {
        NumberNode nl = (NumberNode) node.getLeft();
        NumberNode nr = (NumberNode) node.getRight();

        return new NumberNode(nl.getValue() - nr.getValue());
    }
}');
INSERT INTO heuristic (name, date, source) VALUES ('Multiplication', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.ast.node.*
import sk.host.arabasso.bassolve.core.visitor.AbstractHeuristicExpressionVisitor

/**
 * Created by arabasso on 20/03/2017.
 */
@groovy.transform.TypeChecked
class MultiplicationHeuristicVisitor extends AbstractHeuristicExpressionVisitor<MultiplicationNode> {
    @Override
    boolean isApplicable(MultiplicationNode node) {
        return node.getLeft() instanceof NumberNode && node.getRight() instanceof NumberNode
    }

    @Override
    ExpressionNode apply(MultiplicationNode node) {
        NumberNode nl = (NumberNode) node.getLeft();
        NumberNode nr = (NumberNode) node.getRight();

        return new NumberNode(nl.getValue() * nr.getValue());
    }
}');
INSERT INTO heuristic (name, date, source) VALUES ('Sin', CURRENT_DATE(), 'import groovy.transform.TypeChecked
import sk.host.arabasso.bassolve.core.ast.node.*
import sk.host.arabasso.bassolve.core.visitor.AbstractHeuristicExpressionVisitor

/**
 * Created by arabasso on 20/03/2017.
 */
@groovy.transform.TypeChecked
class SinHeuristicVisitor extends AbstractHeuristicExpressionVisitor<FunctionNode> {
    @Override
    boolean isApplicable(FunctionNode node) {
        return node.getMethod() == "sin" && node.getArgument() instanceof NumberNode
    }

    @Override
    ExpressionNode apply(FunctionNode node) {
        NumberNode n = (NumberNode)node.getArgument()

        return new NumberNode(Math.sin(n.getValue()));
    }
}');