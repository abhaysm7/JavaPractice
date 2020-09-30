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
public class ReverseString {
    public static void main(String[] args) 
    { 
        String input = "GeeksForGeeks"; 
  
        // convert String to character array 
        // by using toCharArray 
        char[] try1 = input.toCharArray(); 
  
        for (int i = try1.length-1; i>=0; i--) 
            System.out.print(try1[i]); 
    } 
} 
 
