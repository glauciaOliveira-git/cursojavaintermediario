/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.programacaomultitarefas;

/**
 *
 * @author Glaucia Oliveira
 */
public class TesteSincronizacao {
    
     public static void main(String[] args) {
         
         int array [] = {1,2,3,4,5};
         ThreadSoma t1 = new ThreadSoma("#1", array);
         ThreadSoma t2 = new ThreadSoma("#2", array);
         
                 
     }
    
}
