import SomeHomework.SortedSquares;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestsSortedSquares {
    @Test
    void testSortedSquaresWithMixedNumbers() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        assertArrayEquals(expected, SortedSquares.sort(nums));
    }

    @Test
    void testSortedSquaresWithAllPositiveNumbers() {
        int[] nums = {1, 2, 3, 4, 5};
        int[] expected = {1, 4, 9, 16, 25};
        assertArrayEquals(expected, SortedSquares.sort(nums));
    }

    @Test
    void testSortedSquaresWithAllNegativeNumbers() {
        int[] nums = {-5, -4, -3, -2, -1};
        int[] expected = {1, 4, 9, 16, 25};
        assertArrayEquals(expected, SortedSquares.sort(nums));
    }

    @Test
    void testSortedSquaresWithZeros() {
        int[] nums = {0, 0, 0};
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, SortedSquares.sort(nums));
    }

    @Test
    void testSortedSquaresWithEmptyArray() {
        int[] nums = {};
        int[] expected = {};
        assertArrayEquals(expected, SortedSquares.sort(nums));
    }

    @Test
    void testSortedSquaresWithOneElement() {
        int[] nums = {5};
        int[] expected = {25};
        assertArrayEquals(expected, SortedSquares.sort(nums));
    }

    @Test
    void testSortedSquaresWithAllDuplicates() {
        int[] nums = {2, 2, 2};
        int[] expected = {4, 4, 4};
        assertArrayEquals(expected, SortedSquares.sort(nums));
    }

    @Test
    void testSortedSquaresWithMixedDuplicates() {
        int[] nums = {-3, -3, 2, 2};
        int[] expected = {4, 4, 9, 9};
        assertArrayEquals(expected, SortedSquares.sort(nums));
    }

    @Test
    void testSortedSquaresWithLargeNumbers() {
        int[] nums = {-10000, -5000, 0, 5000, 10000};
        int[] expected = {0, 25000000, 25000000, 100000000, 100000000};
        assertArrayEquals(expected, SortedSquares.sort(nums));
    }

    @Test
    void testSortedSquaresWithNegativeAndPositiveCloseValues() {
        int[] nums = {-2, -1, 1, 2};
        int[] expected = {1, 1, 4, 4};
        assertArrayEquals(expected, SortedSquares.sort(nums));
    }
}
