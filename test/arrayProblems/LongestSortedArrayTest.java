package arrayProblems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class LongestSortedArrayTest {
    @Test
    public void shouldReturnEmptyArrayForEmptyArray() {
        final LongestSortedArray longestSortedArray = new LongestSortedArray();
        assertEquals(new ArrayList(), longestSortedArray.compute());
    }

    @Test
    public void shouldReturnSameArrayWhenHasSingleElement() {
        final LongestSortedArray longestSortedArray = new LongestSortedArray(1);
        assertEquals(Collections.singletonList(1), longestSortedArray.compute());
    }

    @Test
    public void shouldReturnFirstElementWhenArrayInDescendingOrder() {
        final LongestSortedArray longestSortedArray = new LongestSortedArray(3,2,1);
        assertEquals(Collections.singletonList(3), longestSortedArray.compute());
    }
}
