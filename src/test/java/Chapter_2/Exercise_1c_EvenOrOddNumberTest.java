package Chapter_2;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static Chapter_2.Exercise_1c_EvenOrOddNumber.isEven;
import static Chapter_2.Exercise_1c_EvenOrOddNumber.isOdd;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Exercise_1c_EvenOrOddNumberTest {

    @Test
    public void testIsEven() {
        assertTrue(isEven(8));
    }

    @Test
    public void testIsOdd() {
        assertFalse(isOdd(2));
    }
}