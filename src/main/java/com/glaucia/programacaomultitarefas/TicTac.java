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
public class TicTac {
    
    boolean tic;
    
    synchronized void tic(boolean estaExecutando){
        
        if (!estaExecutando){
            tic = true;
            notify ();
            return;
                
        }
        System.out.print("Tic");
        
        tic = true;
        
        notify();
 
          while(tic){
            try {
                
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(TicTac.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        } 
          
          
      }
       

 synchronized void tac(boolean estaExecutando){
        
        if (!estaExecutando){
            tic = true;
            notify ();
            return;
                
        }
        System.out.println("Tac");
        
        tic = false;
        
        notify();
 
          while(!tic){
            try {
                
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(TicTac.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        } 
          
          
      }    

   
    }
       
    
    

