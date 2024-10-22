package codewars;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Sequence {

    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},Sequence.reverse(5));
    }

    public static int[] reverse(int n){
        int [] numbers = new int[n];
        for (int i = 0; i < n ; i++) {
            numbers[i] = n-i;
        }
        return numbers;
//        return IntStream.rangeClosed(1,n)
//                .map (i -> n-i+1)
//                .toArray();
    }

}
