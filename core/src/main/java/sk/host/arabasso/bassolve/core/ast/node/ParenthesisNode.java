package sk.host.arabasso.bassolve.core.ast.node;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public class ParenthesisNode extends ExpressionNode {
    private ExpressionNode innerNode;

    public ParenthesisNode(ExpressionNode innerNode) {
        this.innerNode = innerNode;
    }

    public ExpressionNode getInnerNode() {
        return innerNode;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new ParenthesisNode(getInnerNode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParenthesisNode that = (ParenthesisNode) o;

        return innerNode.equals(that.innerNode);
    }

    @Override
    public int hashCode() {
        return innerNode.hashCode();
    }
}
