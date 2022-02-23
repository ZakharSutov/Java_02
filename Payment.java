import java.util.Objects;

public class Payment {
    private int day, month, year, amountPm;
    private String FullName;

    public Payment(String FullName, int day, int month, int year, int amountPm) {
        this.FullName = FullName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.amountPm = amountPm;
    }

    public Payment() {
        this.FullName = "";
        this.day = 0;
        this.month = 0;
        this.year = 0;
        this.amountPm = 0;
    }

    public String getFullName() {
        return FullName;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getAmountPm() {
        return amountPm;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAmountPm(int amountPm) {
        this.amountPm = amountPm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return day == payment.day && month == payment.month && year == payment.year && amountPm == payment.amountPm && FullName.equals(payment.FullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year, amountPm, FullName);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", amountPm=" + amountPm +
                ", FullName='" + FullName + '\'' +
                '}';
    }
}
