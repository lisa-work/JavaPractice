package Chapter_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static Chapter_2.Exercise_1a_BasicArithmetic.calc;
import static org.junit.Assert.assertEquals;

public class Exercise_1a_BasicArithmeticTest {

    @ParameterizedTest
    @CsvSource({"6, 7, 0", "3, 4, 6", "5, 5, 5"})
    void cal(int m, int n, int expected){
        int result = calc(m, n);
        assertEquals(result, expected);
    }
}