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
public class ShapeFactory {

    public Sharp getSharp(String sharpType) {
        if (sharpType == null) {
            return null;
        }
        if (sharpType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }else if(sharpType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else if(sharpType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
