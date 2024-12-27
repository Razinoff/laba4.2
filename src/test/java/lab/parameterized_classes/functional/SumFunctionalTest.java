package lab.parameterized_classes.functional;

import lab.parameterized_classes.function.Function;
import lab.parameterized_classes.function.LinearFunction;
import lab.parameterized_classes.function.SinFunction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumFunctionalTest {
    @Test
    public void testLinearFunction() {
        // f(x) = 3x - 4 на интервале [-5, 5]
        Function linearFunction = new LinearFunction(3, -4, -5, 5);
        SumFunctional<Function> sumFunctional = new SumFunctional<>();

        // f(-5) + f(5) + f(0) = (3*(-5) - 4) + (3*5 - 4) + (3*0 - 4)
        double expectedSum = (3 * (-5) - 4) + (3 * 5 - 4) + (3 * 0 - 4);  // = -19
        double result = sumFunctional.compute(linearFunction);
        assertEquals(expectedSum, result, 1e-4);
    }

    @Test
    public void testSineFunction() {
        // f(x) = sin(x) на интервале [0, 2π]
        Function sinFunction = new SinFunction(1, 1, 0, 2 * Math.PI);
        SumFunctional<Function> sumFunctional = new SumFunctional<>();

        // f(0) + f(2π) + f(π) = sin(0) + sin(2π) + sin(π) = 0 + 0 + 0 = 0
        double expectedSum = Math.sin(0) + Math.sin(2 * Math.PI) + Math.sin(Math.PI);
        double result = sumFunctional.compute(sinFunction);
        assertEquals(expectedSum, result, 1e-4);
    }

}
