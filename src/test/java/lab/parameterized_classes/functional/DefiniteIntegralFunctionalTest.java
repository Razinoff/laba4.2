package lab.parameterized_classes.functional;

import lab.parameterized_classes.function.ExponentialFunction;
import lab.parameterized_classes.function.Function;
import lab.parameterized_classes.function.LinearFunction;
import lab.parameterized_classes.function.SinFunction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DefiniteIntegralFunctionalTest {

    @Test
    public void testSinFunction() {
        // f(x) = sin(x) на интервале [π, 0]
        Function sinFunction = new SinFunction(1, 1, 0,2*Math.PI);
        DefiniteIntegralFunctional<Function> integralFunctional = new DefiniteIntegralFunctional<>(0, Math.PI, 1000);

        double result = integralFunctional.compute(sinFunction);
        assertEquals(2, result, 1e-6);
    }

    @Test
    public void testLinearFunction(){
        // f(x) = 2x + 3
        Function linearFunction = new LinearFunction(2, 3, 0, 10);
        DefiniteIntegralFunctional<Function> integralFunctional = new DefiniteIntegralFunctional<>(0, 10, 10000);

        double expectedIntegral = 130;
        double result = integralFunctional.compute(linearFunction);

        assertEquals(expectedIntegral, result, 1e-6);
    }

    @Test
    public void testExponentialFunction(){
        // f(x) = 2 * e^x + 1
        Function exponentialFunction = new ExponentialFunction(2, 1, 0, 1);
        DefiniteIntegralFunctional<Function> integralFunctional = new DefiniteIntegralFunctional<>(0, 1, 10000);

        double expectedIntegral = 2 * Math.exp(1) - 1;
        double result = integralFunctional.compute(exponentialFunction);

        assertEquals(expectedIntegral, result, 1e-5);
    }

    @Test
    public void testException() {
        Function linearFunction = new LinearFunction(1, 2, 10, 20);
        DefiniteIntegralFunctional<Function> integralFunctional = new DefiniteIntegralFunctional<>(0, 5, 1000);

        assertThrows(IllegalArgumentException.class, () -> integralFunctional.compute(linearFunction));
    }
}
