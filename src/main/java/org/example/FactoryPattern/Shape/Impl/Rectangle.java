package org.example.FactoryPattern.Shape.Impl;

import org.example.FactoryPattern.Shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Rectangle!");
    }
}
