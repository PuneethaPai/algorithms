import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayMultiplyTest {
    @Test
    public void shouldReturnEmptyArrayForEmptyArray() {
        List result = new ArrayMultiply(new ArrayList<>()).compute();
        assertEquals(new ArrayList<>(), result);
    }

    @Test
    public void shouldReturnSameArrayWhenContainsSingleElement() {
        final List result = new ArrayMultiply(new ArrayList<>(Arrays.asList(1))).compute();
        assertEquals(Collections.singletonList(1), result);
    }

    @Test
    public void shouldComputeWhenContainsTwoElements() {
        final List result = new ArrayMultiply(new ArrayList<>(Arrays.asList(1, 2, 3))).compute();
        assertEquals(Arrays.asList(6, 3, 2), result);
    }

    @Test
    public void shouldComputeForRandomArrayElements() {
        final List result = new ArrayMultiply(new ArrayList<>(Arrays.asList(2, 1, 53, 21, 2, 3, 4, 5, 6))).compute();
        assertEquals(Arrays.asList(801360, 1602720, 30240, 76320, 801360, 534240, 400680, 320544, 267120), result);
    }
}
