package arrayProblems;

import java.util.Arrays;
import java.util.List;

public class LongestSortedArray {
    private final List<Integer> input;

    public LongestSortedArray(Integer... input) {
        this.input = Arrays.asList(input);
    }

    public List compute() {
        if (input.isEmpty()) return input;
        return Arrays.asList(input.get(0));
    }
}
