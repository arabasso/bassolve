package sk.host.arabasso.bassolve.core;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Created by arabasso on 05/10/2016.
 *
 */
public class MathExTests {
    @Test
    public void lowestCommonDenominatorBetween4And3CloseTo12(){
        double r = MathEx.leastCommonMultiple(4.0, 3.0);

        assertThat(r, closeTo(12.0, 0.00001));
    }

    @Test
    public void lowestCommonDenominatorBetween4And4CloseTo4(){
        double r = MathEx.leastCommonMultiple(4.0, 4.0);

        assertThat(r, closeTo(4.0, 0.00001));
    }

    @Test
    public void greatestCommonDivisorBetween4And8CloseTo4(){
        double r = MathEx.greatestCommonDivisor(4.0, 8.0);

        assertThat(r, closeTo(4.0, 0.00001));
    }

    @Test
    public void greatestCommonDivisorBetween4And3CloseTo1(){
        double r = MathEx.greatestCommonDivisor(4.0, 3.0);

        assertThat(r, closeTo(1.0, 0.00001));
    }
}
