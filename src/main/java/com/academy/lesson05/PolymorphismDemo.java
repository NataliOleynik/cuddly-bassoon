package com.academy.lesson05;

public class PolymorphismDemo {
    public static void main (String[] args) {
        Figure figure1 = new Circle(5);
        Figure figure2 = new Square(10);
        Figure figure3 = new Circle(25);


        Figure[] figures = new Figure[3];
        figures[0] = figure1;
        figures[1] = figure2;
        figures[2] = figure3;


        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
        System.out.println("-------");
        if (figures[0] instanceof Circle)
            (figures[0]).draw();
         if (figures[1] instanceof Square)
            (figures[1]).draw();
         if (figures[2] instanceof Circle)
            (figures[2]).draw();
    }
}
