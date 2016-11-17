package entity;

/**
 * Created by Alex on 14.11.2016.
 */
class Birthdate {

    int day;
    int month;
    int year;

    String date;

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public Birthdate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Birthdate(String date) {
        this.date = date;
    }
}
