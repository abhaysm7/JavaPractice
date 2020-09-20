/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;
import java.util.*;
//import java.io.*;
/**
 *
 * @author abhay
 */
public class CoderByte1 {
    public static void main(String []args){
        String[]  s  = {"B:-1","A:1","B:3","A:5"};
        String[]  s1 = {"X:-1","Y:1","X:-4","B:3","X:5"};
        String[]  s2 = {"Z:0","A:-1"};
        
        System.out.println(SearchingChallenge(s));
        System.out.println(SearchingChallenge(s1));
        System.out.println(SearchingChallenge(s2));
        
     }
   
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
       
       ArrayList<String> sortedKeys = new ArrayList<>(map.keySet()); 
       Collections.sort(sortedKeys);
       
       String result = " ";
       
       int flag = sortedKeys.size();
       
       for (String x : sortedKeys){
           
           if(map.get(x) != 0){
               result = result + x + ":" + map.get(x);
           }
           if(flag > 1 && map.get(x) != 0){
               result = result + ",";
           }
           flag = flag - 1;
       }  
       return result;
    }
}
