package Chapter_2;

import junit.framework.TestCase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import javax.print.attribute.IntegerSyntax;
import java.util.List;
import java.util.stream.Stream;

import static Chapter_2.Exercise_3_PerfectNumbers.calcPerfectNumbers;
import static Chapter_2.Exercise_3_PerfectNumbers.isPerfectNumbers;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise_3_PerfectNumbersTest {

    @ParameterizedTest(name = "{0} should be perfect")
    @ValueSource(ints = {6, 28, 496, 8128})
    void isPerfectNumberSimple(int value) {
        boolean result = isPerfectNumbers(value);
        assertTrue(result);
    }

    @ParameterizedTest(name = "calcPerfectNumbers({0}) = {1}")
    @MethodSource("maxAndPerfectNumbers")
    void calcPerfectNumbersTest(int maxExclusive, List<Integer> expected) {
        List<Integer> result = calcPerfectNumbers(maxExclusive);
        assertEquals(result, expected);
    }
    private static Stream<Arguments> maxAndPerfectNumbers() {
        return Stream.of(Arguments.of(1000, List.of(6, 28, 496)),
                Arguments.of(10000, List.of(6, 28, 496, 8128)));
    }
}