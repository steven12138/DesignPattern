package org.example.PrototypePattern;

import org.example.PrototypePattern.Shape.Shape;
import org.example.PrototypePattern.Shape.ShapeCache;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shape1 = ShapeCache.getShape("1");
        Shape shape2 = ShapeCache.getShape("2");
        Shape shape3 = ShapeCache.getShape("3");
        shape1.draw();
        shape2.draw();
        shape3.draw();

    }
}
