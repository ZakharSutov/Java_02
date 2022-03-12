import org.junit.Test;

import static org.junit.Assert.*;

public class FinanceReportProcessorTest {

    @Test
    public void fullNameSymbol() {
        Payment x1 = new Payment("Ленин В.И.", 3, 3, 2022, 100);
        Payment y1 = new Payment("Ленин В.И.", 4, 3, 2022, 123);
        Payment z1 = new Payment("Путин В.В.", 5, 12, 2022, 1024);
        Payment w1 = new Payment("Ленин В.И.", 6, 3, 2022, 100);
        FinanceReport obj1 = new FinanceReport("Пушкин А.С.", 9, 3, 2022);
        obj1.setPayment(x1);
        obj1.setPayment(y1);
        obj1.setPayment(z1);
        obj1.setPayment(w1);
        Payment x2 = new Payment("Ленин В.И.", 3, 3, 2022, 100);
        Payment y2 = new Payment("Ленин В.И.", 4, 3, 2022, 123);
        Payment z2 = new Payment("Ленин В.И.", 6, 3, 2022, 100);
        FinanceReport obj2 = new FinanceReport("Пушкин А.С.", 9, 3, 2022);
        obj2.setPayment(x2);
        obj2.setPayment(y2);
        obj2.setPayment(z2);
        String str1 = obj2.toString();
        FinanceReportProcessor obj4 = new FinanceReportProcessor();
        FinanceReport obj3 = obj4.FullNameSymbol(obj1, 'Л');
        String str2 = obj3.toString();
        assertEquals(str1, str2);
        System.out.println(str1);
        System.out.println(str2);
    }

    @Test
    public void sizeValue() {
        Payment x1 = new Payment("Ленин В.И.", 3, 3, 2022, 100);
        Payment y1 = new Payment("Ленин В.И.", 4, 3, 2022, 123);
        Payment z1 = new Payment("Путин В.В.", 5, 12, 2022, 1024);
        Payment w1 = new Payment("Ленин В.И.", 6, 3, 2022, 100);
        FinanceReport obj1 = new FinanceReport("Пушкин А.С.", 9, 3, 2022);
        obj1.setPayment(x1);
        obj1.setPayment(y1);
        obj1.setPayment(z1);
        obj1.setPayment(w1);
        Payment x2 = new Payment("Ленин В.И.", 3, 3, 2022, 100);
        Payment z2 = new Payment("Ленин В.И.", 6, 3, 2022, 100);
        FinanceReport obj2 = new FinanceReport("Пушкин А.С.", 9, 3, 2022);
        obj2.setPayment(x2);
        obj2.setPayment(z2);
        String str1 = obj2.toString();
        FinanceReportProcessor obj4 = new FinanceReportProcessor();
        FinanceReport obj3 = obj4.sizeValue(obj1, 101);
        String str2 = obj3.toString();
        assertEquals(str1, str2);
        System.out.println(str1);
        System.out.println(str2);
    }
}