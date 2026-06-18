/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.programacaomultitarefas.resumenstop;

/**
 *
 * @author Glaucia Oliveira
 */
public class TesteThred {
    
   public static void main(String[] args) {
       
       MinhaThred t1 = new MinhaThred("#1");
        MinhaThred t2 = new MinhaThred("#2");
        
        System.out.println("Pausando Thread #1");
        
        t1.suspend();
        
        try {
           Thread.sleep(200);
       } catch (Exception e) {
           
       }
        
          System.out.println("Pausando Thread #2");
        
      t2.suspend();
      
        System.out.println("Resumindo Thread #1");
      t1.resume();
       try {
           
       } catch (Exception e) {
       }
       
         System.out.println("Resumindo Thread #1");
      t2.resume();
      
        System.out.println("Terminando Thread #1");
      t2.stop();
   }
    
}
