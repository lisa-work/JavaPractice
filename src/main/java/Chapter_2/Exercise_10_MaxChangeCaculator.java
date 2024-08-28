package Chapter_2;

import java.util.ArrayList;
import java.util.List;

public class Exercise_10_MaxChangeCalculator {
    static int calcMaxPossibleChange(List<Integer> values) {
        List<Integer> sortedNumbers = new ArrayList<>(values);
        sortedNumbers.sort(Integer::compareTo);
        int maxPossibleChange = 0;
        for (int currentValue : sortedNumbers) {
            if (currentValue > maxPossibleChange + 1)
                break;
            maxPossibleChange += currentValue;
        }
        return maxPossibleChange;
    }
}
