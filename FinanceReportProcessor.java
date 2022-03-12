
public class FinanceReportProcessor {
    public static FinanceReport FullNameSymbol(FinanceReport x, char s) {
        FinanceReport y = new FinanceReport(x.getFullNameAuthor(), x.getDay(), x.getMonth(), x.getYear());
        int count = 0;
        for (int i = 0; i < x.numPm(); i++) {
            if (x.getPayment(i).getFullName().charAt(0) == s) {
                y.setPayment(count, x.getPayment(i));
                count++;
            }
        }
        return y;
    }

    public static FinanceReport sizeValue(FinanceReport x, int value) {
        FinanceReport y = new FinanceReport(x.getFullNameAuthor(), x.getDay(), x.getMonth(), x.getYear());
        int count = 0;
        for (int i = 0; i < x.numPm(); i++) {
            if (x.getPayment(i).getAmountPm() < value) {
                y.setPayment(count, x.getPayment(i));
                count++;
            }
        }
        return y;
    }
}