package org.example.AbstratPattern.AbstractFactory.Color.Impl;

import org.example.AbstratPattern.AbstractFactory.Color.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("fill Red!");
    }
}
