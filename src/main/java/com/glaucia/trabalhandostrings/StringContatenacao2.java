/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.trabalhandostrings;

/**
 *
 * @author Glaucia Oliveira
 */
public class StringContatenacao2 {
    
     public static void main (String []args){
         
         String [] letras = {"B", "C", "D", "E", "F"};
         String alfabeto = "";
         
       StringBuffer sb = new StringBuffer();
       for(String letra: letras){
           sb.append(letra);
           
           
       }
       alfabeto = sb.toString();
       System.out.println(alfabeto);
       
       // se eu quiser colocar o reverso
       
       System.out.println(sb.reverse());
       
       StringBuilder sb_ = new StringBuilder();
       for(String letra: letras){
           sb_.append(letra);
       }
       alfabeto = sb_.toString();
       System.out.println(alfabeto); 
     }
    //StringBffer é para ambientes que tenham mais de 01 thread
     //StringBiulder não é trad safe
}
