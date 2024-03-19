public class ComplexCalculator {
    private final ComplexOperation operation;

    public ComplexCalculator(ComplexOperation operation) {
        this.operation = operation;
    }

    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        return operation.execute(num1, num2);
    }
}
