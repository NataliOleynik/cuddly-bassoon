package com.academy.lesson02;

public class Iteration {

    public static void main (String[] args){

        for(int i = 0; i < 10; i++) {
            int result = i;
            if (result % 2 == 1)
            System.out.println(i);
        }


        //упр
        System.out.print("1..9");
        for (int i=1; i <= 9; i+=2) {
          System.out.println(i);
        }


        System.out.println("Сумма от 1 до 9");
        int sum = 0;
        for(int i = 1; i <= 9; i++) {
            sum += i; //sum = sum + i;
            System.out.println(sum);

        }

    }

}
