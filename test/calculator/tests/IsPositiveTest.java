package calculator.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsPositiveTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"1,true",
            "-1,false",
            "0,false"})

    void returnsExpectedIsPositive(long a, boolean expected) {
        boolean actual = calculator.isPositive(a);
        assertEquals(expected, actual);

    }
}
