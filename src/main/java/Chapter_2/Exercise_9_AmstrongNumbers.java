package Chapter_2;

/* Compute a list of all Armstrong numbers */

import java.util.ArrayList;
import java.util.List;

public class Exercise_9_AmstrongNumbers {
    static List<Integer> calcAmstrongNumbers() {
        List<Integer> results = new ArrayList<>();
        for (int a = 1; a < 10; a++) {
            for (int b = 1; b < 10; b++) {
                for (int c = 1; c < 10; c++) {
                    int numericValue = a*100 + b*10 + c;
                    int cubicValue = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
                    if (numericValue == cubicValue) {
                        results.add(numericValue);
                    }
                }
            }
        }
        return results;
    }
}
