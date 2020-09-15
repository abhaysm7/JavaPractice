/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abhay.hackerrank;

/**
 *
 * @author abhay
 */
public class FizzBuzz {
    
    public static void main(String[] args) 
    { 
        int n = 100;
        
        for(int i = 1; i <= n; i++){
            if(i%15 == 0){
                System.out.println(i + " FizzBuzz");
            }else if(i%3 == 0){
                System.out.println(i + " Fizz");
            }else if(i%5 == 0){
                System.out.println(i + " Buzz");
            }else{
                System.out.println(i);
            }
        }   
    } 
}
