package org.example.Singleton;

public class Singleton {
    private Singleton() {
    }

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello World From Singleton" + this.hashCode());
    }
}
