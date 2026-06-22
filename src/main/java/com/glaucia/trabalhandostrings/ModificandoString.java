/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.trabalhandostrings;

/**
 *
 * @author Glaucia Oliveira
 */
public class ModificandoString {
    
        public static void main (String []args){
            
            String teste = "Isso é um teste.";
            System.out.println(teste);
            //metodo subString
             System.out.println(teste.substring(10));
              System.out.println(teste.substring(10, 15));
              
              //metodo concat
              String ola = "Olá";
              String mundo = "mundo";
              String olaMundo = ola.concat(mundo);
             System.out.println("Olá mundo");
             
             String espacos = "i s p a ç o s";
             String semEspacos = (espacos.replace("i", "e"));
             System.out.println(semEspacos);
             
             semEspacos = semEspacos.replaceAll(" ", "");
             System.out.println(semEspacos);
             
             //metodo trim remove esoaços que estiverem sobrando antes e depois
             
             String nome = " meu nome é: ";
              System.out.println(nome);
             System.out.println(nome.trim());
             
             
              
             
             
              
            
            
            
        }
    
}
