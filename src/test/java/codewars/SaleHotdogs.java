package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaleHotdogs {

    @Test
    public void BasicTests() {
        assertEquals(100,SaleHotdogs.saleHotdogs(1));
        assertEquals(400,SaleHotdogs.saleHotdogs(4));
        assertEquals(475,SaleHotdogs.saleHotdogs(5));
        assertEquals(855,SaleHotdogs.saleHotdogs(9));
        assertEquals(900,SaleHotdogs.saleHotdogs(10));
        assertEquals(9000,SaleHotdogs.saleHotdogs(100));
    }

    public static int saleHotdogs(final int n){
        if (n<5) {
            return n*100;
        } else if (n<10){
            return n*95;
        } else {
            return n*90;
        }
    }
}
