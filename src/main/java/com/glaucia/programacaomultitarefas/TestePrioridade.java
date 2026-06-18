/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.programacaomultitarefas;

/**
 *
 * @author Glaucia Oliveira
 */
public class TestePrioridade {
    
      public static void main(String[] args) {
          
            ThreadRunnable thread1 = new ThreadRunnable ( "#1", 500);
              ThreadRunnable thread2 = new ThreadRunnable ( "#2", 500);
                ThreadRunnable thread3 = new ThreadRunnable ( "#3", 500);
                
                Thread t1 = new Thread (thread1);
                Thread t2 = new Thread (thread2);
                Thread t3 = new Thread (thread3);
                
                t1.setPriority(5);
                t2.setPriority(3);
                t3.setPriority(1);
                
                //outra opção é usar a constante do Thread
                //t1.setPriority(Thread.NORM_PRIORITY);
                
                t1.start();
                 t2.start();
                  t3.start();
                  
                  
      }
    
}
