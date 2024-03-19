public class ConcreteComplexNumber implements ComplexNumber {
    private final double real;
    private final double imaginary;

    public ConcreteComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public double getReal() {
        return real;
    }

    @Override
    public double getImaginary() {
        return imaginary;
    }
}