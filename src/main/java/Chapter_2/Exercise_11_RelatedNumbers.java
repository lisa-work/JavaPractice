package Chapter_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Exercise_11_RelatedNumbers {
    public static Map<Integer, Integer> calcFriends(int max) {
        Map<Integer, Integer> friends = new TreeMap<>();
        for (int number = 2; number < max; number++) {
            List<Integer> divisors1 = findProperDivisors(number);
            int sumDiv1 = sum(divisors1);
            List<Integer> divisors2 = findProperDivisors(sumDiv1);
            int sumDiv2 = sum(divisors2);
            if (number == sumDiv2 && sumDiv1 != sumDiv2)
                friends.put(number, sumDiv1);
        }
        return friends;
    }

    public static List<Integer> findProperDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        for(int i = 1; i <= number/2; i++) {
            if (number%i == 0)
                    divisors.add(i);
            else
                continue;
        }
        return divisors;
    }

    public static int sum(List<Integer> values) {
        return values.stream().mapToInt(n -> n).sum();
    }
}
