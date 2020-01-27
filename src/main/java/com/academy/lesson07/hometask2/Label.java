package com.academy.lesson07.hometask2;

public class Label extends Component {

    public void draw() {
        System.out.println("Label");
    }

    @Override
    public void draw3D() {
        System.out.println("Label 3d");
    }
}
