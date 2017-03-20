package sk.host.arabasso.bassolve.core.ast.node;

import java.lang.reflect.Method;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public class FunctionNode extends ExpressionNode {
    private Method function;
    private ExpressionNode argument;

    public FunctionNode(
            Method method,
            ExpressionNode argument) {
        this.function = method;
        this.argument = argument;
    }

    public Method getFunction() {
        return function;
    }

    public ExpressionNode getArgument() {
        return argument;
    }

    @Override
    protected Object clone()
            throws CloneNotSupportedException {
        return new FunctionNode(getFunction(), getArgument());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FunctionNode that = (FunctionNode) o;

        if (!function.equals(that.function)) return false;
        return argument.equals(that.argument);
    }

    @Override
    public int hashCode() {
        int result = getClass().hashCode();
        result = 31 * result + function.hashCode();
        result = 31 * result + argument.hashCode();
        return result;
    }

    @Override
    public int typeHashCode() {
        int result = getClass().hashCode();
        result = 31 * result + function.hashCode();
        result = 31 * result + argument.typeHashCode();
        return result;
    }
}
