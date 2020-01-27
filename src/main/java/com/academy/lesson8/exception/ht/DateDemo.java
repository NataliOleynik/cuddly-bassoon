package com.academy.lesson8.exception.ht;

public class DateDemo {
    public static void main(String[] args) {
        try {
            CorrectDate date1 = new CorrectDate(15,11, 2019, 12,12,12);
            CorrectDate date2 = new CorrectDate(15,11, 2019,16,45,33);
            System.out.println(date1);
            System.out.println(date2);
        } catch (Exception e) {
            System.out.println("Ошибка: некорректная дата");
        }
    }
}
