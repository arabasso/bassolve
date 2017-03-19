package sk.host.arabasso.bassolve.core;

import org.junit.Test;
import sk.host.arabasso.bassolve.core.ast.node.AdditionNode;
import sk.host.arabasso.bassolve.core.ast.node.ExpressionNode;
import sk.host.arabasso.bassolve.core.ast.node.NumberNode;
import sk.host.arabasso.bassolve.core.ast.node.SubtractionNode;
import sk.host.arabasso.bassolve.core.visitor.HeuristicExpressionVisitor;

import java.lang.reflect.InvocationTargetException;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by arabasso on 19/03/2017.
 *
 */
public class HeuristicExpressionVisitorTests
        extends ExpressionTests {

    @Test
    public void additionIsApplicable()
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        HeuristicExpressionVisitor visitor = new HeuristicExpressionVisitor();

        ExpressionNode node = add(10.0, 10.0);

        AdditionHeuristic heuristic = new AdditionHeuristic();

        visitor.addHeuristic(heuristic);

        ExpressionNode n = visitor.visit(node);

        assertThat(n, is(instanceOf(NumberNode.class)));
    }

    @Test
    public void additionIsNotApplicable()
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        HeuristicExpressionVisitor visitor = new HeuristicExpressionVisitor();

        ExpressionNode node = sub(10.0, 10.0);

        AdditionHeuristic heuristic = new AdditionHeuristic();

        visitor.addHeuristic(heuristic);

        ExpressionNode n = visitor.visit(node);

        assertThat(n, is(instanceOf(SubtractionNode.class)));
    }

    class AdditionHeuristic
            extends AbstractHeuristicExpression<AdditionNode> {

        @Override
        public boolean isApplicable(AdditionNode node) {
            return node.getLeft() instanceof NumberNode
                    && node.getRight() instanceof NumberNode;
        }

        @Override
        public ExpressionNode apply(AdditionNode node) {
            return new NumberNode(0.0);
        }

//        @Override
//        public boolean isApplicable(
//                ExpressionNode node) {
//
//            if (!(node instanceof AdditionNode)) return false;
//
//            AdditionNode additionNode = (AdditionNode)node;
//
//            return additionNode.getLeft() instanceof NumberNode
//                    && additionNode.getRight() instanceof NumberNode;
//        }
//
//        @Override
//        public ExpressionNode apply(
//                ExpressionNode node) {
//
//            return null;
//        }
    }
}
