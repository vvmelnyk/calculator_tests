package calculator.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivLongTest extends BaseTest{

    @ParameterizedTest
    @CsvSource({"8,2,4",
            "5,2,2",
            "-5,2,-2",
            "5,-2,-2",
            "-5,-2,2",
            "0,7,0",
            "2,5,0"})

    void returnsExpectedDiv(long a,long b, long expected) {
        long actual = calculator.div(a, b);
        assertEquals(expected, actual);

    }

    @Test
    void returnDivNull(){
        assertThrows(NumberFormatException.class, () -> calculator.div(5L, 0L));
    }
}
