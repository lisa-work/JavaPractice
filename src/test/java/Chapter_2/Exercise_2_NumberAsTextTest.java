package Chapter_2;

import junit.framework.TestCase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static Chapter_2.Exercise_2_NumberAsText.numberAsText;
import static org.junit.Assert.assertEquals;

public class Exercise_2_NumberAsTextTest {

    @ParameterizedTest
    @CsvSource({"7, SEVEN", "42, FOUR TWO", "896, EIGHT NINE SIX"})
    public void testNumberAsText(int number, String expected) {
        String result = numberAsText(number);
        assertEquals(result, expected);
    }
}