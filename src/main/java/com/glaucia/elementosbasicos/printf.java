/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.elementosbasicos;

/**
 *
 * @author Glaucia Oliveira
 */
public class printf {
    
     public static void main(String[] args) {
         
         System.out.printf("%s", "Ola Mundo!");
         //para pular de linha
         System.out.println();
         
         //para caixa alto
         System.out.printf("%S", "Ola Mundo!");
          System.out.println();
          
          //para saída de um caracter
          System.out.printf("%c", 'c');
          
          System.out.printf("%n");
          //nova linha tb
          
          //ex saída formatada de valores
          
          int valor = 123456789;
          
           System.out.printf("%d", valor);
           System.out.println();
           
           //numeros flutuantes
           double pontoFlutuante = 2.99999;
           System.out.printf("%f", pontoFlutuante);
           System.out.println();
           
           //add flags ex
           System.out.printf("%015d", valor);
           System.out.println();
           
           System.out.printf("%,d", valor);
           System.out.println();
           
       testeCompleto ();  
     }
   
     private static void testeCompleto(){
         double[] precos = {10000,20,600,3,566,70.3987};
     
     for (int i=0; i<precos.length; i++){
         System.out.printf("%s %02d:total de R$%,10.2f%n", "Item", i+1, precos[i]);
     }
              
         
     }
   

}
