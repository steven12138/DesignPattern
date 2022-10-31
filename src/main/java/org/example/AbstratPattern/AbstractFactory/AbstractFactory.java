package org.example.AbstratPattern.AbstractFactory;

import org.example.AbstratPattern.AbstractFactory.Color.Color;
import org.example.AbstratPattern.AbstractFactory.Color.ColorType;
import org.example.AbstratPattern.AbstractFactory.Shape.Shape;
import org.example.AbstratPattern.AbstractFactory.Shape.ShapeType;

public abstract class AbstractFactory {

    public abstract Shape getShape(ShapeType shapeName);

    public abstract Color getColor(ColorType colorName);
}
