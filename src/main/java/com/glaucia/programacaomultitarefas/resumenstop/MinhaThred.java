/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.programacaomultitarefas.resumenstop;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Glaucia Oliveira
 */
public class MinhaThred implements Runnable{
    
    private String nome;
    private boolean estaSuspensa;
    private boolean foiTerminada;
    
    
    public MinhaThred(String nome){
        this.nome=nome;
        this.estaSuspensa= false;
        
        new Thread(this,nome).start();
        
        
    }
    

    @Override
    public void run() {
        
        System.out.println("Executando" + this.nome);
        
        for (int i=0;i<10; i++ ){
          System.out.println("Thread" + nome + "," +i);   
            try {
                Thread.sleep(300);
                synchronized (this){
                    while (estaSuspensa);
                    wait();
                }
                if(this.foiTerminada){
                    break;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaThred.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        System.out.println("Thread" + this.nome + "Terminando");
        
        
       
    }
    
    void suspend(){
        this.estaSuspensa=true;
        
    }
   synchronized void resume(){
        this.estaSuspensa=false;
        notify();
    }
   synchronized void stop(){
       this.foiTerminada=true;
       notify();
       
    
}
}

