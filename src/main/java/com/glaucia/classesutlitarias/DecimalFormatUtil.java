/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.classesutlitarias;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author Glaucia Oliveira
 */
public class DecimalFormatUtil {
    
    public static void main (String []args){
        
        String padrao = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao);
        
       // df.applyPattern(padrao);
        
        System.out.println(df.format(3251412222332.87376));
        
        
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brasil"));
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');
        
        String padrao2 = "###,###.##";
        df = new DecimalFormat(padrao2,dfs);
          System.out.println(df.format(3251412222332.87376));
          
           String padrao3 = "###,###.##";
        df = new DecimalFormat(padrao3,dfs);
        df.setGroupingSize(4);
          System.out.println(df.format(3251412222332.87376));  
          
          
           String padrao4 = "###,###.00";
        df = new DecimalFormat(padrao4,dfs);
          System.out.println(df.format(3251412222332.8));  
    }
    
}
