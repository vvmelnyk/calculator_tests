package calculator.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsNegativeTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"1,false",
            "-1,true",
            "0,false"})

    void returnsExpectedIsNegative(long a, boolean expected) {
        boolean actual = calculator.isNegative(a);
        assertEquals(expected, actual);

    }
}
