package com.academy.lesson03;

public class HomeWork03Task01 {
    public static void main (String[] args) {
        /*
        Напишите программу, которая:
	        - считывает строку
	        - выводит исходную строку
	        - выводит количество и список слов, которые начинаются на букву 'D'
         */
        //Инициализируем и выводим на консоль строку
        String words = "Daria David Natalia Vadim Anna Tatiana Mark";
        System.out.println("Исходная строка: " + words);

        //Разбиваем строку на слова
        String[] breakString = words.split(" ");
        System.out.println("Количество слов: " + breakString.length);

        for (int i = 0; i < breakString.length; i++){
            if (breakString[i].startsWith("D"))
            System.out.println("Слова на D: " + breakString[i]);
        }
    }
}
