package org.example.FactoryPattern;

import org.example.FactoryPattern.Shape.ShapeFactory;
import org.example.FactoryPattern.Shape.ShapeName;
import org.example.FactoryPattern.Shape.Shape;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape(ShapeName.Circle);
        Shape square = shapeFactory.getShape(ShapeName.Square);
        Shape rectangle = shapeFactory.getShape(ShapeName.Rectangle);
        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
