/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.classesutlitarias;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/**
 *
 * @author Glaucia Oliveira
 */
public class NumberFormatUtil {
    
    public static void main (String []args){
        
        //1.000,00 Brasil
        //1,000.00 USA
        
        Locale en = new Locale("en", "United Stated");
        NumberFormat nf = NumberFormat.getInstance(en);
        
        String num = nf.format(1000.9);
        System.out.println(num);
        
         Locale pt = new Locale("pt", "BR");
        NumberFormat nfpt = NumberFormat.getInstance(pt);
       
         String num1 = nfpt.format(1000.9);
        System.out.println(num1);
        
        //MOEDA = para quem não nessecita precisão
        
        NumberFormat moeda = NumberFormat.getCurrencyInstance(en);
        String valor = moeda.format(1000.99);
        System.out.println(valor);
        
        
        NumberFormat moeda1 = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String valor1 = moeda1.format(1000.99);
        System.out.println(valor1);
        
        Currency currency = moeda1.getCurrency();
         System.out.println(currency);
         
         //PORCENTAGEM
         
         NumberFormat percent = NumberFormat.getPercentInstance();
         String porcentagem = percent.format(99.98);
          System.out.println(porcentagem);
          
         //trabalha com a formatação dos números antes da vírgula
          percent.setMaximumIntegerDigits(5);
          percent.setMinimumIntegerDigits(3);
          
          
          //trabalha com decimais ou seja, numeros depois da vírgula
          percent.setMaximumFractionDigits(3);
          percent.setMinimumFractionDigits(1);
          
           String porcentagem1 = percent.format(99.98);
          System.out.println(porcentagem1);
          
          //ARREDONDAMENTO
          
          nf = NumberFormat.getInstance(Locale.getDefault());
          
          nf.setRoundingMode(RoundingMode.CEILING);
          nf.setMaximumFractionDigits(0);
          nf.setMinimumFractionDigits(0);
          //caso vc não configure a parte de casas decimais o java não faz arredondamento
             System.out.println(nf.format(99.55));
             
             try {
             Number num3 = nf.parse("100,00");
             System.out.println(num3.intValue());
        } catch (Exception e) {
        }
            
             
        
         
    }
    
}
