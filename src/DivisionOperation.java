public class DivisionOperation implements ComplexOperation {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        double realPart = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imaginaryPart = (num2.getReal() * num1.getImaginary() - num1.getReal() * num2.getImaginary()) / denominator;
        return new ConcreteComplexNumber(realPart, imaginaryPart);
    }
}