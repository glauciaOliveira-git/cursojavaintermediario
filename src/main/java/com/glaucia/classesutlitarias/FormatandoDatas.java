/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.classesutlitarias;

/**
 *
 * @author Glaucia Oliveira
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FormatandoDatas {
    
     public static void main (String []args){
       
         SimpleDateFormat sdf = new SimpleDateFormat(" dd/MM/yyyy hh:mm:ss a z");
         //conferir a documentação
         
         Calendar data = new GregorianCalendar( 1977,8,1,4,5);
         
         System.out.println(sdf.format(data.getTime()));
         
         //ou 
         Date hoje = new Date();
            System.out.println(sdf.format(hoje));
            // o metodo format retorna uma String
            //o jeva tb consegue transformar data em string
            String d = sdf.format(hoje);
            
            
         SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
         String minhaData = "23/9/1996";
         //tranformando String em data
         
         try {
             
          Object minhaDataenDate = sdf1.parse(minhaData);  
           System.out.println(minhaDataenDate);
           
            System.out.println(sdf.format(minhaDataenDate));
          
         } catch (Exception e) {
         }
        
         
         
     }
    
}
