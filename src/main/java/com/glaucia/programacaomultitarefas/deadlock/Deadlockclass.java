/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.programacaomultitarefas.deadlock;

/**
 *
 * @author Glaucia Oliveira
 */
public class Deadlockclass {
    
    public static void main(String[] args) {
        
    final String RECURSO01 = "Recurso #1";
     final String RECURSO02 = "Recurso #2";
         
         Thread t1 = new Thread(){
             public void run(){
                 synchronized (RECURSO01){
                     System.out.println(" Thred número 01 bloqueou o RECURSO01");
                     
                     try {
                          Thread.sleep(100);
                         
                     } catch (Exception e) {
                     }
                   
                   System.out.println(" Thred número 01 tentando acesso ao RECURSO02");   
                   
                   synchronized (RECURSO02){
                       System.out.println(" Thred número 01bloaqueou o RECURSO02");  
                       
                   }
                 }
             }
             
         };
         
         
         
      Thread t2 = new Thread(){
             public void run(){
                 synchronized (RECURSO02){
                     System.out.println(" Thred número 02 bloqueou o RECURSO02");
                     
                     try {
                          Thread.sleep(100);
                         
                     } catch (Exception e) {
                     }
                   
                   System.out.println(" Thred número 02 tentando acesso ao RECURSO01");   
                   
                   synchronized (RECURSO01){
                       System.out.println(" Thred número 02 bloaqueou o RECURSO01");  
                       
                   }
                 }
             }
             
         }; 
      t1.start();
        t2.start();
    }
}
