package com.academy.lesson11;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        // Прочитать из файла 10 имён
        String inPath = "/home/natalia/Documents/женские имена.txt";
        String outPath = "/home/natalia/Documents/результат программы с женскими именами.txt";

        BufferedReader br = new BufferedReader(new FileReader(inPath));
        PrintWriter pw = new PrintWriter(new FileWriter(outPath));

//        String name = br.readLine();
//        System.out.println(name);
//        String name2 = br.readLine();
//        System.out.println(name2);

        // Читаем все имена до конца цикла
        String nextName;
        while ((nextName = br.readLine())!=null) {
            pw.println(nextName);
            System.out.println(nextName);
        }

        br.close();
        pw.close();
    }
}
