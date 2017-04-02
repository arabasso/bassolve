package sk.host.arabasso.bassolve.core.ast.node;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public class BooleanNode extends ExpressionNode {
    private boolean value;

    public BooleanNode(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new BooleanNode(getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BooleanNode that = (BooleanNode) o;

        return value == that.value;
    }

    @Override
    public int hashCode() {
        return (value ? 1 : 0);
    }

    @Override
    public int typeHashCode() {
        return getClass().hashCode();
    }
}
