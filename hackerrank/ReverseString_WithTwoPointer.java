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
public class ReverseString_WithTwoPointer {
    
    public static void main(String[] args) 
    { 
        String input = "GeeksForGeeks"; 
  
        // convert String to character array 
        // by using toCharArray 
        char[] array = input.toCharArray(); 
  
        for (int left = 0, right = array.length-1; left < right; left++, right--){
            
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;  
        }
        
        System.out.println(String.valueOf(array));
        
    } 
}
