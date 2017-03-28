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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //��ȡ��״����
      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

      //��ȡ��״Ϊ Circle �Ķ���
      Sharp shape1 = shapeFactory.getSharp("CIRCLE");

      //���� Circle �� draw ����
      shape1.draw();

      //��ȡ��״Ϊ Rectangle �Ķ���
      Sharp shape2 = shapeFactory.getSharp("RECTANGLE");

      //���� Rectangle �� draw ����
      shape2.draw();
      
      //��ȡ��״Ϊ Square �Ķ���
      Sharp shape3 = shapeFactory.getSharp("SQUARE");

      //���� Square �� draw ����
      shape3.draw();

      //��ȡ��ɫ����
      AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

      //��ȡ��ɫΪ Red �Ķ���
      Color color1 = colorFactory.getColor("RED");

      //���� Red �� fill ����
      color1.fill();

      //��ȡ��ɫΪ Green �Ķ���
      Color color2 = colorFactory.getColor("Green");

      //���� Green �� fill ����
      color2.fill();

      //��ȡ��ɫΪ Blue �Ķ���
      Color color3 = colorFactory.getColor("BLUE");

      //���� Blue �� fill ����
      color3.fill();
    }
    
}
