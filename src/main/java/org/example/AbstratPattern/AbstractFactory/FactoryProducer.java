package org.example.AbstratPattern.AbstractFactory;

import org.example.AbstratPattern.AbstractFactory.Color.ColorFactory;
import org.example.AbstratPattern.AbstractFactory.Shape.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(factoryType type) {
        if (type == factoryType.ColorFactory) return new ColorFactory();
        if (type == factoryType.ShapeFactory) return new ShapeFactory();
        return null;
    }
}
