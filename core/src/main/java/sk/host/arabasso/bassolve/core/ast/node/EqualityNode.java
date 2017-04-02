package sk.host.arabasso.bassolve.core.ast.node;

/**
 * Created by arabasso on 26/03/2017.
 *
 */
public class EqualityNode extends InfixExpressionNode {
    public EqualityNode(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }

    @Override
    public ExpressionNode newInstance(ExpressionNode left, ExpressionNode right) {
        return new sk.host.arabasso.bassolve.core.ast.node.EqualityNode(left, right);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return newInstance(getLeft(), getRight());
    }
}
