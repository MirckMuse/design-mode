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
//����һ������������/�������࣬ͨ��������״����ɫ��Ϣ����ȡ������
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
