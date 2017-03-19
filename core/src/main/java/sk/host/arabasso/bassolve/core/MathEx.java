package sk.host.arabasso.bassolve.core;

/**
 * Created by arabasso on 05/10/2016.
 *
 */
public class MathEx {
    public static double leastCommonMultiple(double num1, double num2){
        return (num1 * num2) / greatestCommonDivisor(num1, num2);
    }

    public static double greatestCommonDivisor(double num1, double num2) {
        double mod, a, b;

        a = num1;
        b = num2;

        while (b != 0) {
            mod = a % b;
            a = b;
            b = mod;
        }

        return a;
    }
}
