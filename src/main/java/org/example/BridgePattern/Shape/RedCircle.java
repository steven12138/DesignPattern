package org.example.BridgePattern.Shape;

public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Red Circle" + radius + " {" + x + " " + y + "}");
    }
}
