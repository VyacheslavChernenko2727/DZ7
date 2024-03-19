import java.util.logging.Logger;

// Реализация деления комплексных чисел
public class DivisionOperation implements ComplexOperation {
    private static final Logger LOGGER = Logger.getLogger(DivisionOperation.class.getName());

    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        LOGGER.info("Performing division operation...");
        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        double realPart = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imaginaryPart = (num2.getReal() * num1.getImaginary() - num1.getReal() * num2.getImaginary()) / denominator;
        LOGGER.info("Division operation completed.");
        return new ConcreteComplexNumber(realPart, imaginaryPart);
    }
}
