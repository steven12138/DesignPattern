package org.example.AbstratPattern.AbstractFactory.Shape.Impl;

import org.example.AbstratPattern.AbstractFactory.Shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Rectangle!");
    }
}
