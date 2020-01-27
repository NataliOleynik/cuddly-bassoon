package com.academy.lesson05.hw05;

import java.util.Objects;

public class Date {
    protected int day;
    protected int month;
    protected int year;

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(Date date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    public void set(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;

        if (year % 100 == 0)
            return false;

        if (year % 4 == 0)
            return true;

        return false;
    }

    public void set(Date date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    protected boolean isValidDate (int day, int month, int year) {
        if (month > 12 || month < 1)
            return false;

        if (day < 1)
            return false;

        if (month == 2) {
            if (isLeapYear(year)) {
                if (day > 29)
                    return false;
            } else {
                if (day > 28)
                    return false;
            }
        }

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day > 31)
                return false;
        } else {
            if (day > 30)
                return false;
        }

        if (year > 3000 || year < 0)
            return false;

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date)) return false;
        Date date = (Date) o;
        return day == date.day &&
                month == date.month &&
                year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }

    public void print() {
        System.out.println(day + "." + month + "." + year);
    }

    public int nextDay() {
        return ++day;
    }

    public int nextMonth() {
        return ++month;
    }

    public int nextYear() {
        return ++year;
    }

}
