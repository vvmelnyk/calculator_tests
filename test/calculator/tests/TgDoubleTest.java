package calculator.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TgDoubleTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"0.0,0.0",
            "0.5235987755982988,0.5773502691896257",
            "0.7853981633974483,1.0",
            "-0.7853981633974483,-1.0",
            "1.0471975511965976,1.7320508075688772"})

    void returnsExpectedTg(double a, double expected) {
        double actual = calculator.tg(a);
        assertEquals(expected, actual, 1e-9);

    }
}
