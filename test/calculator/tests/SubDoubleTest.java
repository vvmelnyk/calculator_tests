package calculator.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubDoubleTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"7.5,3.25,4.25",
            "-2.5,3.25,-5.75",
            "7.5,0.0,7.5",
            "2.25,-5.5,7.75",
            "-2.5,-3.75,1.25",
            "3.25,5.75,-2.5",
            "4.5,4.5,0.0"})

    void returnsExpectedSub(double a,double b, double expected) {
        double actual = calculator.sub(a, b);
        assertEquals(expected, actual);

    }
}
