package sk.host.arabasso.bassolve.core.ast.node;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public class NumberNode extends ExpressionNode {
    private double value;

    public NumberNode(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new NumberNode(getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumberNode that = (NumberNode) o;

        return Double.compare(that.value, value) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }
}
