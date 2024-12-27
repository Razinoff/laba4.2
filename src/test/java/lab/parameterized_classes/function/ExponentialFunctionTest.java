package lab.parameterized_classes.function;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExponentialFunctionTest {
    @Test
    public void testCalculate() {
        Function function = new ExponentialFunction(3, 5, -5, 15);
        assertEquals(8, function.calculate(0), 1e-9); // 3 * exp(0) + 5
        assertEquals(3 * Math.exp(2) + 5, function.calculate(2), 1e-9); // 3 * exp(2) + 5
    }

    @Test
    public void testLimit() {
        Function function = new ExponentialFunction(3, 5, -5, 15);
        assertEquals(-5, function.getLlimit());
        assertEquals(15, function.getRlimit());
    }
}

