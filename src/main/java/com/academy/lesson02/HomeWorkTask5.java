package com.academy.lesson02;

import java.util.Scanner;

public class HomeWorkTask5 {
    public static void main (String[] args) {
        /*
        Сила тяжести на Луне составляет около 17% земной. Напишите программу, которая
		вычислила бы ваш вес на Луне.
		 - запросить земной вес с консоли
		 - вывести ваш вес на Земле
		 - вывести ваш вес на Луне
         */
        //Связываем сканер с консолью
        Scanner scanner = new Scanner(System.in);

        //Считываем земной вес с консоли
        System.out.println("Введите Ваш вес на Земле: ");
        double massOnEarth = scanner.nextInt();

        //Выводим земной вес на экран
        System.out.println("Ваш вес на Земле: " + massOnEarth);

        //Рассчитываем и выводим вес на Луне
        double massOnMoon = (massOnEarth / 100) * 17;
        System.out.println("Ваш вес на Луне: " + massOnMoon);

    }
}
