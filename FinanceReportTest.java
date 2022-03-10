import org.junit.Test;

import static org.junit.Assert.*;

public class FinanceReportTest {

    @Test
    public void testToString() {
        Payment x = new Payment("Ленин В.И.", 3, 3, 2022, 100);
        Payment y = new Payment("Ленин В.И.", 4, 3, 2022, 123);
        Payment z = new Payment("Ленин В.И.", 5, 12, 2022, 1024);
        Payment w = new Payment("Ленин В.И.", 6, 3, 2022, 100);
        Payment[] arr = new Payment[]{x, y, z, w};
        FinanceReport exm = new FinanceReport(arr, "Пушкин А.С.", 9, 3, 2022);
        String str1 = "Автор: Пушкин А.С., дата: 09.03.2022 Платежи:[\n" +
                "Плательщик: Ленин В.И., дата: 03.03.2022, сумма: 1 руб. 0 коп.,\n" +
                "Плательщик: Ленин В.И., дата: 04.03.2022, сумма: 1 руб. 23 коп.,\n" +
                "Плательщик: Ленин В.И., дата: 05.12.2022, сумма: 10 руб. 24 коп.,\n" +
                "Плательщик: Ленин В.И., дата: 06.03.2022, сумма: 1 руб. 0 коп.]";
        String str2 = exm.toString();
        assertEquals(str1, str2);
        System.out.println(str2);
    }
}