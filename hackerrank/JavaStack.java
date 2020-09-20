/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Arrays;
import java.util.*;

/**
 *
 * @author abhay
 */
public class JavaStack {
    public static void main( String[] args )
    {
        List<String> s = Arrays.asList("{}()","{()}","({()})");
        List<String> s1 = Arrays.asList("{}(","({)}","((","}{");
        List<String> s2 = Arrays.asList("{}()","{()}","({()})");
        List<String> s3= Arrays.asList("{}(","({)}","(){}");
        
        System.out.println(isBalanced(s));
        System.out.println(isBalanced(s1));
        System.out.println(isBalanced(s2));
        System.out.println(isBalanced(s3));
    }
    public static List<String> isBalanced(List<String> s){
        Stack<Character> stack = new Stack<>();
        List<String> result = new ArrayList<>();
        
        for(String str : s){
            for(char c : str.toCharArray()){
                if(c == '{' || c == '('){
                    stack.push(c);
                }else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                }else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    result.add("false");
                    break;
                }
            if(stack.isEmpty()){
                result.add("true");
            }
            }
        }
        return result;
    }
}
