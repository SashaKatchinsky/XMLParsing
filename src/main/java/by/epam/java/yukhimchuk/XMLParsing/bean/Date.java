package by.epam.java.yukhimchuk.XMLParsing.bean;

import java.util.StringTokenizer;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date() { }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date(String str){
        StringTokenizer stringTokenizer = new StringTokenizer(str , "-");
        year = Integer.parseInt((String)stringTokenizer.nextElement());
        month = Integer.parseInt((String)stringTokenizer.nextElement());
        day = Integer.parseInt((String)stringTokenizer.nextElement());
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

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
