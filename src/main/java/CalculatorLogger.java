import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorLogger {
    private static final Logger logger = LoggerFactory.getLogger(CalculatorLogger.class);

    public static void log(String message) {
        logger.info(message);
    }
}
