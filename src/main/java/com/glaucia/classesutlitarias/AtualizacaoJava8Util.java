/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.classesutlitarias;

/**
 *
 * @author Glaucia Oliveira
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class AtualizacaoJava8Util {
    
      public static void main (String []args){
          //data: dd/MM/yyyy
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        
        System.out.println(LocalDate.of(1965, 10, 9));
             System.out.println(LocalDate.parse("1963-10-09")); 
             
             //com o plu da para add dias, meses e anos
              System.out.println(agora.plusDays(10));
       // diminuir dias, meses e anos - minus
       System.out.println(agora.minus(1,ChronoUnit.MONTHS));
          
       System.out.println(agora.getDayOfWeek());//verifica qual dia da semana 
       
       System.out.println(agora.isLeapYear());//verifica se o ano é bisexto
       
       LocalTime hagora = LocalTime.now();
       System.out.println(hagora);
       
       System.out.println (LocalTime.of(20, 18));
       System.out.println(LocalTime.parse("20:18"));
       
       System.out.println(hagora.plusMinutes(60));
       System.out.println(hagora.minusMinutes(40));
       
       //os metodos gets impromem somente a hora, os minutos e os segundos
       System.out.println(hagora.getHour());
       
       //data e horas completo
       LocalDateTime agoraCompleto = LocalDateTime.now();
       System.out.println(agoraCompleto);
       
       ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);
       
       
       
       
       
      }
    
}
