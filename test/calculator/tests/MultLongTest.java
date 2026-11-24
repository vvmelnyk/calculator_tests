package calculator.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultLongTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"2,3,6",
            "-2,3,-6",
            "2,-5,-10",
            "-2,-3,6",
            "7,0,0"})

    void returnsExpectedMult(long a,long b, long expected) {
        long actual = calculator.mult(a, b);
        assertEquals(expected, actual);

    }
}
