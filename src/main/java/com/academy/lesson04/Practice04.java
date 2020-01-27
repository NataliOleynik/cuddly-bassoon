package com.academy.lesson04;

import java.util.Arrays;

public class Practice04 {
    public static void main (String[] args) {

        String names = "petrov,Ivanov ,KiRill, Helen ";
        // => [Petrov, Ivanov, Kirill, Helen]
        String[] preparedNames = names.split(",");
        System.out.println(Arrays.toString(preparedNames));
        for (int i = 0; i < preparedNames.length; i++){

            //удаляем пробелы перед именем
            preparedNames[i] = preparedNames[i].trim();

            //все символы переводим в нижний регистр
            preparedNames[i] = preparedNames[i].toLowerCase();

            //1-ый символ переводим в верхний регистр
            Character firstLetter = preparedNames[i].charAt(0);
            firstLetter = Character.toUpperCase(firstLetter);

            //выводим все остальные символы нижнего региста и склеиваем строки
            String lastLetters = preparedNames[i].substring(1);
            preparedNames[i] = firstLetter + lastLetters;

            System.out.println(preparedNames[i]);
        }

    }
}
