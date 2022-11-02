package org.example.BridgePattern;

import org.example.BridgePattern.Shape.Circle;
import org.example.BridgePattern.Shape.GreenCircle;
import org.example.BridgePattern.Shape.RedCircle;
import org.example.BridgePattern.Shape.Shape;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
