import java.util.logging.Logger;

// Реализация сложения комплексных чисел
public class AdditionOperation implements ComplexOperation {
    private static final Logger LOGGER = Logger.getLogger(AdditionOperation.class.getName());

    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        LOGGER.info("Performing addition operation...");
        double realPart = num1.getReal() + num2.getReal();
        double imaginaryPart = num1.getImaginary() + num2.getImaginary();
        LOGGER.info("Addition operation completed.");
        return new ConcreteComplexNumber(realPart, imaginaryPart);
    }
}
