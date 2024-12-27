package lab.parameterized_classes.functional;

import lab.parameterized_classes.function.Function;

public class DefiniteIntegralFunctional<F extends Function> implements Functional<F> {
    private double a;
    private double b;
    private int n;

    public DefiniteIntegralFunctional(double a, double b, int n) {
        if (a > b) {
            throw new IllegalArgumentException(" a <= b");
        }
        if (n <= 0) {
            throw new IllegalArgumentException("n > 0");
        }
        this.a = a;
        this.b = b;
        this.n = n;
    }

    public double rectangle(F function) {
        double h = (b - a) / n;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double x = a + (i + 0.5) * h;
            sum += function.calculate(x);
        }

        return h * sum;
    }

    @Override
    public double compute(F function) {
        if (a < function.getLlimit() || b > function.getRlimit()) {
            throw new IllegalArgumentException("The function definition area is not contained in segment");
        }

        return rectangle(function);
    }
}
