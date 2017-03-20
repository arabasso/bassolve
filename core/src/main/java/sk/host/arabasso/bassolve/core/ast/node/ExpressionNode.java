package sk.host.arabasso.bassolve.core.ast.node;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public abstract class ExpressionNode implements Cloneable {
    public int typeHashCode() {
        return getClass().hashCode();
    }
}
