package com.academy.lesson8.ht;

public class LambdaDemo {
    public static void main(String[] args) {
        StringFunction converter = String::toUpperCase;
        String str = "hello";
        System.out.println(converter.convert(str));

        StringFunction replacer = s -> s.replaceAll(" ", "");
        String str2 = "hello hello hello";
        System.out.println(replacer.convert(str2));
    }
}
