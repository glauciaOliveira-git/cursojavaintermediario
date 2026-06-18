/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.programacaomultitarefas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Glaucia Oliveira
 */
public class TesteIslive {
    
      public static void main(String[] args) {
          
            ThreadRunnable thread1 = new ThreadRunnable ( "#1", 500);
              ThreadRunnable thread2 = new ThreadRunnable ( "#2", 500);
                ThreadRunnable thread3 = new ThreadRunnable ( "#3", 500);
                
                Thread t1 = new Thread (thread1);
                Thread t2 = new Thread (thread2);
                Thread t3 = new Thread (thread3);
                
                t1.start();
                 t2.start();
                  t3.start();
                  
                  while (t1.isAlive() || t2.isAlive() || t3.isAlive()){
                   
                    try {
              Thread.sleep(200);
          } catch (Exception e) {     
             e.printStackTrace();
          }
          }      
                    System.out.println("Programa finalizado");
                  }       
      }
    

