package lab.parameterized_classes.function;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SinFunctionTest {
    @Test
    public void testCalculate() {
        // f(x) = 2 * sin(π * x) на интервале [-2, 2]
        Function function = new SinFunction(2, Math.PI, -2, 2);

        // Проверка значений функции
        assertEquals(0, function.calculate(0), 1e-9); // 2 * sin(π * 0) = 0
        assertEquals(2, function.calculate(0.5), 1e-9); // 2 * sin(π * 0.5) = 2
        assertEquals(0, function.calculate(1), 1e-9); // 2 * sin(π * 1) = 0
    }

    @Test
    public void testlimit() {
        Function function = new SinFunction(3, Math.PI / 2, -Math.PI, Math.PI);
        assertEquals(-Math.PI, function.getLlimit());
        assertEquals(Math.PI, function.getRlimit());
    }
}
