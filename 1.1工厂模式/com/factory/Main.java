/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.factory;

/**
 *
 * @author S.H.I.E.L.D
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Sharp sharp1=shapeFactory.getSharp("circle");
        sharp1.draw();
        Sharp sharp2=shapeFactory.getSharp("rectangle");
        sharp2.draw();
        Sharp sharp3=shapeFactory.getSharp("Square");
        sharp3.draw();
    }
    
}
