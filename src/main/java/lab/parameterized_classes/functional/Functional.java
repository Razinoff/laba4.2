package lab.parameterized_classes.functional;

import lab.parameterized_classes.function.Function;

public interface Functional<F extends Function > {
    double compute(F function);
}
