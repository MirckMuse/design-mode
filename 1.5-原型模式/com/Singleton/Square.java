package com.Singleton;

/**
 * Created by S.H.I.E.L.D on 2017/3/29 0029.
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
