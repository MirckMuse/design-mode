package com.Singleton;

/**
 * Created by S.H.I.E.L.D on 2017/4/11 0011.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [color:red,radius:"
                + radius + ",x:" + x + ",y:" + y + "]");
    }
}
