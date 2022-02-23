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

    public int numPm() {
        return arrPayment.length;
    }

    public Payment getPayment(int i) {
        return arrPayment[i];
    }

    public void setPayment(int i, Payment x) {
        arrPayment[i] = x;
    }

    /*public static String toString(){
        String str = String.format("Автор: %s, дата: %d.$d.%d Платежи:[/n", FullNameAuthor, day, month, year);
        for (int i = 0; i < arrPayment.length(); i++) {
            str += String.format("Плательщик: %s, дата: %d.%d.%d, сумма: %руб. коп./n",);
        }
        return str;
    }*/
}
