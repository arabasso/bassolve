package sk.host.arabasso.bassolve.core.ast.node;

import sk.host.arabasso.bassolve.core.MathEx;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public abstract class InfixExpressionNode extends ExpressionNode  {
    private ExpressionNode left;
    private ExpressionNode right;

    public InfixExpressionNode(ExpressionNode left, ExpressionNode right) {
        this.left = left;
        this.right = right;
    }

//    public abstract double execute(double left, double right);

    public ExpressionNode getLeft() {
        return left;
    }

    public ExpressionNode getRight() {
        return right;
    }

    public abstract ExpressionNode newInstance(ExpressionNode left, ExpressionNode right);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InfixExpressionNode that = (InfixExpressionNode) o;

        if (!left.equals(that.left)) return false;
        return right.equals(that.right);
    }

    @Override
    public int hashCode() {
        int result = getClass().hashCode();
        result = 31 * result + left.hashCode();
        result = 31 * result + right.hashCode();
        return result;
    }

    @Override
    public int typeHashCode() {
        int result = getClass().hashCode();
        result = 31 * result + left.typeHashCode();
        result = 31 * result + right.typeHashCode();
        return result;
    }

    //    public ExpressionNode simplify(){
//        ExpressionNode leftNode = getExpressionWithoutParenthesis(left);
//        ExpressionNode rightNode = getExpressionWithoutParenthesis(right);
//
//        if (isNumberLeftAndRight()){
//            return simplify((NumberNode)leftNode, (NumberNode)rightNode);
//        }
//
//        if (isNumberAndDivisionNumber(leftNode, rightNode)){
//            return simplify(this, (NumberNode) leftNode, (DivisionNode)rightNode);
//        }
//
//        if (isNumberAndDivisionNumber(rightNode, leftNode)){
//            return simplify(this, (DivisionNode)leftNode, (NumberNode) rightNode);
//        }
//
//
//        if (leftNode instanceof DivisionNode && rightNode instanceof DivisionNode) {
//            return simplify(this, (DivisionNode) leftNode, (DivisionNode) rightNode);
//        }
//
//        return this;
//    }
//
//    protected ExpressionNode simplify(InfixExpressionNode node, DivisionNode left, DivisionNode right) {
//        NumberNode leftNumerator = (NumberNode) left.getLeft();
//        NumberNode leftDivisor = (NumberNode) left.getRight();
//
//        if (leftNumerator.getValue() % leftDivisor.getValue() == 0.0){
//            ExpressionNode newLeftNode = new NumberNode(leftNumerator.getValue() / leftDivisor.getValue());
//
//            return node.newInstance(newLeftNode, new ParenthesisNode(right));
//        }
//
//        NumberNode rightNumerator = (NumberNode) right.getLeft();
//        NumberNode rightDivisor = (NumberNode) right.getRight();
//
//        if (rightNumerator.getValue() % rightDivisor.getValue() == 0.0){
//            ExpressionNode newRightNode = new NumberNode(rightNumerator.getValue() / rightDivisor.getValue());
//
//            return node.newInstance(new ParenthesisNode(left), newRightNode);
//        }
//
//        if (leftDivisor.getValue() == rightDivisor.getValue()){
//            ExpressionNode newNode = node.newInstance(leftNumerator, rightNumerator);
//
//            return new DivisionNode(new ParenthesisNode(newNode), leftDivisor);
//        }
//
//        double leftDivisorValue = leftDivisor.getValue();
//        double rightDivisorValue = rightDivisor.getValue();
//
//        double minimum = MathEx.leastCommonMultiple(leftDivisorValue, rightDivisorValue);
//
//        NumberNode divisor = new NumberNode(minimum);
//
//        ExpressionNode newLeftNode = new MultiplicationNode(leftNumerator, new NumberNode(minimum / leftDivisorValue));
//        ExpressionNode newRightNode = new MultiplicationNode(rightNumerator, new NumberNode(minimum / rightDivisorValue));
//
//        ExpressionNode newNode = node.newInstance(newLeftNode, newRightNode);
//
//        return new DivisionNode(new ParenthesisNode(newNode), divisor);
//    }
//
//    protected ExpressionNode simplify(NumberNode left, NumberNode right){
//        return new NumberNode(execute(left.getValue(), right.getValue()));
//    }
//
//    protected ExpressionNode simplify(InfixExpressionNode node, NumberNode left, DivisionNode right){
//        NumberNode numerator = (NumberNode) right.getLeft();
//        NumberNode divisor = (NumberNode) right.getRight();
//
//        if (numerator.getValue() % divisor.getValue() == 0.0){
//            NumberNode rightNumber = new NumberNode(right.execute(numerator.getValue(), divisor.getValue()));
//
//            return node.newInstance(left, rightNumber);
//        }
//
//        ExpressionNode newNode = node.newInstance(new MultiplicationNode(left, divisor), numerator);
//
//        return new DivisionNode(new ParenthesisNode(newNode), divisor);
//    }
//
//    protected ExpressionNode simplify(InfixExpressionNode node, DivisionNode left, NumberNode right){
//        NumberNode numerator = (NumberNode) left.getLeft();
//        NumberNode divisor = (NumberNode) left.getRight();
//
//        if (numerator.getValue() % divisor.getValue() == 0.0){
//            NumberNode leftNumber = new NumberNode(left.execute(numerator.getValue(), divisor.getValue()));
//
//            return node.newInstance(leftNumber, right);
//        }
//
//        ExpressionNode newNode = node.newInstance(numerator, new MultiplicationNode(right, divisor));
//
//        return new DivisionNode(new ParenthesisNode(newNode), divisor);
//    }
//
//    public boolean isNumberLeftAndRight() {
//        ExpressionNode leftNode = getExpressionWithoutParenthesis(left);
//        ExpressionNode rightNode = getExpressionWithoutParenthesis(right);
//
//        return leftNode instanceof NumberNode && rightNode instanceof NumberNode;
//    }
//
//    private ExpressionNode getExpressionWithoutParenthesis(ExpressionNode node) {
//        while(node instanceof ParenthesisNode){
//            node = ((ParenthesisNode)node).getInnerNode();
//        }
//
//        return node;
//    }
//
//    public boolean canSimplify() {
//        if (isNumberLeftAndRight()){
//            return true;
//        }
//
//        if (isNumberAndDivisionNumber(left, right) || isNumberAndDivisionNumber(right, left)) {
//            return true;
//        }
//
//        ExpressionNode leftNode = getExpressionWithoutParenthesis(left);
//        ExpressionNode rightNode = getExpressionWithoutParenthesis(right);
//
//        if (leftNode instanceof DivisionNode && rightNode instanceof DivisionNode){
//            DivisionNode leftDivisionNode = (DivisionNode) leftNode;
//            DivisionNode rightDivisionNode = (DivisionNode) rightNode;
//
//            return leftDivisionNode.isNumberLeftAndRight() && rightDivisionNode.isNumberLeftAndRight();
//        }
//
//        return false;
//    }
//
//    public boolean isNumberAndDivisionNumber(ExpressionNode left, ExpressionNode right) {
//        ExpressionNode leftNode = getExpressionWithoutParenthesis(left);
//        ExpressionNode rightNode = getExpressionWithoutParenthesis(right);
//
//        if (leftNode instanceof NumberNode && rightNode instanceof DivisionNode){
//            DivisionNode rightDivisionNode = (DivisionNode) rightNode;
//
//            if (rightDivisionNode.isNumberLeftAndRight()){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public double resolve() {
//        if (!isNumberLeftAndRight()){
//            throw new UnsupportedOperationException();
//        }
//
//        return execute(((NumberNode)left).getValue(), ((NumberNode)right).getValue());
//    }
}
