package sk.host.arabasso.bassolve.web.form;

import org.hibernate.validator.constraints.NotBlank;
import sk.host.arabasso.bassolve.core.HeuristicExpression;
import sk.host.arabasso.bassolve.core.ast.node.ExpressionNode;
import sk.host.arabasso.bassolve.core.visitor.AstVisitor;
import sk.host.arabasso.bassolve.core.visitor.HeuristicExpressionVisitor;
import sk.host.arabasso.bassolve.core.visitor.PrintExpressionVisitor;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by arabasso on 26/10/2016.
 *
 */
public class ExpressionForm {
    @NotBlank
    private String value;
    private HeuristicExpressionVisitor heuristicExpressionVisitor;

    public ExpressionForm() {
        heuristicExpressionVisitor = new HeuristicExpressionVisitor();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean hasValue() {
        return this.value != null && this.value.length() > 0;
    }

    public HeuristicExpressionVisitor getHeuristicExpressionVisitor() {
        return heuristicExpressionVisitor;
    }

    public List<String> visit() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        PrintExpressionVisitor printExpressionVisitor = new PrintExpressionVisitor();

        List<String> list = new ArrayList<>();

        ExpressionNode ast = AstVisitor.visit(value);

        int previousHashCode = -1;
        int hashCode = ast.hashCode();

        while(previousHashCode != hashCode) {
            previousHashCode = hashCode;

            list.add(printExpressionVisitor.visit(ast));

            ast = heuristicExpressionVisitor.visit(ast);

            hashCode = ast.hashCode();
        }

        return list;
    }

    public void addHeuristicExpressions(List<HeuristicExpression> heuristicExpressions) {
        heuristicExpressionVisitor.addHeuristicExpressions(heuristicExpressions);
    }
}
