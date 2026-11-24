package calculator.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CosDoubleTest extends BaseTest{
    @ParameterizedTest
    @CsvSource({"0.0,1.0",
            "1.5707963267948966,0.0",
            "3.141592653589793,-1.0",
            "1.0471975511965976,0.5",
            "-1.0471975511965976,0.5"})

    void returnsExpectedCos(double a, double expected) {
        double actual = calculator.cos(a);
        assertEquals(expected, actual, 1e-9);

    }

}
