import SomeHomework.Task;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.Validate.*;

public class TestGetUniqueDistinctNumbersList {


    @ValueSource(ints = {0, 1, 2, -1, -2, 3, 4, 999, Integer.MAX_VALUE-100000})
    @ParameterizedTest
    void checkingDifferentLengths(int length) {
        int[] arr = Task.getUniqueDistinctNumbersList(length);
        assertTrue(validateLength(arr, length));
        assertTrue(validateUnique(arr));
        assertTrue(validateSum(arr));
        System.out.println(Arrays.toString(arr));
    }
}
