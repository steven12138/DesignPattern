package org.example.AbstratPattern.AbstractFactory.Shape.Impl;

import org.example.AbstratPattern.AbstractFactory.Shape.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle!");
    }
}
