import org.junit.Test;

import static org.junit.Assert.*;

public class FinanceReportProcessorTest {

    @Test
    public void fullNameSymbol() {
        Payment x1 = new Payment("Ленин В.И.", 3, 3, 2022, 100);
        Payment y1 = new Payment("Ленин В.И.", 4, 3, 2022, 123);
        Payment z1 = new Payment("Путин В.В.", 5, 12, 2022, 1024);
        Payment w1 = new Payment("Ленин В.И.", 6, 3, 2022, 100);
        Payment[] arr1 = new Payment[]{x1, y1, z1, w1};
        FinanceReport obj1 = new FinanceReport(arr1, "Пушкин А.С.", 9, 3, 2022);
        Payment x2 = new Payment("Ленин В.И.", 3, 3, 2022, 100);
        Payment y2 = new Payment("Ленин В.И.", 4, 3, 2022, 123);
        Payment w2 = new Payment("Ленин В.И.", 6, 3, 2022, 100);
        Payment[] arr2 = new Payment[]{x2, y2, w2};
        FinanceReport obj2 = new FinanceReport(arr2, "Пушкин А.С.", 9, 3, 2022);
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

    }
}