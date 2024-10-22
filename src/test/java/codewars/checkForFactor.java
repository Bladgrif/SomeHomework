package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class checkForFactor {

    @Test
    public void basicTests() {
        assertTrue(checkForFactor.checkForFactor_base(10, 2));
        assertTrue(checkForFactor.checkForFactor_base(63, 7));
        assertTrue(checkForFactor.checkForFactor_base(2450, 5));
        assertTrue(checkForFactor.checkForFactor_base(24612, 3));
    }

    public static boolean checkForFactor_base(int base, int facto) {
        return (base % facto == 0);
    }
}
