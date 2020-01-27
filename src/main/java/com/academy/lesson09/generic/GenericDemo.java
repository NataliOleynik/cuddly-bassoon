package com.academy.lesson09.generic;

public class GenericDemo {
    public static void main(String[] args) {
        Pair pair = new Pair();
        pair.setValue1("Hello");
        pair.setValue2(123);

        String str = (String) pair.getValue1();
        int n = (Integer) pair.getValue2();

        System.out.println("str: " + str + " n: " + n);


        PairGen<String, Integer> pairGen = new PairGen<>();
        pairGen.setValue1("Congratulation");
        pairGen.setValue2(18);

        str = pairGen.getValue1();
        n = pairGen.getValue2();

        System.out.println("str: " + str + " n: " + n);


        PairGen<String, String> pairGen2 = new PairGen<>();
        pairGen2.setValue1("Hello");
        pairGen2.setValue2("World");

        PairGenExt<String, Number> pairGen3 = new PairGenExt<>();
        PairGenExt<String, Integer> pairGen4 = new PairGenExt<>();

        print(pairGen);
//        print(pairGen2);  // не работает после добавления метода print2
    }

    private static void print(PairGen<?, ?> pair) {
        System.out.println(pair);

    }

    private static void print2(PairGen<?, ? extends Number> pair) {
        System.out.println(pair);

    }
}
