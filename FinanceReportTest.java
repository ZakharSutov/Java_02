import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FinanceReportTest {

    @Test
    public void testToString() {
        Payment x = new Payment("Ленин В.И.", 3, 3, 2022, 100);
        Payment y = new Payment("Ленин В.И.", 4, 3, 2022, 123);
        Payment z = new Payment("Ленин В.И.", 5, 12, 2022, 1024);
        Payment w = new Payment("Ленин В.И.", 6, 3, 2022, 100);
        FinanceReport exm = new FinanceReport("Пушкин А.С.", 9, 3, 2022);
        exm.setPayment(x);
        exm.setPayment(y);
        exm.setPayment(z);
        exm.setPayment(w);
        String str1 = "Автор: Пушкин А.С., дата: 09.03.2022 Платежи:[\n" +
                "Плательщик: Ленин В.И., дата: 03.03.2022, сумма: 1 руб. 0 коп.,\n" +
                "Плательщик: Ленин В.И., дата: 04.03.2022, сумма: 1 руб. 23 коп.,\n" +
                "Плательщик: Ленин В.И., дата: 05.12.2022, сумма: 10 руб. 24 коп.,\n" +
                "Плательщик: Ленин В.И., дата: 06.03.2022, сумма: 1 руб. 0 коп.]";
        String str2 = exm.toString();
        assertEquals(str1, str2);
        System.out.println(str1);
        System.out.println(str2);
    }

    @Test
    public void testReportAuthor(){
        FinanceReport exm = new FinanceReport("Пушкин А.С.", 9, 3, 2022);
        FinanceReport exm1 = new FinanceReport("Лермантов М.Ю.", 9, 3, 2022);
        assertNotEquals(exm.getFullNameAuthor(), exm1.getFullNameAuthor());

    }

    @Test
    public void testFinanceReportCopy(){
        Payment x = new Payment("Ленин В.И.", 3, 3, 2022, 100);
        Payment y = new Payment("Ленин В.И.", 4, 3, 2022, 123);
        Payment z = new Payment("Ленин В.И.", 5, 12, 2022, 1024);
        Payment w = new Payment("Ленин В.И.", 6, 3, 2022, 100);
        FinanceReport exm = new FinanceReport("Пушкин А.С.", 9, 3, 2022);
        exm.setPayment(x);
        exm.setPayment(y);
        exm.setPayment(z);
        exm.setPayment(w);
        FinanceReport exm1 = new FinanceReport(exm);
        String str1 = exm1.toString();
        exm.getPayment(1).setFullName("Сталин И.В.");
        String str2 = exm1.toString();
        assertEquals(str1, str2);
    }
}