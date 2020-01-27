package com.academy.lesson09.collection;

import com.academy.lesson06.Gender;
import com.academy.lesson06.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Person p1 = new Person(1L, "Helen", Gender.FEMALE);
        Person p2 = new Person(21L, "Vadim", Gender.MALE);
        Person p3 = new Person(11L, "Natalia", Gender.FEMALE);
        Person p4 = new Person(15L, "David", Gender.MALE);
        Person p5 = new Person(16L, "Ашот", Gender.MALE);


        Map<Long, Person> persons = new HashMap<>();
        persons.put(p1.getId(), p1);
        persons.put(p2.getId(), p2);
        persons.put(p3.getId(), p3);
        persons.put(p4.getId(), p4);
        persons.put(p5.getId(), p5);

        persons.remove(16L);
        System.out.println(persons);

        Set<Long> keys = persons.keySet();
        Collection<Person> personsAsList = persons.values();
        System.out.println(keys);
        System.out.println(personsAsList);

        for (Map.Entry<Long, Person> item: persons.entrySet()) {
            System.out.println("Next person");
            System.out.println("key->" + item.getKey());
            System.out.println("value->" + item.getValue());
        }



    }
}
