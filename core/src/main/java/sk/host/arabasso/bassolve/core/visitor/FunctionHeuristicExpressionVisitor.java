package sk.host.arabasso.bassolve.core.visitor;

import sk.host.arabasso.bassolve.core.ast.node.ExpressionNode;
import sk.host.arabasso.bassolve.core.ast.node.FunctionNode;
import sk.host.arabasso.bassolve.core.ast.node.NumberNode;

/**
 * Created by arabasso on 21/03/2017.
 */
public abstract class FunctionHeuristicExpressionVisitor extends AbstractHeuristicExpressionVisitor<FunctionNode> {
    private String name;

    protected FunctionHeuristicExpressionVisitor(String name) {
        super(FunctionNode.class);
        this.name = name;
    }

    @Override
    public boolean isApplicable(FunctionNode node) {
        return node.isMethod(name) && node.isNumberArgument();
    }

    @Override
    public ExpressionNode apply(FunctionNode node) {
        NumberNode n = node.getArgumentAsNumber();

        return new NumberNode(apply(n.getValue()));
    }

    public abstract double apply(double argument);
}
