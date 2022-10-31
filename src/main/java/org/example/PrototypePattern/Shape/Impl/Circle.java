package org.example.PrototypePattern.Shape.Impl;

import org.example.PrototypePattern.Shape.Shape;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle!");
    }
}
