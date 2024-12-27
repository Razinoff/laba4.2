package lab.parameterized_classes.function;

public class SinFunction implements Function {
    private double a, b;
    private double Llimit, Rlimit;

    public SinFunction(double a, double b, double Llimit, double Rlimit) {
        this.a = a;
        this.b = b;
        this.Llimit = Llimit;
        this.Rlimit = Rlimit;
    }

    @Override
    public double calculate(double x) {
        return a * Math.sin(b * x);
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

