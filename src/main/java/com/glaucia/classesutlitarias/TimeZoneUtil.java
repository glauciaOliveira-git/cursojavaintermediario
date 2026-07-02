/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.glaucia.classesutlitarias;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.TimeZone;

/**
 *
 * @author Glaucia Oliveira
 */
public class TimeZoneUtil {
    
    public static void main (String []args){
       
        Calendar calendar = Calendar.getInstance();      
        TimeZone tz = calendar.getTimeZone ();
        
        System.out.println(tz);
        
        String [] fusos = TimeZone.getAvailableIDs();
        
        //for(String fuso:fusos){
        //System.out.println(fuso);
        
    // se vc quiser que o programa seja salvo no fuso que o programa estaja sendo executdo ou em
    //qualquer outro
    //ou configurar um fuso padrão

   // TimeZone tzEURO = TimeZone.getTimeZone("Europe/Madrid");
     // System.out.println(tzEURO.getDisplayName());
      //System.out.println(tzEURO.getID());  
     
     // converter datas e salvar
    // Calendar agora = Calendar.getInstance();
    // SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a z");
     //System.out.println(sdf.format(agora.getTime()));
     
     
     //Calendar agoraMADRID = Calendar.getInstance(tzEURO);
      //System.out.println(agoraMADRID.getTimeZone());
      // System.out.println(sdf.format(agoraMADRID.getTime()));
       
       //agoraMADRID.add(Calendar.HOUR_OF_DAY, tzEURO.getOffset(System.currentTimeMillis()));
     // System.out.println(sdf.format(agoraMADRID.getTime()));
      
    }
    
    
    }
  

