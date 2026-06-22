/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.trabalhandostrings;

/**
 *
 * @author Glaucia Oliveira
 */
import java.util.Arrays;
public class ExtraindoChars {
    public static void main (String []args){
        
        
        String java = "java";
        //metodo charAt
        for(int i=0; i<java.length(); i++){
            System.out.println(java.charAt(i));
        }
        
        //metodo getChars
        
        char[] jav = new char [3];
        java.getChars(0, 3, jav, 0);
        System.err.println(jav);
        
        // é o mesmo que:
        for(int i=0, j=0; i<3;i++, j++){
            jav[j] = java.charAt(i);
           
    }
    System.out.println(jav);   
    
    
    byte []javaBytes = new byte[3];
    java.getBytes(0,3, javaBytes,0);
    System.out.println(Arrays.toString(javaBytes));  
    
    
    char [] javaChars = java.toCharArray();
     System.out.println(javaChars);
    
    }
    
}
