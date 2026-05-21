/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.elementosbasicos;

/**
 *
 * @author Glaucia Oliveira
 */
public class testeescopo {
    
     public static void main(String[] args) {
         
         escopo escopov = new escopo();
         
         escopov.setValor(10);
         
         System.out.println(escopov.getValor());
         System.out.println(escopov.calculaValor(20));
         System.out.println(escopov.getValor());
         
         
     }
    
}
