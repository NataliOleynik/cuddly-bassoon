package com.academy.lesson02;

public class HomeWorkTask13 {
    public static void main (String[] args) {
        /*
        Нарисовать треугольник заданной размерности. Пример для размера 6:
        *
        **
        ***
        ****
        *****
        ******
         */
        int i, j;
        for (i = 7; i > 0; i--){
            for (j = i; j < 7; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
