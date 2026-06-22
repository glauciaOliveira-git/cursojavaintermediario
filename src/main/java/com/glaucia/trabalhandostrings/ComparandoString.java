/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.trabalhandostrings;

/**
 *
 * @author Glaucia Oliveira
 */
public class ComparandoString {
    
     public static void main (String []args){
         
       String   Ola= "Olá";
               String   Ola2= "OLÁ";
                       String   Ola3= "Olá";
                       String Ola4 = new String (Ola);//lembrando que o new aloca lugar diferente na menoria di coputador
                       
                       
                       System.out.println("Olá equals olá2=" + Ola.equals(Ola2));//false
                       System.out.println("Olá equals olá3=" + Ola.equals(Ola3));//true
                       
                       System.out.println("Olá equals olá2=" + Ola.equalsIgnoreCase(Ola2));//true
                       
                        System.out.println("Ola==Ola1" + (Ola==Ola2));//false
                          System.out.println("Ola==Ola3" + (Ola==Ola3));//true
                          
                         System.out.println("Ola==Ola4" + (Ola==Ola4));//false
                          System.out.println("Olá equals olá4=" + Ola.equals(Ola4));//true
                          System.out.println("Olá equals olá4=" + Ola.equalsIgnoreCase(Ola4));//true
                          
                          
                          String banana = "banana";
                          String ana = "ana";
                          String ban = "ban";
                          //metodo regions Matches
                          
                          System.out.println(banana.regionMatches(1, ana, 0, 3));//true
                           System.out.println(banana.regionMatches(1, ana, 0, 2));//false
                           
                           //metodo end with e start whith
                           
                           System.out.println(banana.endsWith(ana));
                             System.out.println(banana.startsWith(ban));
                             
                             
                             //metodo comparetoo
                             
                             String a = "a";
                                     String b = "b";
                                             String aMaiusculo = "A";
                                             
                                             System.out.println(a.compareTo(b));
                                             System.out.println(b.compareTo(a));
                                             System.out.println(a.compareTo(a));
                                             
                                             System.out.println(a.compareTo(aMaiusculo));
                                             
                                             //-1 quando a>b
                                             //0 quando a == b
                                             //1 ou 1> quando a<b
                                                     // saída de acordo com a tabela acsii
                                                     
                                                     
                                                     
                                             
                           
                           
                          
                        
                       
                       
                       
               
         
         
     }
    
}
