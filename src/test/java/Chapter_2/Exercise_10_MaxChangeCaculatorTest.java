package Chapter_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise_10_MaxChangeCalculatorTest {
    @ParameterizedTest
    @MethodSource("inputAndMaxChange")
    void calMaxPossibleChangeTest(List<Integer> values, int expected) {
        int result = Exercise_10_MaxChangeCalculator.calcMaxPossibleChange(values);
        assertEquals(result, expected);
    }
    private static Stream<Arguments> inputAndMaxChange() {
        return Stream.of(Arguments.of(List.of(1), 1,
                Arguments.of(List.of(1,1), 2),
                Arguments.of(List.of(1, 2, 4), 1),
                Arguments.of(1, 2, 3, 7), 13));
    }

}