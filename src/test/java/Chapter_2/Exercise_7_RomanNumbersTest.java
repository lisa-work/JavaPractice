package Chapter_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static Chapter_2.Exercise_7_RomanNumbers.fromRomanNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise_7_RomanNumbersTest {
    @ParameterizedTest
    @CsvSource({"1, I", "1971, MCMLXXI"})
    void testRomanNumbers(int number, String input) {
        int result = fromRomanNumber(input);
        assertEquals(number, result);
    }
}