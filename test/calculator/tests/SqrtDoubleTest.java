package calculator.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtDoubleTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"9.0,3.0",
            "0.0,0.0",
            "1.0,1.0",
            "2.25,1.5",
            "2.0,1.4142135623730951",
            "-9.0,NaN"})

    void returnsExpectedSqrt(double a, double expected) {
        double actual = calculator.sqrt(a);
        assertEquals(expected, actual);

    }
}
