package sk.host.arabasso.bassolve.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import sk.host.arabasso.bassolve.core.visitor.EvaluateExpressionVisitor;

import java.lang.reflect.InvocationTargetException;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;
import static org.junit.runners.Parameterized.Parameters;

/**
 * Created by arabasso on 04/10/2016.
 *
 */
@RunWith(Parameterized.class)
public class EvaluateExpressionVisitorTests extends ExpressionTests {
    private String input;
    private double expected;

    @Parameters(name = "{index}: expression({0}) = {1}")
    public static Object data(){
        return new Object[][]{
                {"1", 1.0},
                {"-3", -3.0},
                {"1 + 2", 3.0},
                {"1 + 2 - 4", -1.0},
                {"(10 + 20) * 2", 60.0},
                {"3 ^ 2", 9.0},
                {"3 * 3", 9.0},
                {"floor(3.2)", 3.0},
                {"cos(0.0)", 1.0},
                {"sin(90.0 * 3.141592 / 180.0)", 1.0},
        };
    }

    public EvaluateExpressionVisitorTests(String input, double expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void expression() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        double value = new EvaluateExpressionVisitor().visit(expression(input));

        assertThat(value, closeTo(expected, 0.00001));
    }
}
