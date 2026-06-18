/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.programacaomultitarefas;

/**
 *
 * @author Glaucia Oliveira
 */
public class TesteThread {
    
      public static void main(String[] args) {
          
          metodosthread thread = new metodosthread("thread 1", 900);
          //o método start executa o metodo run
          //thread.start();
           metodosthread thread2 = new metodosthread("thread 2", 600);
                  
      }
   
}
