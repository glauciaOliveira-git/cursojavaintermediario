/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.trabalhandostrings;

/**
 *
 * @author Glaucia Oliveira
 */
import java.util.StringTokenizer;

public class StringToken {
    
     public static void main (String []args){
        
        String doArquivo = ("1;Antonio;30;");
        
        StringTokenizer st = new StringTokenizer(doArquivo, ";");
        
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
            
            //hasMoreTokens: enquanto o String Tokenizer tem mais Tokens
            //nexrToken extrai a informação do tokenizer
            
        }
        
        
    }
    
}

    

