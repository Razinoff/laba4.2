package lab.parameterized_classes.function;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RationalFunctionTest {
    @Test
    public void testCalculate() {
        // f(x) = (4x + 2) / (2x + 1) на интервале [-10, 10]
        Function function = new RationalFunction(4, 2, 2, 1, -10, 10);

        assertEquals(2.0, function.calculate(0), 1e-9); // (4*0 + 2) / (2*0 + 1)
    }

    @Test
    public void testErrZero() {
        Function function = new RationalFunction(1, -1, 0, 0, -5, 15);
        assertThrows(ArithmeticException.class, () -> function.calculate(1));
    }

    @Test
    public void testlimit() {
        Function function = new RationalFunction(2, 3, 1, 2, -5, 15);
        assertEquals(-5, function.getLlimit());
        assertEquals(15, function.getRlimit());
    }
}

