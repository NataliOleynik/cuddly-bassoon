package com.academy.lesson04;

import java.util.Arrays;

public class PracticeMethod2 {

    public static void main(String[] args) {

        String names = "petrov,Ivanov ,KiRill, Helen ";
        // => [Petrov, Ivanov, Kirill, Helen]
        String[] preparedNames = names.split(",");
        System.out.println(Arrays.toString(preparedNames));

        for (int i = 0; i < preparedNames.length; i++) {

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

        String[] preparedNames2 = names.split(",");
        // => [Petrov, Ivanov ,Kirill, Helen];
        for (int i = 0; i < preparedNames2.length; i++) {
            // 1) обрежем пробелы
            preparedNames2[i] = preparedNames2[i].trim();
            // 2) все символы в нижий регистр
            preparedNames2[i] = preparedNames2[i].toLowerCase();
            // 3) 1-ый символ в верхний регистр
            String firstLetter = Character.toString(preparedNames2[i].charAt(0));
            preparedNames2[i] = preparedNames2[i].replaceFirst(firstLetter, firstLetter.toUpperCase());
            System.out.println(preparedNames2[i]);
        }
        System.out.println(Arrays.toString(preparedNames2));

        //========================================

        String[] preparedNames3 = names.split(",");
        // => [Petrov, Ivanov ,Kirill, Helen];
        for (int i = 0; i < preparedNames3.length; i++) {
            // 1) обрежем пробелы
            preparedNames3[i] = preparedNames3[i].trim();
            // 2) все символы в нижий регистр
            char[] letters = preparedNames3[i].toCharArray();
            letters[0] = Character.toUpperCase(letters[0]);
            for (int j = 1; j < letters.length; j++) {
                letters[j] = Character.toLowerCase(letters[j]);
            }
            preparedNames3[i] = new String(letters);
        }
        System.out.println(Arrays.toString(preparedNames3));

    }
}