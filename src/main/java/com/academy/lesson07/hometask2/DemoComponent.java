package com.academy.lesson07.hometask2;

public class DemoComponent {
    public static void main(String[] args) {
        VisualComponent[] components = new Component[3];
        components[0] = new Button();
        components[1] = new Label();
        components[2] = new CheckBox();

        for (int i = 0; i < components.length; i++) {
            components[i].draw();
            components[i].draw3D();
        }
    }
}
