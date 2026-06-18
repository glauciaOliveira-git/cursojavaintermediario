/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.programacaomultitarefas;

/**
 *
 * @author Glaucia Oliveira
 */
public class TestWait {
    
     public static void main(String[] args) {
         
         TicTac tt = new TicTac();
        TrheadTicTac tic = new TrheadTicTac("Tic", tt);
        TrheadTicTac tac = new TrheadTicTac("Tac", tt);
         
         try {
             
              tic.t.join();
              tac.t.join();
             
         } catch (Exception e) {
         }
       
         
         
         
     }
    
}
