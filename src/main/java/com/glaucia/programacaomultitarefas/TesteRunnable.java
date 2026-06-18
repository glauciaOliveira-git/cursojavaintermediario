/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.programacaomultitarefas;

/**
 *
 * @author Glaucia Oliveira
 */
public class TesteRunnable {
    
     public static void main(String[] args) {
         
         ThreadRunnable thread1 = new ThreadRunnable ( "#1", 500);
        // Thread t1= new Thread(thread1);
         //t1.start();
         
        ThreadRunnable thread2 = new ThreadRunnable ( "#2", 600);  
         
     }
    
}
