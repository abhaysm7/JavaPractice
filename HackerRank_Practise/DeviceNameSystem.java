/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;
import java.util.*;

/**
 *
 * @author abhay
 */
public class DeviceNameSystem {
    
    public static void main( String[] args ){
        List<String> s = Arrays.asList("switch","tv","switch","tv","switch","tv");
        List<String> s1 = Arrays.asList("mixer","toaster","mixer","tv");
        List<String> s2 = Arrays.asList("tv","lamp");
        List<String> s3 = Arrays.asList("lamp","lamp","tv","lamp","tv","lamp");
        
        System.out.println(deviceNameSystem(s));
        System.out.println(deviceNameSystem(s1));
        System.out.println(deviceNameSystem(s2));
        System.out.println(deviceNameSystem(s3));
    }
    
    public static List<String> deviceNameSystem(List<String> devicenames){
        
        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        
        for(String s : devicenames){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        
        for(String s : devicenames){
            int n = map.get(s);
            if(!set.contains(s)){
                set.add(s);
                result.add(s);
            }else if(n > 1){
                for(int i = 1; i < n; i++){
                    String str = s + i;
                    if(!set.contains(str)){
                        set.add(str);
                        result.add(str);
                        break;
                    }   
                }   
            } 
        }
        return result; 
    }
}
