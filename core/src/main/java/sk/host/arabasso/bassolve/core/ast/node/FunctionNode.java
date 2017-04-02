package sk.host.arabasso.bassolve.core.ast.node;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public class FunctionNode extends ExpressionNode {
    private String method;
    private ExpressionNode argument;

    public FunctionNode(
            String method,
            ExpressionNode argument) {
        this.method = method;
        this.argument = argument;
    }

    public String getMethod() {
        return method;
    }

    public ExpressionNode getArgument() {
        return argument;
    }

    public boolean isMethod(String name) {
        return name != null && name.equals(method);
    }

    public boolean isNumberArgument() {
        return argument instanceof NumberNode;
    }

    public NumberNode getArgumentAsNumber() {
        return (NumberNode) argument;
    }

    @Override
    protected Object clone()
            throws CloneNotSupportedException {
        return new FunctionNode(getMethod(), getArgument());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FunctionNode that = (FunctionNode) o;

        if (!method.equals(that.method)) return false;
        return argument.equals(that.argument);
    }

    @Override
    public int hashCode() {
        int result = getClass().hashCode();
        result = 31 * result + method.hashCode();
        result = 31 * result + argument.hashCode();
        return result;
    }

    @Override
    public int typeHashCode() {
        int result = getClass().hashCode();
        result = 31 * result + method.hashCode();
        result = 31 * result + argument.typeHashCode();
        return result;
    }
}
