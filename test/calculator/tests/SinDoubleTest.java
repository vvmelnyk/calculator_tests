package calculator.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SinDoubleTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"0.0,0.0",
            "1.5707963267948966,1.0",
            "-1.5707963267948966,-1.0",
            "3.141592653589793,0.0",
            "0.5235987755982988,0.5"})

    void returnsExpectedSin(double a, double expected) {
        double actual = calculator.sin(a);
        assertEquals(expected, actual, 1e-9);

    }
}
