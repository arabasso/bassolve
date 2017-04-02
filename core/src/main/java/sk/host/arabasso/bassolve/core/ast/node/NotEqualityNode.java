package sk.host.arabasso.bassolve.core.ast.node;

/**
 * Created by arabasso on 26/03/2017.
 *
 */
public class NotEqualityNode extends InfixExpressionNode {
    public NotEqualityNode(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }

    @Override
    public ExpressionNode newInstance(ExpressionNode left, ExpressionNode right) {
        return new sk.host.arabasso.bassolve.core.ast.node.NotEqualityNode(left, right);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return newInstance(getLeft(), getRight());
    }
}
