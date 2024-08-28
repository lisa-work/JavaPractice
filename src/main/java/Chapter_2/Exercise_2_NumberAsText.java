package Chapter_2;

/*
Input: A positive number of type integer.
Output: The respective digits in corresponding text.
 */

import java.util.Map;

public class Exercise_2_NumberAsText {
    public static String numberAsText(int n) {
        String text = "";
        int RemainingValue = n;
        while (RemainingValue > 0) {
            String remainderAsText = digitAsText(RemainingValue % 10);
            text = remainderAsText + " " + text;
            RemainingValue /= 10;
        }
        return text.trim();
    }

    public static Map<Integer, String> valuetoText =
            Map.of(0, "ZERO", 1, "ONE", 2, "TWO", 3, "THREE",
                    4, "FOUR", 5, "FIVE", 6, "SIX", 7, "SEVEN",
                    8, "EIGHT", 9, "NINE");

    public static String digitAsText(int n) {
        return valuetoText.get(n % 10);
    }
}
