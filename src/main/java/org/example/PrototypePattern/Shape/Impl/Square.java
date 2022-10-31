package org.example.PrototypePattern.Shape.Impl;

import org.example.PrototypePattern.Shape.Shape;

public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Draw Square!");
    }
}
