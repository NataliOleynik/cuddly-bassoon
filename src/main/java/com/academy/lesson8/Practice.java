package com.academy.lesson8;

public class Practice {
    public static void main(String[] args) {
        Object[] array = {"Kolya", 45, 56, "Ivan", "Helen", 34, 18, "Peter", "Boris", 15};

        // выводим только строки
        for (int i = 0; i < array.length; i++){
            if (array[i] instanceof String) {
                System.out.println(array[i]);
            }
        }

        // выводим только числа
        for (int j = 0; j < array.length; j++) {
            if (array[j] instanceof Integer) {
                System.out.println(array[j]);
            }
        }

        System.out.println("-------");
        Object[][] array2D = {{"Ivan", 34}, {"Kolya", 56}, {"Boris", 18}, {"Kolya", 18}, {"Peter", 15}, {"Helen", 45}, {"Kolya", 32}};


        // выводим только строки
        for (int n = 0; n < array2D.length; n++) {
                System.out.println(array2D[n][0]);
        }

        // выводим только числа другим методом -> alt+Enter -> "for" loop replace with "foreach"
        for (Object[] pair : array2D) {
            System.out.println(pair[1]);
        }
    }
}
