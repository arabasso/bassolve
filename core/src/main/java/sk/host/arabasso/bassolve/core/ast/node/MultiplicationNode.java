package sk.host.arabasso.bassolve.core.ast.node;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public class MultiplicationNode extends InfixExpressionNode {
    public MultiplicationNode(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }

//    @Override
//    public double execute(double left, double right) {
//        return left * right;
//    }

    @Override
    public ExpressionNode newInstance(ExpressionNode left, ExpressionNode right) {
        return new MultiplicationNode(left, right);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return newInstance(getLeft(), getRight());
    }

//    @Override
//    protected ExpressionNode simplify(InfixExpressionNode node, NumberNode left, DivisionNode right) {
//        NumberNode numerator = (NumberNode) right.getLeft();
//        NumberNode divisor = (NumberNode) right.getRight();
//
//        if (numerator.getValue() % divisor.getValue() == 0.0){
//            return newInstance(left, new NumberNode(right.execute(numerator.getValue(), divisor.getValue())));
//        }
//
//        ExpressionNode newNode = node.newInstance(left, numerator);
//
//        return new DivisionNode(new ParenthesisNode(newNode), divisor);
//    }
//
//    @Override
//    protected ExpressionNode simplify(InfixExpressionNode node, DivisionNode left, NumberNode right) {
//        NumberNode numerator = (NumberNode) left.getLeft();
//        NumberNode divisor = (NumberNode) left.getRight();
//
//        if (numerator.getValue() % divisor.getValue() == 0.0){
//            return newInstance(new NumberNode(left.execute(numerator.getValue(), divisor.getValue())), right);
//        }
//
//        ExpressionNode newNode = node.newInstance(numerator, right);
//
//        return new DivisionNode(new ParenthesisNode(newNode), divisor);
//    }
//
//    @Override
//    protected ExpressionNode simplify(InfixExpressionNode node, DivisionNode left, DivisionNode right) {
//        NumberNode leftNumerator = (NumberNode) left.getLeft();
//        NumberNode leftDivisor = (NumberNode) left.getRight();
//
//        NumberNode rightNumerator = (NumberNode) right.getLeft();
//        NumberNode rightDivisor = (NumberNode) right.getRight();
//
//        ExpressionNode newLeftNode = node.newInstance(leftNumerator, rightNumerator);
//        ExpressionNode newRightNode = node.newInstance(leftDivisor, rightDivisor);
//
//        return new DivisionNode(new ParenthesisNode(newLeftNode), new ParenthesisNode(newRightNode));
//    }
}
