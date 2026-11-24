package calculator.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultDoubleTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"2.5,3.0,7.5",
            "-2.5,3.0,-7.5",
            "2.25,-2.0,-4.5",
            "-2.5,-1.5,3.75",
            "7.5,0.0,0.0"})

    void returnsExpectedMult(double a,double b, double expected) {
        double actual = calculator.mult(a, b);
        assertEquals(expected, actual);

    }
}
