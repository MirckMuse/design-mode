package com.Singleton;

import sun.security.provider.SHA;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by S.H.I.E.L.D on 2017/3/29 0029.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeID) {
        Shape cachedshape = shapeMap.get(shapeID);
        return (Shape) cachedshape.clone();
    }

    public static void loadcache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }

}
