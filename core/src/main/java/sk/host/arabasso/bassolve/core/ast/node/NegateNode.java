package sk.host.arabasso.bassolve.core.ast.node;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public class NegateNode extends ExpressionNode {
    private ExpressionNode innerNode;

    public NegateNode(ExpressionNode innerNode) {
        this.innerNode = innerNode;
    }

    public ExpressionNode getInnerNode() {
        return innerNode;
    }

    public boolean isNumberInnerNode(){
        return innerNode instanceof NumberNode;
    }

    public NumberNode getInnerNodeAsNumber() {
        return (NumberNode) innerNode;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new NegateNode(getInnerNode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NegateNode that = (NegateNode) o;

        return innerNode.equals(that.innerNode);
    }

    @Override
    public int hashCode() {
        int result = getClass().hashCode();
        result = 31 * result + innerNode.hashCode();
        return result;
    }

    @Override
    public int typeHashCode() {
        int result = getClass().hashCode();
        result = 31 * result + innerNode.typeHashCode();
        return result;
    }
}
