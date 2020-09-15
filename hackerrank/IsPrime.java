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
/*
    Given an integer, if the number is prime return 1. 
    Otherwise return it's smallest divisor greater then 1.
    
     * Complete the 'isPrime' function below.
     * The function is expected to return an INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
*/
public class IsPrime {
    

    public static int isPrime(long n) {
    // Write your code here
        if(n == 2){
            return 1;
        }else if(n > 2){
            for(long i = 2; i < n; i++){
                if(n % i == 0){
                    return (int)i;
                }
            }
        }
        return 1;
    }
    
    public static void main(String args[]) {
        System.out.println("Input 2 : Result = " + isPrime(2));
        System.out.println("Input 4 : Result = " + isPrime(4));
        System.out.println("Input 11 : Result = " + isPrime(11));
        System.out.println("Input 15 : Result = " + isPrime(15));
        System.out.println("Input 29 : Result = " + isPrime(29));
         
    }    
}

