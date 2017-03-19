package sk.host.arabasso.bassolve.core.ast.node;

import sk.host.arabasso.bassolve.core.MathEx;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public class DivisionNode extends InfixExpressionNode {
    public DivisionNode(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }

//    @Override
//    public double execute(double left, double right) {
//        return left / right;
//    }

    @Override
    public ExpressionNode newInstance(ExpressionNode left, ExpressionNode right) {
        return new DivisionNode(left, right);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return newInstance(getLeft(), getRight());
    }

//    @Override
//    protected ExpressionNode simplify(NumberNode left, NumberNode right){
//        double leftValue = left.getValue();
//        double rightValue = right.getValue();
//
//        if (leftValue % rightValue == 0.0){
//            return new NumberNode(execute(leftValue, rightValue));
//        }
//
//        double gdc = MathEx.greatestCommonDivisor(leftValue, rightValue);
//
//        if (gdc == 1.0 || Math.floor(leftValue) - leftValue != 0.0 || Math.floor(rightValue) - rightValue != 0.0){
//            return new NumberNode(execute(leftValue, rightValue));
//        }
//
//        ExpressionNode gdcNode = new NumberNode(gdc);
//
//        ExpressionNode newLeftNode = new DivisionNode(left, gdcNode);
//        ExpressionNode newRightNode = new DivisionNode(right, gdcNode);
//
//        return new DivisionNode(new ParenthesisNode(newLeftNode), new ParenthesisNode(newRightNode));
//    }
//
//    @Override
//    protected ExpressionNode simplify(InfixExpressionNode node, NumberNode left, DivisionNode right) {
//        NumberNode numerator = (NumberNode) right.getLeft();
//        NumberNode divisor = (NumberNode) right.getRight();
//
//        if (numerator.getValue() % divisor.getValue() == 0.0){
//            ExpressionNode newRightNode = new NumberNode(right.execute(numerator.getValue(), divisor.getValue()));
//
//            return new DivisionNode(left, newRightNode);
//        }
//
//        ExpressionNode newNode = new MultiplicationNode(divisor, left);
//
//        return new DivisionNode(numerator, new ParenthesisNode(newNode));
//    }
//
//    @Override
//    protected ExpressionNode simplify(InfixExpressionNode node, DivisionNode left, NumberNode right) {
//        NumberNode numerator = (NumberNode) left.getLeft();
//        NumberNode divisor = (NumberNode) left.getRight();
//
//        if (numerator.getValue() % divisor.getValue() == 0.0){
//            ExpressionNode newLeftNode = new NumberNode(left.execute(numerator.getValue(), divisor.getValue()));
//
//            return new DivisionNode(newLeftNode, right);
//        }
//
//        ExpressionNode newNode = new MultiplicationNode(divisor, right);
//
//        return new DivisionNode(numerator, new ParenthesisNode(newNode));
//    }
//
//    @Override
//    protected ExpressionNode simplify(InfixExpressionNode node, DivisionNode left, DivisionNode right) {
//        NumberNode leftNumerator = (NumberNode) left.getLeft();
//        NumberNode leftDivisor = (NumberNode) left.getRight();
//
//        if (leftNumerator.getValue() % leftDivisor.getValue() == 0.0){
//            ExpressionNode newLeftNode = new NumberNode(left.execute(leftNumerator.getValue(), leftDivisor.getValue()));
//
//            return new DivisionNode(newLeftNode, new ParenthesisNode(right));
//        }
//
//        NumberNode rightNumerator = (NumberNode) right.getLeft();
//        NumberNode rightDivisor = (NumberNode) right.getRight();
//
//        ExpressionNode newLeftNode = new MultiplicationNode(leftNumerator, rightDivisor);
//        ExpressionNode newRightNode = new MultiplicationNode(leftDivisor, rightNumerator);
//
//        return new DivisionNode(new ParenthesisNode(newLeftNode), new ParenthesisNode(newRightNode));
//    }
}
