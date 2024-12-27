package lab.parameterized_classes.function;

public class RationalFunction implements Function {
    private double a, b, c, d;
    private double Llimit, Rlimit;

    public RationalFunction(double a, double b, double c, double d, double Llimit, double Rlimit) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.Llimit = Llimit;
        this.Rlimit = Rlimit;
    }

    @Override
    public double calculate(double x) {
        if (c * x + d == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (a * x + b) / (c * x + d);
    }

    @Override
    public double getLlimit() {
        return Llimit;
    }

    @Override
    public double getRlimit() {
        return Rlimit;
    }
}

