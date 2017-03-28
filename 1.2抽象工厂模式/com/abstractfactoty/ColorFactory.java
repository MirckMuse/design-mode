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
public class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        if (color==null) {
            return null;
        }
        if (color.equalsIgnoreCase("red")) {
            return new Red();
        }else if(color.equalsIgnoreCase("green")){
            return new Green();
        }else if(color.equalsIgnoreCase("blue")){
            return new Blue();
        }
        return null;
    }

    @Override
    Sharp getSharp(String stape) {
        return null;
    }
    
}
