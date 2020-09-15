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
public class virtusaTestEx1 {
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4};
        call_array(arr[0], arr);
        System.out.println(arr[0] + "," + arr[1]);
    }
    static void call_array(int i, int arr[]){
        arr[i] = 6;
        i = 5;
    }
}
