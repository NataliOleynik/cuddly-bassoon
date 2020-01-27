package com.academy.lesson04;

public class ButtonDemo {

    public static void main (String[] args) {
        //Button button1 = null;

        Button button0 = new Button(); //нет параметров
        Button button1 = new Button("Login"); //один параметр
        Button button2 = new Button("Login", "red", 25); //три параметра

        //button1.setText("Login");
        button1.setColor("red");
        button1.setHeight(25);
        button1.setHeight(-100);
        System.out.println(button1.getText());
        System.out.println(button1.getColor());
        System.out.println(button1.getHeight());


        //static
        Button button3 = new Button();
        System.out.println(Button.DEFAULT_HEIGHT);
        Button.printHelp();

    }
}
