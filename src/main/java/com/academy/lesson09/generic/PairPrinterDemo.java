package com.academy.lesson09.generic;

public class PairPrinterDemo {
    public static void main(String[] args) {
        PairPrinter<Integer, String> pairPrinter = new PairPrinterImpl<>();
        pairPrinter.print(1, "ololo");

        PairPrinterImpl2 pairPrinterImpl2 = new PairPrinterImpl2();
        pairPrinterImpl2.print("Bingo", 121212);
    }
}
