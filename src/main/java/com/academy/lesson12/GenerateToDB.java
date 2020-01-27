package com.academy.lesson12;

import com.academy.lesson06.Gender;
import com.academy.lesson06.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GenerateToDB {
    private final static int COUNT = 100;
    private static String pathMaleNames = "/home/natalia/Documents/мужские имена.txt";
    private static String pathFemaleNames = "/home/natalia/Documents/женские имена.txt";
    private static String pathMaleLastNames = "/home/natalia/Documents/мужские фамилии.txt";
    private static String pathFemaleLastNames = "/home/natalia/Documents/женские фамилии.txt";
    private static Random random = new Random();

    private static List<String> maleFirstNames;
    private static List<String> femaleFirstNames;
    private static List<String> maleLastNames;
    private static List<String> femaleLastNames;

    public static void main(String[] args) throws Exception {
        fillLists();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/subscriber?user=root&serverTimezone=UTC&useUnicode=true&characterEncoding=utf8");
        PreparedStatement ps = connection.prepareStatement("insert into abonent(first_name, last_name, gender, age) values (?, ?, ?, ?)");
        for (int i = 1; i <= COUNT; i++) {
            Person person = nextPerson();
            ps.setString(1, person.getFirstName());
            ps.setString(2, person.getLastName());
            // Тернарный оператор <условие> ? true : false
            ps.setString(3, person.getGender() == Gender.MALE ? "m" : "f");
// if (person.getGender() == Gender.MALE)
// ps.setString(3, "m");
// else
// ps.setString(3, "f");
            ps.setInt(4, person.getAge());
            ps.execute();
        }
        ps.close();
        connection.close();
    }

    private static void fillLists() throws IOException {
        maleFirstNames = read(pathMaleNames);
        femaleFirstNames = read(pathFemaleNames);
        maleLastNames = read(pathMaleLastNames);
        femaleLastNames = read(pathFemaleLastNames);
    }

    private static Person nextPerson() throws IOException {
        Gender gender = random.nextBoolean() ? Gender.MALE : Gender.FEMALE;
        String firstName = gender == Gender.MALE ?
                maleFirstNames.get(random.nextInt(maleFirstNames.size())) :
                femaleFirstNames.get(random.nextInt(femaleFirstNames.size()));

        String lastName =  gender == Gender.MALE ?
                maleLastNames.get(random.nextInt(maleLastNames.size())) :
                femaleLastNames.get(random.nextInt(femaleLastNames.size()));

        int age = 5 + random.nextInt(85);
        return new Person(firstName, lastName, gender, age);
    }

    private static List<String> read(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        List<String> result = br.lines()
                .collect(Collectors.toList());
        br.close();

        return result;
    }
}