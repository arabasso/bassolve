package sk.host.arabasso.bassolve.core.ast.node;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public class SubtractionNode extends InfixExpressionNode {
    public SubtractionNode(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }

//    @Override
//    public double execute(double left, double right) {
//        return left - right;
//    }

    @Override
    public ExpressionNode newInstance(ExpressionNode left, ExpressionNode right) {
        return new SubtractionNode(left, right);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return newInstance(getLeft(), getRight());
    }
}
