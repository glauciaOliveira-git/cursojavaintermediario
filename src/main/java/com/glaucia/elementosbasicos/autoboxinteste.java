/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.elementosbasicos;

/**
 *
 * @author Glaucia Oliveira
 */
public class autoboxinteste {
    
     public static void main(String[] args) {
         
         //autoboxin
         short num1 = 1;//new Short ((short)1 );
         byte num2 = 10;
         int num9 = 100;
         long num4 = 1000l;
         float num5 = 3.5F;
         double num6 = 3.5555;
         boolean flag = true;
         char a  = 'a';
         
         //auto-un boxing
         int num13 = num9;//nun9.iniValue()
         
         //autoboxin em expressões
         num9++;
         System.out.println(num9);
         
         //auto unboxing do numero 9 -> autoboxin do num13/num9 -> num14
         Integer num14 = num13/num9;
         
         
         
     }
    
}
