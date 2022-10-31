package org.example.AbstratPattern.AbstractFactory.Color.Impl;

import org.example.AbstratPattern.AbstractFactory.Color.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Fill Blue");
    }
}
