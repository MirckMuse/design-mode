/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abstractfactoty;

/**
 *
 * @author S.H.I.E.L.D
 */
public class SharpFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Sharp getSharp(String stape) {
        if (stape == null) {
            return null;
        }
        if (stape.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (stape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (stape.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }

}
