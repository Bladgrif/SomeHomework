package codewars;

import org.junit.jupiter.api.Test;

import static java.lang.Math.abs;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Bob {
    @Test
    public void testBob() {
        assertEquals(0, enough(10, 5, 5));
        assertEquals(10, enough(100, 60, 50));
        assertEquals(0, enough(20, 5, 5));
    }

    public static int enough(int cap, int on, int wait){
        // your code here
        if (cap-(on+wait)>0) {
            return 0;
        } else {
            return (abs(cap-(on+wait)));
        }
    }
}
