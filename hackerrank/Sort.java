/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author abhay
 */
public class Sort {
    
    public static void main(String args[]){
        
        String str = "abhay";
        
        char[] c = new char[str.length()];
        
        for(int i = 0; i < str.length(); i++){
            c[i] = str.charAt(i);
        }
        
        for(int i = 0; i < c.length-1; i++){
            for(int j = i+1; j < c.length; j++){
                if(c[i] > c[j]){
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }    
            }
        }
        
        System.out.println(str);
        System.out.println();
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i]);
        }
    }
    
}
