/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.classesutlitarias;

/**
 *
 * @author Glaucia Oliveira
 */
import java.util.Calendar;

public class ClassCalendarUtil {
    
     public static void main (String []args){
         
       Calendar hoje = Calendar.getInstance();//singleton
       int ano = hoje.get(Calendar.YEAR);
       int mes = hoje.get(Calendar.MONTH);
       int dia = hoje.get(Calendar.DAY_OF_MONTH);
       int hora = hoje.get(Calendar.HOUR_OF_DAY);
       int min = hoje.get(Calendar.MINUTE);
       
               
       System.out.println(ano);
       System.out.println(mes);// no java o mes começa do zero
       System.out.println(dia);
       System.out.println(hora);
       System.out.println(min);
       
       System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d",dia, (mes +1),ano, hora, min);
       
       hoje.add(Calendar.DAY_OF_MONTH,5); // para add dias
      // para subtair dias coloca numero netativo
       System.out.println();
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
      
        
     }
    
}
