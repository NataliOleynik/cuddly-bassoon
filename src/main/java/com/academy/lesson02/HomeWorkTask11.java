package com.academy.lesson02;

import java.util.Scanner;

public class HomeWorkTask11 {
    public static void main (String[] args) {

        /* Проинициализировать одномерный массив произвольными целыми числами
	    Вывести массив в виде, например:
		[3, 4, 9, 10, 34, 239, 8, 0, -3, 19, 17]
		a) используя цикл for
		b) используя цикл while
		*/

        //Объявляем массив и его длину
        int size = 7;
        int[] nums = new int[size];

        //Связываем сканер с консолью
        Scanner scanner = new Scanner(System.in);

        //Ввод массива с консоли
        for (int i = 0; i < size; i++)
        {
            System.out.print ("Введите массив: ");
            for (i = 0; i < size; i++) {
                nums[i] = scanner.nextInt();
            }
        }

        /*
        //Вывод массива c помощью цикла for
        for (int i = 0; i < size; i++)
        {
            System.out.print(" " +nums[i]);
        }
         */

        //Вывод массива c помощью цикла while
        int n = 0;
        while (n < size)
        {
            System.out.print(" " +nums[n]);
            n++;
        }




    }
}
