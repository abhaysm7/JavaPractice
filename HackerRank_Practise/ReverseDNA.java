/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;
//import java.util.*;

/**
 * A -> T
 * T -> A
 * G -> C
 * C -> G
 * @author abhay
 */
public class ReverseDNA {
    public static void main( String[] args )
    {
        String s = "GTC";
        String s1 = "ACCGGGTTTT";
        String s2 = "AGTC";
        String s3 = "ATCGTA";
        
        System.out.println(dnaComplement(s));
        System.out.println(dnaComplement(s1));
        System.out.println(dnaComplement(s2));
        System.out.println(dnaComplement(s3));
    }
    public static String dnaComplement(String s){
        //List<Character> reverse = new ArrayList<Character>();
        char[] arr = new char[s.length()];
        char[] reverse = new char[s.length()];
        char[] complement = new char[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }
        for(int i = 0, n = s.length() - 1; i < s.length(); i++, n--){
            reverse[i] = arr[n];
        }
        for(int i = 0; i < s.length(); i++){
            switch (reverse[i]) {
                case 'A':
                    complement[i] = 'T';
                    break;
                case 'T':
                    complement[i] = 'A';
                    break;
                case 'G':
                    complement[i] = 'C';   
                    break;
                case 'C':
                    complement[i] = 'G';
                    break;
                default:
                    break;
            }
        }
        return String.valueOf(complement);   
    } 
}
