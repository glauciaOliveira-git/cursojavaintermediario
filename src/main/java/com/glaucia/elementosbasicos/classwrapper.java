/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.elementosbasicos;

/**
 *
 * @author Glaucia Oliveira
 */
public class classwrapper {
    
     public static void main(String[] args) {
         
         short num1 = 1;
         byte num2 = 10;
         int num3 = 100;
         long num4 = 1000l;
         float num5 = 3.5F;
         double num6 = 3.5555;
         boolean flag = true;
         char a  = 'a';
         
          Short num7 = new Short ((short)1 );
          Byte num8 = new Byte ((byte)10);
          Integer num9 = new Integer (100);
          Long num10 = new Long (1000l);
          Float num11 = new Float (3.5F);
          Double num12 = new Double (3.5555);
          Boolean flag2 = new Boolean (true);
          Character b = new Character ('b');
         
          
          Integer num13 = new Integer ("100");
          
          Double num14 = new Double ("3.5");
          
          System.out.println(num13.intValue());
          System.out.println(num13.longValue());
          
          Long num15 = num13.longValue();
          
          //no int16 a String foi transformada para um valor inteiro
          int num16 = Integer.parseInt("1000");
          
          double num17 = Double.parseDouble("3.5");
          System.out.println(num17);
          
          Integer num18 = Integer.valueOf("242424");
          
          
          
          
          
                         
     }
    
}
