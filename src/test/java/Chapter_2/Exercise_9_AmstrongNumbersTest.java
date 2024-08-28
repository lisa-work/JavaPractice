package Chapter_2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise_9_AmstrongNumbersTest {
    @Test
    public void calcAmstrongNumbersTest() {
        List<Integer> result = Exercise_9_AmstrongNumbers.calcAmstrongNumbers();
        assertEquals(List.of(153, 371), result);
    }
}