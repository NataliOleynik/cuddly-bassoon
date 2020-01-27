package com.academy.lesson09.hw;

// Generic - Task1

public class GenArrayTest {
    public static void main(String[] args) throws WrongIndexException {
        GenArray<String> word = new GenArray<>(new String[3]);

        try {
            word.set(3,"Test1");
            System.out.println(word.get(0));

        } catch (WrongIndexException e) {
            System.out.println("Ошибка: превышение лимита");
            System.out.println("Подробности: " + e.getMessage());
        }
            catch (Exception e) {
            System.out.println("Неизвестная ошибка");
    }

        GenArray<Integer> numbers = new GenArray<>(new Integer[5]);

        numbers.set(1, 5);
        System.out.println(numbers.get(1));

    }
}
