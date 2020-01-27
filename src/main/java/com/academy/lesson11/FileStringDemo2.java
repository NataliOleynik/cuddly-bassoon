package com.academy.lesson11;

import java.io.*;

public class FileStringDemo2 {
    public static void main(String[] args) throws IOException {
        String inPath = "/home/natalia/Documents/женские имена.txt";
        String outPath = "/home/natalia/Documents/результат программы с женскими именами stream.txt";

        BufferedReader br = new BufferedReader(new FileReader(inPath));
        PrintWriter pw = new PrintWriter(new FileWriter(outPath));
        br.lines() //возвращает stream
                .limit(15)
                .peek(pw::println)
                .forEach(System.out::println);

        br.close();
        pw.close();

    }
}
