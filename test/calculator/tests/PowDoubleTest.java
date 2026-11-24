package calculator.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowDoubleTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"2.0,3.0,8.0",
            "5.0,0.0,1.0",
            "2.0,-2.0,0.25",
            "-2.0,3.0,-8.0",
            "-2.0,4.0,16.0",
            "0.0,3.0,0.0",
            "4.0,0.5,2.0",
            "4.0,-0.5,0.5"})

    void returnsExpectedPow(double a,double b, double expected) {
        double actual = calculator.pow(a, b);
        assertEquals(expected, actual);

    }
}
