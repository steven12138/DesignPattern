package org.example.AbstratPattern;


import org.example.AbstratPattern.AbstractFactory.AbstractFactory;
import org.example.AbstratPattern.AbstractFactory.Color.Color;
import org.example.AbstratPattern.AbstractFactory.Color.ColorType;
import org.example.AbstratPattern.AbstractFactory.FactoryProducer;
import org.example.AbstratPattern.AbstractFactory.Shape.Shape;
import org.example.AbstratPattern.AbstractFactory.Shape.ShapeType;
import org.example.AbstratPattern.AbstractFactory.factoryType;

public class AbstractFactoryDemo {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory(factoryType.ShapeFactory);
        Shape shape1 = shapeFactory.getShape(ShapeType.Circle);
        Shape shape2 = shapeFactory.getShape(ShapeType.Square);
        Shape shape3 = shapeFactory.getShape(ShapeType.Rectangle);
        shape1.draw();
        shape2.draw();
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory(factoryType.ColorFactory);
        Color color1 = colorFactory.getColor(ColorType.Red);
        Color color2 = colorFactory.getColor(ColorType.Green);
        Color color3 = colorFactory.getColor(ColorType.Blue);
        color1.fill();
        color2.fill();
        color3.fill();
    }
}
