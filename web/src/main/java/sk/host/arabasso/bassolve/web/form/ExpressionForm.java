package sk.host.arabasso.bassolve.web.form;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;
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
@Validated
public class ExpressionForm {
    public ExpressionForm(String value) {
        this.value = value;
    }

    public ExpressionForm() {
    }

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
}
