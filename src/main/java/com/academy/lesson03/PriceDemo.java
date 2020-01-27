package com.academy.lesson03;

public class PriceDemo {
    public static void main(String[] args) {

        String[] priceRaw = {"4 418?грн", "43 418?грн", "4 418?$"};
       // int price = Integer.parseInt(replaced);
        //System.out.println(price == 4418);

    }

    public static String preparePrice(String priceRaw) {
        return priceRaw.replaceAll("[^\\d]", "");
    }
}
