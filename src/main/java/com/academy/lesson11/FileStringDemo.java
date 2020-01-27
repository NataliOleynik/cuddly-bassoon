package com.academy.lesson11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileStringDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // Прочитать из файла 10 имён
        String inPath = "/home/natalia/Documents/женские имена.txt";
        BufferedReader br = new BufferedReader(new FileReader(inPath));
        br.lines() // Возвращает stream
                .limit(10)
                .forEach(System.out::println);
    }
}
