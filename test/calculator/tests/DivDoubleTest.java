package calculator.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivDoubleTest extends BaseTest{
    @ParameterizedTest
    @CsvSource({"8.0,2.0,4.0",
            "5.0,2.0,2.5",
            "-5.0,2.0,-2.5",
            "5.0,-2.0,-2.5",
            "-5.0,-2.0,2.5",
            "0.0,7.0,0.0",
            "2.5,0.5,5.0",
            "5.0,0.0,Infinity",
            "-5.0,0.0,-Infinity",
            "0.0,0.0,NaN"})

    void returnsExpectedDiv(double a,double b, double expected) {
        double actual = calculator.div(a, b);
        assertEquals(expected, actual);

    }
}
