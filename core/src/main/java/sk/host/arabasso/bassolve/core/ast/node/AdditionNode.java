package sk.host.arabasso.bassolve.core.ast.node;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public class AdditionNode extends InfixExpressionNode {
    public AdditionNode(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }

//    @Override
//    public double execute(double left, double right) {
//        return left + right;
//    }

    @Override
    public ExpressionNode newInstance(ExpressionNode left, ExpressionNode right) {
        return new AdditionNode(left, right);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return newInstance(getLeft(), getRight());
    }

//    @Override
//    public ExpressionNode simplify(NumberNode left, NumberNode right) {
//        return new NumberNode(left.getValue() + right.getValue());
//    }
}
