package com.Singleton;

/**
 * Created by S.H.I.E.L.D on 2017/3/29 0029.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
