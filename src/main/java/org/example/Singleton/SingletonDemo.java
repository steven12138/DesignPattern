package org.example.Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        //Singleton object = new Singleton(); Compile Error

        Singleton object = Singleton.getInstance();
        object.sayHello();

        Singleton object2 = Singleton.getInstance();
        object2.sayHello();
    }
}
