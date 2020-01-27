package com.academy.lesson8.exception.ht;


import com.academy.lesson05.hw05.DateTime;

public class CorrectDate extends DateTime {
    public CorrectDate(int day, int month, int year, int hour, int minute, int second) throws IllegalDateException {
//        super(day, month, year);

        if (!isValidDate(day, month, year))
            throw new IllegalDateException(" Incorrect date value ");

        this.day = day;
        this.month = month;
        this.year = year;

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

}
