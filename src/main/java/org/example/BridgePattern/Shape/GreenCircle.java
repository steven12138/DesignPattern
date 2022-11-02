package org.example.BridgePattern.Shape;

public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Green Circle" + radius + " {" + x + " " + y + "}");
    }
}
