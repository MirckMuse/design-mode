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
//创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("SHape")) {
            return new SharpFactory();
        }else if(choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
    
}
