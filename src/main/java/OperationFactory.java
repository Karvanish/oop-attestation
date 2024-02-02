public class OperationFactory {
    public Operation getOperation(String operation) {
        return switch (operation) {
            case "+" -> new Addition();
            case "*" -> new Multiplication();
            case "/" -> new Division();
            default -> throw new IllegalArgumentException("Invalid operation.");
        };
    }
}
