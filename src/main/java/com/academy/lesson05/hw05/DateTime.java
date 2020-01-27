package com.academy.lesson05.hw05;

import java.util.Objects;

public class DateTime extends Date {
    protected int hour;
    protected int minute;
    protected int second;

    public DateTime() {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public DateTime(int day, int month, int year, int hour, int minute, int second) {
        super(day, month, year);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public DateTime(DateTime dateTime) {
        this.hour = dateTime.hour;
        this.minute = dateTime.minute;
        this.second = dateTime.second;
    }

    public void set(int hour, int minute, int second) {
        if (isValidDateTime(hour, minute, second)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public void set(DateTime dateTime) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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

    protected boolean isValidDateTime (int hour, int minute, int second) {
        if (hour > 24 || hour < 0)
            return false;

        if (minute > 59 || minute < 0)
            return false;

        if (second > 59 || second < 0)
            return false;

        return true;
    }

    public void print() {
        print(false);
//        System.out.println(day + "." + month + "." + year + "  " + hour + ":" + minute + ":" + second);
    }

    public void print(boolean isTimeFormat12) {
        if (!isTimeFormat12) {
            if (hour > 12)
            System.out.println(day + "." + month + "." + year + "  " + (hour-12)  + ":" + minute + ":" + second + "pm");
            else
                System.out.println(day + "." + month + "." + year + "  " + hour + ":" + minute + ":" + second + "am");
        } else
            System.out.println(day + "." + month + "." + year + "  " + hour + ":" + minute + ":" + second);
    }

    @Override
    public String toString () {
        return hour + ":" + minute + ":" + second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DateTime)) return false;
        if (!super.equals(o)) return false;
        DateTime dateTime = (DateTime) o;
        return hour == dateTime.hour &&
                minute == dateTime.minute &&
                second == dateTime.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hour, minute, second);
    }

//    public void nextHour() {
//        if (hour > 24) {
//            setDay(++day);
//        }
//        else
//            return ++hour;
//    }

    public int nextMinute() {
        return ++minute;
    }

    public int nextSecond() {
        return ++second;
    }


}
