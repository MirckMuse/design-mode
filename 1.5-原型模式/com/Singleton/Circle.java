package com.Singleton;

/**
 * Created by S.H.I.E.L.D on 2017/3/29 0029.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() mothod.");
    }
}
