package sk.host.arabasso.bassolve.core.visitor;

import sk.host.arabasso.bassolve.core.ast.node.*;

import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
public class PrintExpressionVisitor extends AstVisitor<String> {
    private String Concat(InfixExpressionNode node, String value) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return visit(node.getLeft()) + " " + value + " " + visit(node.getRight());
    }

    @Override
    public String visit(AdditionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return Concat(node, "+");
    }

    @Override
    public String visit(SubtractionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return Concat(node, "-");
    }

    @Override
    public String visit(MultiplicationNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return Concat(node, "*");
    }

    @Override
    public String visit(PowNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return Concat(node, "^");
    }

    @Override
    public String visit(DivisionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return Concat(node, "/");
    }

    @Override
    public String visit(NegateNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return "-" + visit(node.getInnerNode());
    }

    @Override
    public String visit(ParenthesisNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return "(" + visit(node.getInnerNode()) + ")";
    }

    @Override
    public String visit(FunctionNode node) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return node.getFunction().getName() + "(" + visit(node.getArgument()) + ")";
    }

    @Override
    public String visit(NumberNode node) {
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);

        return df.format(node.getValue());
    }
}
