package com.academy.lesson06.hw;

public class Label extends Component {

    public Label(String color, String text) {
        super(color, text);
    }

    public void draw() {
        System.out.println("Label");
    }
}
