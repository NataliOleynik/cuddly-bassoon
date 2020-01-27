package com.academy.lesson07;

import static com.academy.lesson06.Gender.FEMALE;
import static com.academy.lesson06.Gender.MALE;

public class ObjectArray {
    public static void main(String[] args) {
        Object[] array = {"Peter", MALE, 23};
        System.out.println("Имя: " + array[0] + " Пол: " + array[1] + " Возраст: " + array[2]);
        System.out.println("-------------");

        Object[][] listOfPeople = new Object[4][3];
        listOfPeople[0] = array;
        listOfPeople[1] = new Object[]{"Ann", FEMALE, 25};
        listOfPeople[2] = new Object[]{"Natalia", FEMALE, 24};
        listOfPeople[3] = new Object[]{"Vadim", MALE, 26};

        for (int i = 0; i < listOfPeople.length; i++) {
            System.out.println("Имя: " + listOfPeople[i][0] + " Пол: " + listOfPeople[i][1] + " Возраст: " + listOfPeople[i][2]);
        }
    }
}
