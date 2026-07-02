/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.classesutlitarias;

/**
 *
 * @author Glaucia Oliveira
 */
import java.util.GregorianCalendar;
import java.util.Calendar;

public class GregorianCalendarUtil {
    
      public static void main (String []args){
          
          Calendar hoje1 = Calendar.getInstance();
          GregorianCalendar hoje = new GregorianCalendar();
          imprimirData(hoje) ;
          
          System.out.println(hoje.isLeapYear(2030));
          // isLeapYear é ulilizado para saber se o ano é bisexto
          
          
          GregorianCalendar hoje2 = new GregorianCalendar(1977, 10, 02);
          imprimirData(hoje2);
          
           GregorianCalendar hoje3 = new GregorianCalendar(1977, 9, 01, 11, 00);
          imprimirData(hoje3);
          
          
      }
      private static void imprimirData (Calendar hoje){
          
         
       int ano = hoje.get(Calendar.YEAR);
       int mes = hoje.get(Calendar.MONTH);
       int dia = hoje.get(Calendar.DAY_OF_MONTH);
       int hora = hoje.get(Calendar.HOUR_OF_DAY);
       int min = hoje.get(Calendar.MINUTE);
       
       System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d",dia, (mes +1),ano, hora, min);
        
       System.out.println();
       
       
      }
}
