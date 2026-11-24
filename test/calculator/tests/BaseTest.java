package calculator.tests;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import com.epam.tat.module4.Calculator;

public class BaseTest {

    protected Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        logTest("START");
    }

    @AfterEach
    void tearDown() {
        logTest("END");
    }

    private void logTest(String event) {
        System.out.println(event + " " + getClass().getSimpleName()
                + " [" + Thread.currentThread().getName() + "]");
    }

}
