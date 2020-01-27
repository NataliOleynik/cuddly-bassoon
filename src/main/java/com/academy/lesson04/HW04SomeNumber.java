package com.academy.lesson04;

public class HW04SomeNumber {
    /*
    1) Предположим, имеется следующий класс.
    class SomeNumber {
        private int n; } // единственное поле класса
    a) Реализуйте конструктор без параметров (по умолчанию инициализируем 0)
    b) Конструктор, с одним параметром (int n)
    c) Метод int getN();
    d) Метод int setN();
    e) Метод print(); //который выводит строку, напр: "Число: 5"
    f) Метод boolean isPositive(); // которые возвращает true, если число положительное и false, если число отрицательное
    private int n;
     */
    private int n;
    // Конструктор без параметров (по умолчанию инициализируем 0)
    public HW04SomeNumber() {}

    // Конструктор, с одним параметром (int n)
    public HW04SomeNumber(int n) {
        this.n = n;
    }

    // Метод int getN()
    public int getN() {
        return n;
    }

    // Метод int setN()
    public void setN(int n) {
        this.n = n;
    }

    // Метод, который выводит строку, напр: "Число: 5"
    public void print() {
        System.out.println("Number: " + n);
    }

    // Метод, которые возвращает true, если число положительное и false, если число отрицательное
    public boolean isPositive() {
        if (n >= 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
