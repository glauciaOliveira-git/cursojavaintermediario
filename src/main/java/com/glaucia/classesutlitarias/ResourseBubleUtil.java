/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.classesutlitarias;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Glaucia Oliveira
 */
public class ResourseBubleUtil {
    
     public static void main (String []args){
         
         System.out.println("Locale atual " + Locale.getDefault());
         
         ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
         System.out.println("Olá: " + rb.getString("Hello"));
         System.out.println("Mundo " + rb.getString("World"));
         
     }
    
}
