package by.epam.java.yukhimchuk.XMLParsing.bean;

import java.util.StringTokenizer;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() { }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ":");
        hour = Integer.parseInt((String) stringTokenizer.nextElement());
        minute = Integer.parseInt((String) stringTokenizer.nextElement());
        second = Integer.parseInt((String) stringTokenizer.nextElement());
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}