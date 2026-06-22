/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.trabalhandostrings;

/**
 *
 * @author Glaucia Oliveira
 */
public class StringFazendoBuscas {
    
    public static void main (String []args){
        
        String banana = "banana";
        String ana = "ana";
        
        System.out.println(banana.indexOf(ana));
         System.out.println(banana.indexOf("b"));
        System.out.println(banana.indexOf("x"));
        // o index vai retornar -1 quando não existir
        // o index retorna o numero da posição da letra ou string
        
        
         System.out.println(banana.lastIndexOf("a"));
         //last retorna a ultima vez que o a foi usado
         
         System.out.println(banana.contains(ana));//true
          System.out.println(banana.contains("x"));//false
        
    }
    
}
