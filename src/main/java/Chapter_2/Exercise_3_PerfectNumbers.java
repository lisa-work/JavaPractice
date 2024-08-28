package Chapter_2;

/*
Input: A positive number of type integer.
Output: A list of perfect numbers up to the input number.
 */

import java.util.ArrayList;
import java.util.List;

public class Exercise_3_PerfectNumbers {
    public static void main(String[] args) {
        List<Integer> test = calcPerfectNumbers(7);
        System.out.println(test);
    }

    public static List<Integer> calcPerfectNumbers(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (isPerfectNumbers(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static boolean isPerfectNumbers(int m) {
        int sum = 0;
        for (int i = 1; i <= m/2; i++) {
            if (m % i == 0) {
                sum += i;
            }
        }
        return sum == m;
    }
}
