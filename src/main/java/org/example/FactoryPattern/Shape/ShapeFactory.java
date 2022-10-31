package org.example.FactoryPattern.Shape;

import org.example.FactoryPattern.Shape.Impl.Circle;
import org.example.FactoryPattern.Shape.Impl.Rectangle;
import org.example.FactoryPattern.Shape.Impl.Square;

public class ShapeFactory {
    public Shape getShape(ShapeName name) {
        if (name == ShapeName.Circle) return new Circle();
        if (name == ShapeName.Square) return new Square();
        if (name == ShapeName.Rectangle) return new Rectangle();
        return null;
    }
}
