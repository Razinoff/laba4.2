package lab.parameterized_classes.function;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinearFunctionTest {
    @Test
    public void testCalculate() {
        Function function = new LinearFunction(4, 2, -10, 20);
        assertEquals(6, function.calculate(1), 1e-9);  // 4 * 1 + 2
        assertEquals(82, function.calculate(20), 1e-9); // 4 * 20 + 2
    }

    @Test
    public void testlimit() {
        Function function = new LinearFunction(4, 2, -10, 20);
        assertEquals(-10, function.getLlimit());
        assertEquals(20, function.getRlimit());
    }
}
