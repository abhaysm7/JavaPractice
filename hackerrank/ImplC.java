/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;
//import java.util.*;

/**
 *
 * @author abhay
 */

public class ImplC {
  public static void main(String[] args){
    int[] a = {1};
    ImplC t = new ImplC();
    t.increment(a);
    System.out.println(a[a.length - 1]);
  }
  void increment(int[] i){
     i[i.length - 1]++; 
  }
} 

