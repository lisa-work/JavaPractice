package Chapter_2;

/*
Input: A positive number of type integer.
Output: A list of prime numbers up to the given input number.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise_4_PrimeNumbers {
    static List<Integer> calcPrimesUpTo(int maxValue) {
        boolean[] isPotentiallyPrime = new boolean[maxValue + 1];
        Arrays.fill(isPotentiallyPrime, true);
        for (int i = 2; i <= maxValue/2; i++) {
            if (isPotentiallyPrime[i])
                eraseMultiplesOfCurrent(isPotentiallyPrime, i);
        }
        return buildPrimesList(isPotentiallyPrime);
    }

    private static List<Integer> buildPrimesList(boolean[] isPotentiallyPrime) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < isPotentiallyPrime.length; i++)  {
            if (isPotentiallyPrime[i])
                primes.add(i);
        }
        return primes;
    }

    private static void eraseMultiplesOfCurrent(boolean[] values, int i) {
        for (int n = i + i; n < values.length; n = n + i) {
            values[n] = false;
        }
    }

}
