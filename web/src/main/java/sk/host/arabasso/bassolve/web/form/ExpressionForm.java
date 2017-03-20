package sk.host.arabasso.bassolve.web.form;

import org.hibernate.validator.constraints.NotBlank;
import sk.host.arabasso.bassolve.core.ast.node.ExpressionNode;
import sk.host.arabasso.bassolve.core.visitor.AstVisitor;
import sk.host.arabasso.bassolve.core.visitor.PrintExpressionVisitor;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by arabasso on 26/10/2016.
 *
 */
public class ExpressionForm {
    @NotBlank
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean hasValue() {
        return this.value != null && this.value.length() > 0;
    }

    private Set<AstVisitor<ExpressionNode>> visitors = new HashSet<>();

    public void addVisitor(AstVisitor<ExpressionNode> visitor) {
        visitors.add(visitor);
    }

    public List<String> visit() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        PrintExpressionVisitor printExpressionVisitor = new PrintExpressionVisitor();

        List<String> list = new ArrayList<>();

        ExpressionNode ast = AstVisitor.visit(value);

        list.add(printExpressionVisitor.visit(ast));

        int previousHashCode = -1;
        int hashCode = ast.hashCode();

        while(previousHashCode != hashCode) {
            previousHashCode = hashCode;

            for (AstVisitor<ExpressionNode> visitor : visitors) {
                ast = visitor.visit(ast);

                hashCode = ast.hashCode();


                if (previousHashCode != hashCode) {
                    list.add(printExpressionVisitor.visit(ast));

                    break;
                }
            }
        }

        return list;
    }
}
