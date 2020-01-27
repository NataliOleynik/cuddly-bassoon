package com.academy.lesson04;

import java.util.Scanner;

public class HW04SomeNumberTest {
    public static void main (String[] args) {

        // Создаём экземпляр класса
        HW04SomeNumber num = new HW04SomeNumber();
        HW04SomeNumber num2 = new HW04SomeNumber(3);

        // Вызываем метод print()
        num2.print();

        // Связываем сканер с консолью
        Scanner scan = new Scanner(System.in);

        // Ввод значения с консоли
        System.out.println("Enter value: ");
        num2.setN(scan.nextInt());

        // Вызов метода isPositive()
        if (num2.isPositive())
            System.out.println("Value is positive");
        else
            System.out.println("Value is negative");

    }
}
