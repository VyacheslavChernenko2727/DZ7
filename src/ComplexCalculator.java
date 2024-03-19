import java.util.logging.Logger;

// Класс калькулятора комплексных чисел
public class ComplexCalculator {
    private static final Logger LOGGER = Logger.getLogger(ComplexCalculator.class.getName());

    private final ComplexOperation operation;

    public ComplexCalculator(ComplexOperation operation) {
        this.operation = operation;
    }

    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        LOGGER.info("Calculating...");
        ComplexNumber result = operation.execute(num1, num2);
        LOGGER.info("Calculation completed.");
        return result;
    }
}
