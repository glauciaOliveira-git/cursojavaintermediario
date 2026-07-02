/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.classesutlitarias;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Glaucia Oliveira
 */
import java.util.Locale;
import java.text.NumberFormat;

public class LocaleUtil {
    
    public static void main (String []args){
        
        // formatos de data:
        //dd/MM/yyyy Brasil
        //MM/dd/yyyy EUA
        
        Locale locale = Locale.getDefault();
        
        System.out.println(locale);
        
        Locale [] locales = Locale.getAvailableLocales();
        for(Locale loc: locales){
            
            System.out.println("Nome:" + loc.getDisplayName());
            System.out.println("Código da língua:" + loc.getLanguage());
            System.out.println("Língua:" + loc.getDisplayName());
            System.out.println("Código do País:" + loc.getCountry());
            System.out.println("País:" + loc.getDisplayCountry());
            
            System.out.println("***********");
        }
        
       // forçar um locale
       
       Locale br = new Locale("pt", "Brasil");
       System.out.println(br);
       
       
       // esse código é para setar o local, quando vc quer as informações em uma determinada língua
      // Locale.setDefault(br);
         //System.out.println(Locale.getDefault());
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
          System.out.println(nf.format(500000000));
          
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
          System.out.println(nf1.format(500000000));  
          
           NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.GERMAN);
          System.out.println(nf2.format(500000000));  
          
         NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.ITALY);
          System.out.println(nf3.format(500000000));   
          
          System.out.println(System.getProperty("file.encoding"));
        
    }
    
}
