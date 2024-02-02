public class Calculator {
    private final OperationFactory operationFactory = new OperationFactory();

    public double calculate(String operation, double a, double b) {
        Operation op = operationFactory.getOperation(operation);
        double result = op.execute(a, b);
        CalculatorLogger.log("Operation: " + operation + ", a: " + a + ", b: " + b + ", result: " + result);
        return result;
    }
}
