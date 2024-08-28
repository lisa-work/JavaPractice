package Chapter_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class Exercise_5_PrimeNumbersPairTest {
    int maxValue = 50;
    @ParameterizedTest
    @MethodSource("distanceAndExpected")
    void calcPairs(int distance, String info, Map<Integer, Integer> expected) {
        var result = Exercise_5_PrimeNumbersPair.calcPairs(maxValue, distance);
        assertEquals(result, expected);
    }
    private static Stream<Arguments> distanceAndExpected()
    {
        return Stream.of(Arguments.of(2, "twin", Map.of(3, 5, 5, 7,
                11, 13, 17, 19, 29, 31, 41, 43)),
                Arguments.of(4, "cousin", Map.of(3, 7, 7, 11, 13,
                        17, 19, 23, 37, 41, 43, 47)));
    }
}