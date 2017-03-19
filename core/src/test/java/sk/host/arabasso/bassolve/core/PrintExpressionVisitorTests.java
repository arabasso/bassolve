package sk.host.arabasso.bassolve.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import sk.host.arabasso.bassolve.core.visitor.PrintExpressionVisitor;

import java.lang.reflect.InvocationTargetException;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.runners.Parameterized.Parameters;

/**
 * Created by arabasso on 05/10/2016.
 *
 */
@RunWith(Parameterized.class)
public class PrintExpressionVisitorTests extends ExpressionTests {
    private String input;
    private String expected;

    @Parameters(name = "{index}: expression({0}) = {1}")
    public static Object data(){
        return new Object[][]{
                {"1", "1"},
                {"-3", "-3"},
                {"1 + 2", "1 + 2"},
                {"1 + 2 - 4", "1 + 2 - 4"},
                {"(10 + 20) * 2", "(10 + 20) * 2"},
                {"3 ^ 2", "3 ^ 2"},
                {"3 * 3", "3 * 3"},
                {"floor(3.2)", "floor(3.2)"},
                {"cos(0.0)", "cos(0)"},
                {"sin(90.0 * 3.141592 / 180.0)", "sin(90 * 3.142 / 180)"},
        };
    }

    public PrintExpressionVisitorTests(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void expression() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        String value = new PrintExpressionVisitor().visit(expression(input));

        assertThat(value, equalTo(expected));
    }
}
