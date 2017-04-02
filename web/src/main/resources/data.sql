SELECT 1;
INSERT INTO user (username, password, enabled) VALUES ('admin', 'admin', 1);
INSERT INTO user (username, password, enabled) VALUES ('arabasso', '123', 1);
INSERT INTO user (username, password, enabled) VALUES ('raphael', '456', 0);
INSERT INTO role (name, user_id) VALUES ('ROLE_ADMIN', 1);
INSERT INTO role (name, user_id) VALUES ('ROLE_USER', 2);
INSERT INTO role (name, user_id) VALUES ('ROLE_USER', 3);
INSERT INTO heuristic (name, date, source) VALUES ('Equality', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.ast.node.*
import sk.host.arabasso.bassolve.core.visitor.*

/**
 * Created by arabasso on 20/03/2017.
 */
@groovy.transform.TypeChecked
class EqualityHeuristicVisitor extends InfixHeuristicExpressionVisitor<EqualityNode> {
    public EqualityHeuristicVisitor() {
        super(EqualityNode.class)
    }

    @Override
    ExpressionNode apply(ExpressionNode left, ExpressionNode right) {
        NumberNode n1 = (NumberNode)left
        NumberNode n2 = (NumberNode)right

        return new BooleanNode(Double.compare(n1.getValue(), n2.getValue()) == 0);
    }
}');
INSERT INTO heuristic (name, date, source) VALUES ('Addition', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.ast.node.*
import sk.host.arabasso.bassolve.core.visitor.*

/**
 * Created by arabasso on 20/03/2017.
 */
@groovy.transform.TypeChecked
class AdditionHeuristicVisitor extends InfixNumberHeuristicExpressionVisitor<AdditionNode> {
    public AdditionHeuristicVisitor() {
        super(AdditionNode.class)
    }

    @Override
    double apply(double left, double right) {
        return left + right
    }
}');
INSERT INTO heuristic (name, date, source) VALUES ('Subtraction', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.ast.node.*
import sk.host.arabasso.bassolve.core.visitor.*

/**
 * Created by arabasso on 20/03/2017.
 */
@groovy.transform.TypeChecked
class SubtractionHeuristicVisitor extends InfixNumberHeuristicExpressionVisitor<SubtractionNode> {
    public SubtractionHeuristicVisitor() {
        super(SubtractionNode.class)
    }

    @Override
    double apply(double left, double right) {
        return left - right
    }
}');
INSERT INTO heuristic (name, date, source) VALUES ('Multiplication', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.ast.node.*
import sk.host.arabasso.bassolve.core.visitor.*

/**
 * Created by arabasso on 20/03/2017.
 */
@groovy.transform.TypeChecked
class MultiplicationHeuristicVisitor extends InfixNumberHeuristicExpressionVisitor<MultiplicationNode> {
    public MultiplicationHeuristicVisitor() {
        super(MultiplicationNode.class)
    }

    @Override
    double apply(double left, double right) {
        return left * right
    }
}');
INSERT INTO heuristic (name, date, source) VALUES ('Pow', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.ast.node.*
import sk.host.arabasso.bassolve.core.visitor.*

/**
 * Created by arabasso on 20/03/2017.
 */
@groovy.transform.TypeChecked
class PowHeuristicVisitor extends InfixNumberHeuristicExpressionVisitor<PowNode> {
    public PowHeuristicVisitor() {
        super(PowNode.class)
    }

    @Override
    double apply(double left, double right) {
        return Math.pow(left, right)
    }
}');
INSERT INTO heuristic (name, date, source) VALUES ('Division', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.ast.node.*
import sk.host.arabasso.bassolve.core.visitor.*

/**
 * Created by arabasso on 20/03/2017.
 */
@groovy.transform.TypeChecked
class DivisionHeuristicVisitor extends InfixNumberHeuristicExpressionVisitor<DivisionNode> {
    public DivisionHeuristicVisitor() {
        super(DivisionNode.class)
    }

    @Override
    double apply(double left, double right) {
        return left / right
    }
}');
INSERT INTO heuristic (name, date, source) VALUES ('Cos', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.ast.node.*
import sk.host.arabasso.bassolve.core.visitor.*

/**
 * Created by arabasso on 20/03/2017.
 */
@groovy.transform.TypeChecked
class CosHeuristicVisitor extends FunctionHeuristicExpressionVisitor {
    public CosHeuristicVisitor() {
        super("cos");
    }

    @Override
    double apply(double argument) {
        return Math.cos(argument);
    }
}');
INSERT INTO heuristic (name, date, source) VALUES ('Tan', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.ast.node.*
import sk.host.arabasso.bassolve.core.visitor.*

/**
 * Created by arabasso on 20/03/2017.
 */
@groovy.transform.TypeChecked
class TanHeuristicVisitor extends FunctionHeuristicExpressionVisitor {
    public TanHeuristicVisitor() {
        super("tan");
    }

    @Override
    double apply(double argument) {
        return Math.tan(argument);
    }
}');
INSERT INTO heuristic (name, date, source) VALUES ('Sin', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.ast.node.*
import sk.host.arabasso.bassolve.core.visitor.*

/**
 * Created by arabasso on 20/03/2017.
 */
@groovy.transform.TypeChecked
class SinHeuristicVisitor extends FunctionHeuristicExpressionVisitor {
    public SinHeuristicVisitor() {
        super("sin");
    }

    @Override
    double apply(double argument) {
        return Math.sin(argument);
    }
}');
INSERT INTO heuristic (name, date, source) VALUES ('Parenthesis', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.ast.node.*
import sk.host.arabasso.bassolve.core.visitor.*

/**
 * Created by arabasso on 20/03/2017.
 */
@groovy.transform.TypeChecked
class ParenthesisHeuristicVisitor extends AbstractHeuristicExpressionVisitor<ParenthesisNode> {
    public ParenthesisHeuristicVisitor() {
        super(ParenthesisNode.class);
    }

    @Override
    boolean isApplicable(ParenthesisNode node) {
        return node.isNumberInnerNode()
    }

    @Override
    ExpressionNode apply(ParenthesisNode node) {
        return node.getInnerNode()
    }
}');
INSERT INTO heuristic (name, date, source) VALUES ('Negate', CURRENT_DATE(), 'import sk.host.arabasso.bassolve.core.ast.node.*
import sk.host.arabasso.bassolve.core.visitor.*

/**
 * Created by arabasso on 20/03/2017.
 */
@groovy.transform.TypeChecked
class ParenthesisHeuristicVisitor extends AbstractHeuristicExpressionVisitor<NegateNode> {
    public ParenthesisHeuristicVisitor() {
        super(NegateNode.class);
    }

    @Override
    boolean isApplicable(NegateNode node) {
        return node.isNumberInnerNode()
    }

    @Override
    ExpressionNode apply(NegateNode node) {
        NumberNode n = node.getInnerNodeAsNumber()

        return new NumberNode(-n.getValue());
    }
}');