import java.util.ArrayList;
import java.util.Arrays;

public class FinanceReportProcessor {
    public static  FinanceReport FullNameSymbol(FinanceReport x, char s){
        Payment[] arr = new Payment[x.numPm()];
        for (int i = 0; i < x.numPm(); i++){
            if (x.getPayment(i).getFullName().charAt(0) == s){
                arr[i] = x.getPayment(i);
            }
        }
        FinanceReport y = new FinanceReport(arr, x.getFullNameAuthor(), x.getDay(), x.getMonth(), x.getYear());
        return y;
    }

    public static  FinanceReport sizeValue(FinanceReport x, int value){
        Payment[] arr = new Payment[0];
        ArrayList<Payment> list = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < x.numPm(); i++){
            if (x.getPayment(i).getAmountPm() < value){
                list.remove(x.getPayment(i));
                arr = list.toArray(new Payment[list.size()]);
            }
        }
        FinanceReport y = new FinanceReport(arr, x.getFullNameAuthor(), x.getDay(), x.getMonth(), x.getYear());
        return y;
    }
}
