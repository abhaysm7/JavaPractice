/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abhay.hackerrank;
import java.util.*;
import java.io.*;
/**
 *
 * @author abhay
 */
public class CoderByte1 {
    public static String SearchingChallenge(String[] strArr){
       HashMap<String, Integer> map = new HashMap<>();
       
       for(int i = 0; i < strArr.length; i++){
           String namepass[] = strArr[i].split(":"); 
           String key = namepass[0]; 
           String val = namepass[1];
           
           if(!map.containsKey(key)){
               map.put(key,Integer.valueOf(val));
           }else{
               map.put(key, map.get(key) + Integer.valueOf(val));
           }
       }
       
       ArrayList<String> sortedKeys = new ArrayList<String>(map.keySet()); 
       Collections.sort(sortedKeys);
       
       
       String result = "";
       int flag = 0;
       for (String x : sortedKeys){
           if(map.get(x) != 0){
               result = x + ":" + map.get(x);
           }
           if(flag == 0){
               result = result;
           }else{
               result = result + ",";
           }
           flag = 1;
       }  
  
        return result;
    }
    
     public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.print(SearchingChallenge(s.nextLine()));
     }
}
