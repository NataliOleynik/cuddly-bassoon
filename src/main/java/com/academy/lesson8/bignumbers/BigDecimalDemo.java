package com.academy.lesson8.bignumbers;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(1.0/3);
        BigDecimal b1 = new BigDecimal("1");
        BigDecimal b2 = new BigDecimal("3");
        BigDecimal result = b1.divide(b2, 10, RoundingMode.CEILING);
        System.out.println(result);

        BigDecimal b3 = new BigDecimal("2.0");
//        b3.setScale(3);
        BigDecimal b4 = new BigDecimal("2.00");
//        b4.setScale(3);

        System.out.println(b3 == b4);
        System.out.println(b3.equals(b4));
        System.out.println(b3.compareTo(b4)); //возвращает 0, если значения равны, 1 - если нет

    }
}
