package objectDemo1.person;

public class BirthData {
    private int year;
    private int month;
    private int day;

    public BirthData(int _year, int _month, int _day) {
        this.year = _year;
        this.month = _month;
        this.day = _day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void display() {
        System.out.println
                (this.year + "-" + this.month + "-" + this.day);
    }
}
