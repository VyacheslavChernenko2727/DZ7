public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ConcreteComplexNumber(2, 3);
        ComplexNumber num2 = new ConcreteComplexNumber(1, -2);

        ComplexOperation additionOperation = new AdditionOperation();
        ComplexCalculator additionCalculator = new ComplexCalculator(additionOperation);
        ComplexNumber sum = additionCalculator.calculate(num1, num2);
        System.out.println("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");

        ComplexOperation multiplicationOperation = new MultiplicationOperation();
        ComplexCalculator multiplicationCalculator = new ComplexCalculator(multiplicationOperation);
        ComplexNumber product = multiplicationCalculator.calculate(num1, num2);
        System.out.println("Product: " + product.getReal() + " + " + product.getImaginary() + "i");

        ComplexOperation divisionOperation = new DivisionOperation();
        ComplexCalculator divisionCalculator = new ComplexCalculator(divisionOperation);
        ComplexNumber quotient = divisionCalculator.calculate(num1, num2);
        System.out.println("Quotient: " + quotient.getReal() + " + " + quotient.getImaginary() + "i");
    }
}
