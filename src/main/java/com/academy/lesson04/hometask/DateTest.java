package com.academy.lesson04.hometask;

import com.academy.lesson8.exception.ht.CorrectDate;
import com.academy.lesson8.exception.ht.IllegalDateException;

public class DateTest {

    public static void main (String[] args) {

        try {
            CorrectDate date1 = new CorrectDate(21, 12, 2018, 34,45,45);
            CorrectDate date2 = new CorrectDate(21, 2, 2018,13,34,55);
            CorrectDate date3 = new CorrectDate(21, 22, 2018,11,23,10);

            System.out.println(date1);
            System.out.println(date2);
            System.out.println(date3);
        } catch (IllegalDateException e) {
            System.err.println("Ошибка: некорректная дата" + e.getMessage());
        }
            System.out.println("FINISH");
    }
}
