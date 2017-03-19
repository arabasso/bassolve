package sk.host.arabasso.bassolve.core.ast.node;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public class PowNode extends InfixExpressionNode {
    public PowNode(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }

//    @Override
//    public double execute(double left, double right) {
//        return Math.pow(left, right);
//    }

    @Override
    public ExpressionNode newInstance(ExpressionNode left, ExpressionNode right) {
        return new PowNode(left, right);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return newInstance(getLeft(), getRight());
    }
}
