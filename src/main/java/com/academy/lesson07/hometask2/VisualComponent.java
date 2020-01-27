package com.academy.lesson07.hometask2;

public interface VisualComponent {

    void draw();

    default void draw3D() {
        System.out.println("3D");
    }
}
