import java.util.logging.Logger;

// Реализация умножения комплексных чисел
public class MultiplicationOperation implements ComplexOperation {
    private static final Logger LOGGER = Logger.getLogger(MultiplicationOperation.class.getName());

    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        LOGGER.info("Performing multiplication operation...");
        double realPart = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginaryPart = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        LOGGER.info("Multiplication operation completed.");
        return new ConcreteComplexNumber(realPart, imaginaryPart);
    }
}
