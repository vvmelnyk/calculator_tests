package calculator.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubLongTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"7,3,4",
            "-2,3,-5",
            "7,0,7",
            "2,-5,7",
            "-2,-3,1",
            "3,5,-2",
            "4,4,0"})

    void returnsExpectedSub(long a,long b, long expected) {
        long actual = calculator.sub(a, b);
        assertEquals(expected, actual);

    }
}
