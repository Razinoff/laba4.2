package lab.parameterized_classes.functional;

import lab.parameterized_classes.function.Function;

public class SumFunctional<F extends Function> implements Functional<F> {
    @Override
    public double compute(F function) {
        double left = function.getLlimit();
        double right = function.getRlimit();
        double middle = (left + right) / 2;

        return function.calculate(left) + function.calculate(right) + function.calculate(middle);
    }
}

