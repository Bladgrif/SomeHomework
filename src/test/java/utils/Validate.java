package utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Validate {

    public static boolean validateLength(int[] arr, int expectedLength) {
        return arr.length == expectedLength;
    }

    public static boolean validateUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();
        return Arrays.stream(arr).allMatch(set::add);
    }

    public static boolean validateSum(int[] arr) {
        return Arrays.stream(arr).sum() == 0;
    }
}
