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
public class Calculadora {
    
    private int soma;
    
    public synchronized int somaArray (int[]array ){
        
        soma= 0;
        
        
        for (int i=0; i<array.length; i++ ){
            soma += array[i];
            
           System.out.println("Executando a soma" + Thread.currentThread().getName()+ "Soma o valor" + array[i]
           + "como o tatal de" + soma);
            
        }
        
        try {
            Thread.sleep(100);
            
        } catch (Exception e) {
        }
      
  
        return soma;
    }
    
}
