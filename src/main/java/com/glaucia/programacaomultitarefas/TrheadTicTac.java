/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.programacaomultitarefas;

/**
 *
 * @author Glaucia Oliveira
 */
public class TrheadTicTac implements Runnable{
    
    TicTac tt;
    Thread t;
    final int NUM=5;
    
    
    
    public TrheadTicTac(String nome, TicTac tt){
        this.tt = tt;
    t= new Thread(this, nome);
            t.start();
        
    }

    @Override
    public void run() {
       
        if(t.getName().equalsIgnoreCase("Tic")){
            
            for(int i=0; i<NUM; i++){
                tt.tic(true);
               
            }
          tt.tic (false );
          
          
        }else{
               for(int i=0; i<NUM; i++){
                tt.tac(true);
            
        }
        tt.tac (false );       
    }
        
            
    }
    }
