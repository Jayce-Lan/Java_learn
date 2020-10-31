package ArrayDemo;

public class Date {
    private int year, month, day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * 比较两个对象大小
     * @param date
     * @return
     */
    public int compare(Date date) {
        return this.year > date.year ? 1
                : this.year < date.year ? -1
                : this.month > date.month ? 1
                : this.month < date.month ? -1
                : this.day > date.day ? 1
                : this.day < day ? -1 : 0;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}