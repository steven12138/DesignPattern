package org.example.PrototypePattern.Shape;


import org.example.PrototypePattern.Shape.Impl.Circle;
import org.example.PrototypePattern.Shape.Impl.Rectangle;
import org.example.PrototypePattern.Shape.Impl.Square;
import org.w3c.dom.css.Rect;

import java.util.Hashtable;

public class ShapeCache {
    private static final Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return cachedShape.clone();
    }

    public static void add(Shape shape) {
        shapeMap.put(shape.getId(), shape);
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        add(circle);

        Square square = new Square();
        square.setId("2");
        add(square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        add(rectangle);
    }
}
