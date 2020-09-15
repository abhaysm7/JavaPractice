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
public class UserInput {
    
    public static String result = "";
    
    public static class TextInput {
        public void add(char c){
            //String result = "";
            
        }
        
        public String getValue(){
            return result;
        }
        
    }

    public static class NumericInput extends TextInput {
        
         @Override
         public void add(char c){
            if(c == 0 || c == 1 ||c == 2 ||c == 3 ||c == 4 ||c == 5 ||c == 6 ||c == 7 ||c == 8 ||c == 9){
                result = result + c;
            }
            
        }
        
         @Override
        public String getValue(){
           return result;
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
