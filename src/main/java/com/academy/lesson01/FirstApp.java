package com.academy.lesson01;

import java.util.Scanner;

public class FirstApp {
    public static void main(String[] args) {
        // выводим сообщение на консоль
        System.out.println("My first project");

        // прочитаем с консоли
        // связываем сканер с консолью
        Scanner scanner = new Scanner(System.in);

        // введём имя
        System.out.println("Введите имя: ");
        String firstName = scanner.next();

        //введём отчество
        System.out.println("Введите отчество: ");
        String patronymicName = scanner.next();

        // введём фамилию
        System.out.println("Введите фамилию: ");
        String lastName = scanner.next();

        // введём возраст
        System.out.println("Введите возвраст: ");
        int age = scanner.nextInt();

        // введём пол
        System.out.println("Выберите пол (м/ж): ");
        String sex = scanner.next();

        // введем номер
        System.out.println("Введите номер (10 цифр): ");
        int phone = scanner.nextInt();

        System.out.println(String.format("First name %s, Patronymic name %s, Last name %s, Age %d, Sex %s, Phone %d", firstName, patronymicName, lastName, age, sex, phone));
    }
}
