import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentTest {

    @Test
    public void testEquals() {
        Payment x = new Payment("Ленин В.И.", 3, 3, 2022, 100);
        Payment y = new Payment("Ленин В.И.", 3, 3, 2022, 100);
        boolean ans = false;
        ans = y.equals(x);
        assertEquals(true, ans);
    }

    @Test
    public void testToString() {
        Payment x = new Payment("Ленин В.И.", 3, 3, 2022, 100);
        String s = x.toString();
        assertEquals("Payment{day=3, month=3, year=2022, amountPm=100, FullName='Ленин В.И.'}", s);
        System.out.println(s);
    }

    /*@Test
    public void testHashCode() {
        Payment x = new Payment("Ленин В.И.", 3, 3, 2022, 100);
        int y = x.hashCode();
        assertEquals(3, y);
    }*/

}