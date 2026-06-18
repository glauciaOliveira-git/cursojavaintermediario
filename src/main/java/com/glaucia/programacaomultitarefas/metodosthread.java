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
public class metodosthread extends Thread {
    
    private String nome;
    private int tempo;
    
    public metodosthread(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        start();
        
    }
    
    public void run (){
       // System.out.println("Executando a Thread");
       
       
       for (int i=0; i<6; i++){
           try {
               System.out.println(nome +"contador" +i);
               Thread.sleep(tempo);
           } catch (InterruptedException ex) {
               Logger.getLogger(metodosthread.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           System.out.println(nome+ "Terminou a execucao");
       }
    }
    
    
}
