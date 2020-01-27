package com.academy.lesson02;

import java.util.Scanner;

public class HomeWork02 {
    public static void main (String [] args) {
        /*
        Написать программу ввода с клавиатуры последовательно 3 чисел.
        Вывести минимальное максимальное и средние значения.
        */

        //Связываем сканер с консолью
        Scanner scanner = new Scanner(System.in);

        //Объявляем массив и его длину
        int size = 3;
        double [] myArray = new double[size];

        //Вывод сообщения
        System.out.print ("Введите массив: ");
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }

        System.out.print ("Вывод полученного массива на экран: ");
        for (int i = 0; i < size; i++) {

            //Выводим на экран полученный массив
            System.out.print (" " + myArray[i]);
        }

        double min = Double.MAX_VALUE;

        // Перебираем все элементы массива.
        for (int i = 0; i < myArray.length; i++) {
            // Переменной min с помощью метода Math.min() присваиваем минимальное значение
            // путем выбора наименьшего из двух значений ("старого" значения min и значения элемента).
            min = Math.min(min, myArray[i]);
        }
        System.out.println("Минимальный элемент в массиве myArray: " + min);

        double max = Double.MIN_VALUE;

        // Перебираем все элементы массива.
        for (int i = 0; i < myArray.length; i++) {
            // Переменной min с помощью метода Math.max() присваиваем минимальное значение
            // путем выбора наименьшего из двух значений ("старого" значения max и значения элемента).
            max = Math.max(max, myArray[i]);
        }
        System.out.println("Максимальный элемент в массиве myArray: " + max);

        double srArifmetic = (max + min) / 2;
        System.out.println("Среднее арифметическое значение массива myArray: " + srArifmetic);
    }
}
