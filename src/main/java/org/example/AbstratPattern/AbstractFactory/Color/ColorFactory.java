package org.example.AbstratPattern.AbstractFactory.Color;


import org.example.AbstratPattern.AbstractFactory.AbstractFactory;
import org.example.AbstratPattern.AbstractFactory.Color.Impl.Blue;
import org.example.AbstratPattern.AbstractFactory.Color.Impl.Green;
import org.example.AbstratPattern.AbstractFactory.Color.Impl.Red;
import org.example.AbstratPattern.AbstractFactory.Shape.Shape;
import org.example.AbstratPattern.AbstractFactory.Shape.ShapeType;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeType shapeName) {
        return null;
    }

    @Override
    public Color getColor(ColorType name) {
        if (name == ColorType.Red) return new Red();
        if (name == ColorType.Green) return new Green();
        if (name == ColorType.Blue) return new Blue();
        return null;
    }
}
