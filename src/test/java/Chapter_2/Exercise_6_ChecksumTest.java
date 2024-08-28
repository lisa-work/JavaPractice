package Chapter_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static Chapter_2.Exercise_6_Checksum.calcChecksum;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise_6_ChecksumTest {
    @ParameterizedTest(name = "checksum({0}) = {1}")
    @CsvSource({"11111, 5", "22222, 0", "111111, 1", "12345678, 4", "87654321, 0"})
    void testCalcChecksum(String input, int expected) {
        int result = calcChecksum(input);
        assertEquals(result, expected);
    }
}