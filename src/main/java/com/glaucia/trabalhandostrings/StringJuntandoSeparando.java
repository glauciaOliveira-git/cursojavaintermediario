/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.trabalhandostrings;

/**
 *
 * @author Glaucia Oliveira
 */
public class StringJuntandoSeparando {
    
     public static void main (String []args){
         
         String alfabeto = String.join(",", "A", "B", "C");
         System.out.println(alfabeto);
         //metodo join: junta Strings
         
         
         String [] letras = alfabeto.split(",");
         for(String letra: letras){
             System.out.println(letra);
             
             //metodo split separa a string
             
         
     }
                 
     }
    
}
