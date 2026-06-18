/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.programacaomultitarefas;

/**
 *
 * @author Glaucia Oliveira
 */
public class ThreadSoma implements Runnable {
    
    private String nome;
    private int []nums;
    private static Calculadora calc = new Calculadora();
    
    public ThreadSoma(String nome, int[]nums){
        this.nome = nome;
        this.nums = nums;
        
        new Thread(this, nome).start();
        
        
    }
   
    public void run(){
        
        System.out.println( this.nome + "Iniciada");
    
    int soma = calc.somaArray(this.nums);
    
      System.out.println("Resultado da soma para a Thread" + this.nome + "é" + soma);
    
     System.out.println( this.nome + "Terminada");
    
}
}
