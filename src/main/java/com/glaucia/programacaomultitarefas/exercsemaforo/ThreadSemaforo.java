/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.programacaomultitarefas.exercsemaforo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Glaucia Oliveira
 */
public class ThreadSemaforo implements Runnable {
    
    private CorSemaforo cor;
    private boolean parar;
    private boolean corMudou;

    public ThreadSemaforo() {
        
        
        this.cor = CorSemaforo.VERMELHO;
        
        this.parar=false;
        this.corMudou=false;
        
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!parar) {

                switch (this.cor){

                    case VERMELHO:
                   
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ThreadSemaforo.class.getName()).log(Level.SEVERE, null, ex);
                      
                    }
                        break;

                    case AMARELO:
                   
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ThreadSemaforo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                        break;

                    case VERDE:
                    
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ThreadSemaforo.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                        break;

                    default:
                        break;

                }
                
mudarCor();

            }

        }
      
  

    private synchronized void mudarCor() {
        switch (this.cor) {
            case VERMELHO:
                this.cor = CorSemaforo.VERDE;
                break;
            case AMARELO:
                this.cor = CorSemaforo.VERMELHO;
                break;
            case VERDE:
                this.cor = CorSemaforo.AMARELO;
                break;
            default:
                break;

        }
this.corMudou=true;
notify();
    }

    
   public  synchronized void esperandoCorMudar(){
        while (!this.corMudou){
            
        
     try {    
   wait();
           
       } catch (Exception e) {
       }
        }
   this.corMudou = false;
   
   }
   
    
    public CorSemaforo getCor() {
        return cor; 
        
    }
        
}


