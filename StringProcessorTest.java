import org.junit.Test;

import static org.junit.Assert.*;

public class StringProcessorTest {

    @Test
    public void testNum1Correct() {
        StringProcessor str = new StringProcessor();
        String s = "";
        s = str.num1("a", 4);
        assertEquals("aaaa", s);
        System.out.println(s);
    }

    @Test
    public void testNum1Fail() {
        StringProcessor str = new StringProcessor();
        str.num1("a", -2);
    }

    @Test
    public void testNum2Correct(){
        StringProcessor str = new StringProcessor();
        int count = str.num2("abcabc", "b" );
        assertEquals(2, count);
    }

    @Test
    public void testNum2Fail(){
        StringProcessor str = new StringProcessor();
        str.num2("abcabc", "");
    }

    @Test
    public void testNum3(){
        StringProcessor str = new StringProcessor();
        String s = "";
        s = str.num3("241231");
        assertEquals("два4одиндватриодин", s);
        System.out.println(s);
    }

    @Test
    public void testNum4(){
        StringProcessor str = new StringProcessor();
        StringBuilder s = new StringBuilder("123456789");
        str.Num4(s);
        assertEquals("13579", s.toString());
        System.out.println(s);
    }
}