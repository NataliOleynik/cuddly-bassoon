package com.academy.lesson03;

public class HomeWork03Task02 {


    public static void main (String[] args) {
        /*
        Напишите программу, которая:
	    - считывает строку
	    - выводит исходную строку
	    - выводит количество и список слов, которые заканчиваются буквами 'ED'
        */

        //Инициализируем и выводим на консоль строку
        String str1 = "Before I learned software development, API sounded like a kind of beer.";
        System.out.println("Исходная строка: " + str1);

        //Разбиваем строку на слова
        String[] breakString = str1.split(" ");
        System.out.println("Количество слов: " + breakString.length);

        for (int i = 0; i < breakString.length; i++){
            if (breakString[i].endsWith("ed"))
                System.out.println("Слова которые заканчиваются буквами 'ed' : " + breakString[i]);
        }
    }
}