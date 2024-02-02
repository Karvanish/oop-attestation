import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationTests {

    @Test
    public void testAddition() {
        Operation addition = new Addition();
        Assertions.assertEquals(5.0, addition.execute(2, 3), "Addition should work correctly");
    }

    @Test
    public void testMultiplication() {
        Operation multiplication = new Multiplication();
        Assertions.assertEquals(6.0, multiplication.execute(2, 3), "Multiplication should work correctly");
    }

    @Test
    public void testDivision() {
        Operation division = new Division();
        Assertions.assertEquals(2.0, division.execute(6, 3), "Division should work correctly");
        Assertions.assertThrows(IllegalArgumentException.class, () -> division.execute(1, 0), "Division by zero should throw IllegalArgumentException");
    }

    @Test
    public void testCalculator() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(5.0, calculator.calculate("+", 2, 3), "Calculator should add correctly");
        Assertions.assertEquals(6.0, calculator.calculate("*", 2, 3), "Calculator should multiply correctly");
        Assertions.assertEquals(2.0, calculator.calculate("/", 6, 3), "Calculator should divide correctly");
    }
}
