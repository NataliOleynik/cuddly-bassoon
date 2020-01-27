package com.academy.lesson05.hw05;

import com.academy.lesson8.exception.ht.CorrectDate;

public class HW5Date {
    public static void main(String[] args) {
        try {
            CorrectDate dateTime1 = new CorrectDate(15,11, 2019, 9,36, 45);
            CorrectDate dateTime2 = new CorrectDate(25,11, 2019, 23, 15,59);
            System.out.println(dateTime1);
            System.out.println(dateTime2);
            dateTime1.print();
            dateTime2.print();


        } catch (Exception e) {
            System.out.println("Ошибка: некорректная дата");
        }


    }

}
