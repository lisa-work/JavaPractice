package Chapter_2;

import java.util.Map;

public class Exercise_7_RomanNumbers {

    /* Compute the corresponding decimal number from a textually valid Roman number. */

    public static int fromRomanNumber (String romanNumber) {
        int value = 0;
        int lastDigitValue = 0;
        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            char romanDigit = romanNumber.charAt(i);
            int digitValue = valueMap.getOrDefault(romanDigit, 0);
            boolean addMode = digitValue >= lastDigitValue;
            if (addMode) {
                value += digitValue;
                lastDigitValue = digitValue;
            }
            else {
                value -= digitValue;
            }
        }
        return value;
    }
    static Map<Character, Integer> valueMap = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
    }
