package Chapter_2;

import junit.framework.TestCase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static Chapter_2.Exercise_4_PrimeNumbers.calcPrimesUpTo;
import static org.junit.Assert.assertEquals;

public class Exercise_4_PrimeNumbersTest {
    @ParameterizedTest
    @MethodSource("listPrimeNumbers")
    public void testCalcPrimesUpTo(int number, List<Integer> expected) {
        List<Integer> actual = calcPrimesUpTo(number);
        assertEquals(actual, expected);
    }
    private static Stream<Arguments> listPrimeNumbers() {
        return Stream.of(Arguments.of(15, List.of(2,3,5,7,11,13)));
    }
}