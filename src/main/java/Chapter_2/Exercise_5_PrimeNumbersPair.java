package Chapter_2;

/* Compute all pairs of prime numbers with a distance of 2 (twin), 4 (cousin), 6 (sexy)
up to an upper bound for n */

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;

public class Exercise_5_PrimeNumbersPair {
    public static void calcPrimeParis(final int maxValue) {
        final Map<Integer, Integer> twinPairs = calcPairs(maxValue, 2);
        final Map<Integer, Integer> cousinPairs = calcPairs(maxValue, 4);
        final Map<Integer, Integer> sexyPairs = calcPairs(maxValue, 6);

        System.out.println("Twins: " + twinPairs);
        System.out.println("Cousins: " + cousinPairs);
        System.out.println("Sexy: " + sexyPairs);
    }
    public static Map<Integer, Integer> calcPairs(final int maxValue, final int distance) {
        final List<Integer> primes = Chapter_2.Exercise_4_PrimeNumbers.calcPrimesUpTo(maxValue + distance);
        final Map<Integer, Integer> resultPairs = new TreeMap<>();
        for (int n = 2; n < maxValue; n++) {
            if (isPrime(primes, n) && isPrime(primes, n + distance))
            {resultPairs.put(n, n + distance);
            }
        }
        return resultPairs;
    }
    public static boolean isPrime(final List<Integer> primes, final int n) {
        return primes.contains(n);
    }
    }
