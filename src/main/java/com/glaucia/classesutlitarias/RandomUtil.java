/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.classesutlitarias;

import java.util.Random;

/**
 *
 * @author Glaucia Oliveira
 */
public class RandomUtil {
    
     public static void main (String []args){
        
         System.out.println(Math.floor(Math.random()*100));
         
         Random aleatorio = new Random();
         
            System.out.println(aleatorio.nextInt());
            
              System.out.println(aleatorio.nextInt(5+1));
         
         
         
         
     }
    
}
