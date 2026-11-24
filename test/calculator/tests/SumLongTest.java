package calculator.tests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SumLongTest extends BaseTest {

    @ParameterizedTest
    @CsvSource({"2,3,5",
                "-2,3,1",
                "7,0,7",
                "2,-5,-3",
                "-2,-3,-5"})

    void returnsExpectedSum(long a,long b, long expected) {
        long actual = calculator.sum(a, b);
        assertEquals(expected, actual);

}
}
