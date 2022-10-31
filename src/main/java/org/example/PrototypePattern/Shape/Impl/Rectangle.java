package org.example.PrototypePattern.Shape.Impl;

import org.example.PrototypePattern.Shape.Shape;

public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle!");
    }
}
