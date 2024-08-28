package Chapter_2;

/*
Input: A number of type integer.
Output: The count as well as the sum of natural numbers, which are divisible by
2 or 7 up to the given number (exclusive).
 */

public class Exercise_1b_Statistics {
    public static void main(String[] args) {
        int test1 = calcSumAndCountAllNumbersDivBy_2_Or_7(3);
        int test2 = calcSumAndCountAllNumbersDivBy_2_Or_7(8);
    }

    public static int calcSumAndCountAllNumbersDivBy_2_Or_7(int number) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < number; i++) {
            boolean divby2or7 = i % 2 == 0 || i % 7 == 0;
            if (divby2or7) {
                count += 1;
                sum += i;
            }
        }
        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        return count;
    }
}
