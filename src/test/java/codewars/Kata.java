package codewars;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Kata {

    private void runTest(int[] expected, int[] input) {
        assertArrayEquals(expected, Kata.invert(input), () -> String.format("Input: %s", Arrays.toString(input)));
    }

    @Test
    @DisplayName("Sample Tests")
    void sampleTests() {
        runTest(new int[]{-1, -2, -3, -4, -5}, new int[]{1, 2, 3, 4, 5});
        runTest(new int[]{-1, 2, -3, 4, -5}, new int[]{1, -2, 3, -4, 5});
        runTest(new int[]{1, 2, 3, 4, 5}, new int[]{-1, -2, -3, -4, -5});
        runTest(new int[]{}, new int[]{});
        runTest(new int[]{0}, new int[]{0});
    }

    public static int[] invert(int[] array) {

//        for (int i = 0; i < array.length ; i++) {
//            array[i] = -1 * array[i];
//        }
//        return array;
        return Arrays.stream(array)
                .map(i -> -i)
                .toArray();
    }
}
