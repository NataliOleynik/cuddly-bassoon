package com.academy.lesson02;

import java.util.Scanner;

public class HomeWorkTask7 {
    public static void main (String[] args) {

        /* В переменных q и w хранятся два натуральных числа.
        Создайте программу, выводящую на экран результат деления q на w с остатком.
         */

        //Связываем сканер с консолью
        Scanner scanner = new Scanner(System.in);

        //Считываем q с консоли
        System.out.println("Введите q: ");
        int q = scanner.nextInt();

        //Считываем w с консоли
        System.out.println("Введите w: ");
        int w = scanner.nextInt();

        //Выводим значения q, w
        System.out.println("Значение q: " + q);
        System.out.println("Значение w: " + w);

        //Выводим результат целочисленного деления
        int division = q / w;
        System.out.println("Результат целочисленного деления: " + division);

        //Выводим остаток от деления
        int remainder = q % w;
        System.out.println("Остаток от деления: " + remainder);

    }
}
