package com.academy.lesson03;

public class HomeWork03Task03 {
    public static void main(String[] args) {
        /*
        Напишите программу, которая:
	    - считывает строку
	    - считывает подстроку
	    - выводит исходные строку и подстроку и выводит кол-во вхождений строки в подстроку
        */

        //Инициализируем и выводим на консоль строку
        String str = "string substring stringsubsTring substring";
        String sub = "substring";

        //Выводим исходную строку и подстроку
        System.out.println("Исходна строка: " + str);
        System.out.println("Подстрока: " + sub);

        //Считаем кол-во вхождений в строку и подстроку
        int count = 0;
        int i = 0;
        while (true) {
            i = str.indexOf(sub, i);
            if (i == -1)
                break;
            count++;
            i++;
        }
        System.out.println("Кол-во вхождений в подстроку: " + count);
    }
}