package algoritms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearch {

    @Test
    public void testBinarySearchFound() {
        int[] nums = {1, 2, 3, 4, 5};
        int result = binarySearch(nums, 4);
        assertEquals(3, result);  // Ожидаем, что индекс числа 4 будет 3
    }

    @Test
    public void testBinarySearchNotFound() {
        int[] nums = {1, 2, 3, 4, 5};
        int result = binarySearch(nums, 6);
        assertEquals(-1, result);  // Числа 6 в массиве нет, ожидаем -1
    }

    @Test
    public void testBinarySearchFirstElement() {
        int[] nums = {1, 2, 3, 4, 5};
        int result = binarySearch(nums, 1);
        assertEquals(0, result);  // Число 1 находится на индексе 0
    }

    @Test
    public void testBinarySearchLastElement() {
        int[] nums = {1, 2, 3, 4, 5};
        int result = binarySearch(nums, 5);
        assertEquals(4, result);  // Число 5 находится на индексе 4
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] nums = {};
        int result = binarySearch(nums, 1);
        assertEquals(-1, result);  // В пустом массиве результат всегда -1
    }

    @Test
    public void testBinarySearchSingleElementFound() {
        int[] nums = {1};
        int result = binarySearch(nums, 1);
        assertEquals(0, result);  // Единственный элемент найден на индексе 0
    }

    @Test
    public void testBinarySearchSingleElementNotFound() {
        int[] nums = {1};
        int result = binarySearch(nums, 2);
        assertEquals(-1, result);  // Число 2 не найдено в массиве из одного элемента
    }

    @Test
    public void testBinarySearchDuplicateElements() {
        int[] nums = {1, 2, 2, 2, 3};
        int result = binarySearch(nums, 2);
        assertTrue(result == 1 || result == 2 || result == 3);  // Может вернуть любой индекс с числом 2
    }


    public static int binarySearch(int[] nums, int number) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            int result = nums[middle];
            if (result == number) {
                return middle;
            } else if (result > number) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
