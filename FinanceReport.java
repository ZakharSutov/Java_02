
public class FinanceReport {
    private static Payment[] arrPayment;
    private static String FullNameAuthor;
    private static int day, month, year;

    public FinanceReport(Payment[] arrPayment, String fullNameAuthor, int day, int month, int year) {
        this.arrPayment = arrPayment;
        FullNameAuthor = fullNameAuthor;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public FinanceReport(FinanceReport orig){
        FullNameAuthor = orig.FullNameAuthor;
        day = orig.day;
        month = orig.month;
        year = orig.year;
        for (int i = 0; i < orig.numPm(); i++){
            arrPayment[i] = new Payment(orig.getPayment(i));
        }
    }

    public int numPm() {
        return arrPayment.length;
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
        return arrPayment[i];
    }

    public void setPayment(int i, Payment x) {
        arrPayment[i] = x;
    }

    public String toString(){
        String str = String.format("Автор: %s, дата: %02d.%02d.%d Платежи:[", FullNameAuthor, day, month, year);
        for (int i = 0; i < arrPayment.length; i++) {
            str += String.format("\nПлательщик: %s, дата: %02d.%02d.%d, сумма: %d руб. %d коп.", arrPayment[i].getFullName(),
                    arrPayment[i].getDay(), arrPayment[i].getMonth(), arrPayment[i].getYear(), arrPayment[i].getAmountPm()/100,
                    arrPayment[i].getAmountPm()%100);
            if (i + 1 < arrPayment.length){
                str += ",";
            }
        }
        str += "]";
        return str;
    }

}
