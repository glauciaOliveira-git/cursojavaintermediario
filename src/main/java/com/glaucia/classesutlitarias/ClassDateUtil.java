/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.classesutlitarias;

/**
 *
 * @author Glaucia Oliveira
 */
import java.util.Date;

public class ClassDateUtil {
    
    public static void main (String []args){
        
        Date hoje = new Date();
      System.out.println(hoje);
      
      System.out.println("Milesegundos desde 11 de novembro 1977" + hoje.getTime());
      
      System.out.println(hoje.getDate());
      
      
    }
    
}
