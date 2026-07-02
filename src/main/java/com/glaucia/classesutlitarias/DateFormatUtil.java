/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.classesutlitarias;

import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;


/**
 *
 * @author Glaucia Oliveira
 */
public class DateFormatUtil {
    
     public static void main (String []args){
         
         Date hoje = new Date ();
         System.out.println(hoje);
         
         String hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
          System.out.println(hojeFormatado);
          
          Locale.setDefault(new Locale("en", "US"));
          
          hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
          System.out.println(hojeFormatado);
          
          //getDateInstance saída só de data
          //getTimeInstance saída só de hora
         hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
          System.out.println(hojeFormatado); 
          
          //DateFormat.MEDIUN - formato sem os segundos
          //DateFormat.SHORT = somente a hora e munutos
          
           hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(hoje);
          System.out.println(hojeFormatado);
          
          //transformando string em um objeto do tipo date
          
           String date = "06/24/2026";
          try {
          Date dataDate = DateFormat.getDateInstance().parse(date);
           System.out.println(dataDate); 
         } catch (Exception e) {
         }
          
          
     }
    
}
