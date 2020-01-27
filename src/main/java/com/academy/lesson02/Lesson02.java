package com.academy.lesson02;

public class Lesson02 {
    public static void main (String[] args){

        //double тип данных
         double x = 1.1;
         double y = 3;
         double z = 5;

         System.out.println(x);
         System.out.println(y);
         System.out.println(z);

         double result = z-y-x;
         //результат при работе с примитивными типами может вернуться с потерями
         System.out.println(result);

         int m = Integer.MAX_VALUE;
         System.out.println(m+1);

         //операции
        int x1 = 10;
        x++; // x = x + 1; x += 1;
        System.out.println(x1);

        int y1 = 10;
        //System.out.print(++y1);
        System.out.print(y1);

        //Остаток от деления
        System.out.println("**Остаток от деления**");
        System.out.println(5 % 3);
        System.out.println(3 % 5);
        System.out.println(4 % 2);

        //Операторы сравнения
        System.out.println("*Операторы сравнения/логические**");
        int k1 = 20;
        int k2 = 30;
        System.out.println(k1 == k2);
        System.out.println(k1 != k2);
        System.out.println(k1 > k2);
        System.out.println(k1 < k2);


        System.out.println("====");
        System.out.println(k1 > 1 && k1 < 30);
        System.out.println(k1 > 1 && k1 < 20);
        System.out.println(k1 > 1 || k1 < 20);
        System.out.println(k1 > 20 || k1 < 20);

     //   boolean isCorrectNumber = k1> 20;
     //   System.out.println(!isCorrectNumber); // '!' перед выражением означени отрицание


        String str1 = "1";
        String str2 = "2";
        System.out.println(str1 + str2);
        System.out.println(str1 == str2);


        //пример того, как писать выражения НЕ нужно!
        int n1 = 20;
        int n2 = 5;
        int creazyresult = (++n1) + (n2--*3)-1;
        System.out.println(creazyresult);


        //Деление
        System.out.println("Деление");
        double z1 = 5;
        int z2 = 2;
        double div = z1/z2;
        double div2 = 5/2.0;
        System.out.println(div);
        System.out.println(div2);




    }
}
