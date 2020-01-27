package com.academy.lesson02;

public class Array {
    public static void main  (String[] agrs) {

        //массивы
        String[] words = {"A", "B", "C", "D"};
        words[0] = "ololo";
        words[1] = "trololo";
        words[2] = "mimimi";
        words[3] = "hohoho";

        //       System.out.println(words[2]);

        for (int i = 0; i < words.length; i++) //чтобы каждый раз, когда добавляем эл-т в массиве не менять в цикле значение мы его заменили на words.length
            System.out.println(words[i]);

        for (int i = 0; i < words.length; i++)
            if (words[i] != null)
                System.out.println(words[i]);
    }
}
