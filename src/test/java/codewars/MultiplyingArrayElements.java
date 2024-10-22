package codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultiplyingArrayElements {

    @Test
    public void check() {

        assertEquals(6, grow(new int[]{1, 2, 3}));
        assertEquals(16, grow(new int[]{4, 1, 1, 1, 4}));
        assertEquals(64, grow(new int[]{2, 2, 2, 2, 2, 2}));

        assertEquals(6, growByStream(new int[]{1, 2, 3}));
        assertEquals(16, growByStream(new int[]{4, 1, 1, 1, 4}));
        assertEquals(64, growByStream(new int[]{2, 2, 2, 2, 2, 2}));
    }

    public static int grow(int[] x) {
        if (x == null || x.length == 0) {
            throw new IllegalArgumentException("пустой массив");
        }
        int sum = 1;
        for (int number : x) {
            sum *= number;
        }
        return sum;
    }

    public static int growByStream(int[] x) {
        if (x == null || x.length == 0) {
            throw new IllegalArgumentException("пустой массив");
        }

        return Arrays.stream(x)
                .reduce(1, (a, b) -> a * b);
    }

}