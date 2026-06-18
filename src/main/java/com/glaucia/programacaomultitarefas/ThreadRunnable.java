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
public class ThreadRunnable implements Runnable{
    
    private String nome;
    private int tempo;
    
    public ThreadRunnable (String nome, int tempo){
        this.nome = nome;
        this.tempo =  tempo;
       // Thread t = new Thread(this);
       // t.start();
        
    }
 
   
    @Override
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println(nome + "contador" +i);
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
          System.out.println(nome + "Terminou a execucao");
        }
        
    }
    
    
}
