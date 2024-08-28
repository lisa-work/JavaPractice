package Chapter_2;

/*
Input: Two variables, m and n of type int.
Output: Multiplies two given variables, then divides the product by two and
output the remainder with respect to division by 7.
 */

public class Exercise_1a_BasicArithmetic {
    public static int calc(int m, int n) {
        int result = ((m*n)/2)%7;
        return result;
    }
}
