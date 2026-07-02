/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.classesutlitarias;

import java.math.BigDecimal;
import java.math.BigInteger;


/**
 *
 * @author Glaucia Oliveira
 */
public class BigintergerBigdecimalUtil {
    public static void main (String []args){
        
        double a = 0.03;
                double b = 0.04;
                        double c = b-a;
                        System.out.println(c);
                        
                        //big decimal para casas decimais
                        //big interger para números inteiros
                        
       BigDecimal a1 = new BigDecimal("0.03");
               BigDecimal b1 = new BigDecimal("0.04");
                       BigDecimal c1 = b1.subtract(a1);
                        System.out.println(c1);
                        
             BigDecimal a2 = new BigDecimal("28273783736.8282726");
               BigDecimal b2 = new BigDecimal("968577575.03983837");
                       BigDecimal c2 =  a2.add(b2);
                        System.out.println(c2); 
                        System.out.println(a2.divide(new BigDecimal("2")));
                        
                        
                        
              BigInteger bi = new BigInteger("2000000000");
                System.out.println(bi);     
                
                //BigInteger e BigDecimal é pra quem precisa de precisão nos calculos
                        
                        
    }
    
}
