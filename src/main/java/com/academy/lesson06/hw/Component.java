package com.academy.lesson06.hw;

public class Component {
    String color;
    String text;

    public Component() {
    }

    public Component(String color, String text) {
        this.color = color;
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String style) {
        this.text = text;
    }

    public void draw() {
            System.out.println("Component");
        }
}
