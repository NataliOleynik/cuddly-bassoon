package com.academy.lesson06.hw;

public class DemoComponent {
    public static void main(String[] args) {

        Component[] components = new Component[10];
        components[0] = new Label("black", "Welcome");
        components[1] = new Button("blue", "Log in");
        components[2] = new RoundButton("green", "YES");
        components[3] = new CheckBox("green", "Remember user");
        components[4] = new Component("no color", "no name");
        components[5] = new RoundButton("red", "NO");
        components[6] = new Button("blue", "Sign up");
        components[7] = new Button("grey", "Back to Home");
        components[8] = new CheckBox("red", "Are you of legal age?");
        components[9] = new Label("orange", "Click here");

        System.out.println("All array items");
        for (int i = 0; i < components.length; i++) {
            components[i].draw();
        }

        System.out.println("Only Button's child objects");
        for (int j = 0; j < components.length; j++) {
            if (components[j] instanceof Button) {
                System.out.println(components[j]);
            }
        }
    }
}
