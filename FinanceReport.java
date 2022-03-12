import java.util.ArrayList;
import java.util.Collection;

public class FinanceReport {
    private ArrayList<Payment> arrPayment;
    private static String FullNameAuthor;
    private static int day, month, year;

    public FinanceReport(String fullNameAuthor, int day, int month, int year) {
        this.arrPayment = new ArrayList<>();
        FullNameAuthor = fullNameAuthor;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public FinanceReport(FinanceReport orig){
        this.FullNameAuthor = orig.FullNameAuthor;
        this.day = orig.day;
        this.month = orig.month;
        this.year = orig.year;
        this.arrPayment = new ArrayList<>();
        for (int i = 0; i < orig.numPm(); i++) {
            arrPayment.add(orig.getPayment(i));
        }
    }

    public int numPm() {
        return arrPayment.size();
    }

    public static int getDay() {
        return day;
    }

    public static int getMonth() {
        return month;
    }

    public static int getYear() {
        return year;
    }

    public static String getFullNameAuthor() {
        return FullNameAuthor;
    }

    public Payment getPayment(int i) {
        return arrPayment.get(i);
    }

    public void setPayment(int i, Payment x) {
        arrPayment.add(i, x);
    }

    public void setPayment(Payment x) {
        arrPayment.add(x);
    }


    public String toString(){
        String str = String.format("Автор: %s, дата: %02d.%02d.%d Платежи:[", FullNameAuthor, day, month, year);
        for (int i = 0; i < arrPayment.size(); i++) {
            str += String.format("\nПлательщик: %s, дата: %02d.%02d.%d, сумма: %d руб. %d коп.", arrPayment.get(i).getFullName(),
                    arrPayment.get(i).getDay(), arrPayment.get(i).getMonth(), arrPayment.get(i).getYear(), arrPayment.get(i).getAmountPm()/100,
                    arrPayment.get(i).getAmountPm()%100);
            if (i + 1 < arrPayment.size()){
                str += ",";
            }
        }
        str += "]";
        return str;
    }

}
