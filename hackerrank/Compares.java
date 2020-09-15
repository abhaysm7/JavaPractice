/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abhay.hackerrank;
import java.util.*;

/**
 *
 * @author abhay
 */
public class Compares {
    public static void main(String args[]){
        String[] cities = {"Bangalore","Pune","San Francisco","New York City"};
        MySort ms = new MySort();
        Arrays.sort(cities, ms);
        System.out.println(Arrays.binarySearch(cities, "New York City"));
    }
    static class MySort implements Comparator{
        public int compare(String a, String b){
            return b.compareTo(a);
        }
    }
    
}
