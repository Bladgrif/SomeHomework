package SomeHomework;

import java.util.Arrays;

public class SortedSquares {


    public static int[] sort(int[] nums) {
        return Arrays.stream(nums)
                .map(x -> x * x)
                .sorted()
                .toArray();
    }



}
