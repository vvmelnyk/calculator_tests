package calculator.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class SumDoubleTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"2.5,3.25,5.75",
            "-2.5,3.75,1.25",
            "7.5,0.0,7.5",
            "2.25,-5.5,-3.25",
            "-2.5,-3.25,-5.75",
            "-3.5,3.5,0.0"})

    void returnsExpectedSum(double a,double b, double expected) {
        double actual = calculator.sum(a, b);
        assertEquals(expected, actual);

    }
}
