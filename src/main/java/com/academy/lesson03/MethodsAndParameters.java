package com.academy.lesson03;

import java.util.Arrays;

public class MethodsAndParameters {

    public static void main(String[] args) {
        String[] all = {"Andry", "Abdel", "Nataly", "Alyona", "Nataly", "Alyona", "Andry", "Abdel"};

        // Копируем в группы
        String[] group1 = Arrays.copyOf(all, 4);
        String[] group2 = Arrays.copyOfRange(all, 4, 8);

        // Выводим на консоль
        print(all, group1, group2);

        // Сравниваем группы
        checkGroups(group1, group2);
    }
    public static void print(String[] all, String[] group1, String[] group2) {
        System.out.println(Arrays.toString(all));
        System.out.println(Arrays.toString(group1));
        System.out.println(Arrays.toString(group2));
    }

    public static void checkGroups(String[] group1, String[] group2) {
        Arrays.sort(group1);
        Arrays.sort(group2);

        System.out.println(group1 == group2); // так не работает
        System.out.println("Group1 and Group2 are equal - " + Arrays.equals(group1, group2));
    }
}
