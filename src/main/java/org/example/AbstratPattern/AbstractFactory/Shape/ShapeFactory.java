package org.example.AbstratPattern.AbstractFactory.Shape;


import org.example.AbstratPattern.AbstractFactory.AbstractFactory;
import org.example.AbstratPattern.AbstractFactory.Color.Color;
import org.example.AbstratPattern.AbstractFactory.Color.ColorType;
import org.example.AbstratPattern.AbstractFactory.Shape.Impl.Circle;
import org.example.AbstratPattern.AbstractFactory.Shape.Impl.Rectangle;
import org.example.AbstratPattern.AbstractFactory.Shape.Impl.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeType shapeName) {
        if (shapeName == ShapeType.Circle) return new Circle();
        if (shapeName == ShapeType.Square) return new Square();
        if (shapeName == ShapeType.Rectangle) return new Rectangle();
        return null;
    }

    @Override
    public Color getColor(ColorType colorName) {
        return null;
    }
}
