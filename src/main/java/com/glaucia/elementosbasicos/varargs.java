/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.elementosbasicos;

/**
 *
 * @author Glaucia Oliveira
 */
public class varargs {
    
     public static void main(String[] args) {
           
      System.out.println(soma(1,2));
      
      int []vetor = {1,2,3,4,5,};
      System.out.println(soma(vetor));
      
      //utilizando o varargs, são parâmetros, não vetores como no array 
      System.out.println(soma(1,2,3,4,5,6,7,8,9));
              
     }
  //metodos de repassar parametros
     static int soma(int a, int b){
         return a+b;
         
     }
    //atravez de um vetor 
     static int soma (int[]vetor){
         int total=0;
         for(int i=0;  i<vetor.length; i++){
             total += vetor[i];
                  
         }
          return total;
              
     }
     //vararg
     //os varargs são sempre passados por último 
      //static int soma (int a, int b, Integer ... vetor);
     
   static int soma (Integer... vetor){
       
         int total=0;
         for(int i=0;  i<vetor.length; i++){
             total += vetor[i];
                  
         }
          return total;
              
     }  
}
