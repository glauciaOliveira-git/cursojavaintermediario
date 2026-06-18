/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.programacaomultitarefas.exercsemaforo;

/**
 *
 * @author Glaucia Oliveira
 */
public class SimuladorSemaforo {
    
     public static void main(String[] args) {
         
         ThreadSemaforo semaforo = new ThreadSemaforo();
         
         for(int i = 0; i <10; i++){
             System.out.println(semaforo.getCor());
           semaforo.esperandoCorMudar();
            
         }
     }
    
}
