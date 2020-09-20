/*
Two Sum :-
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

// Runtime :- 
/ Space :- 
*/
package LeetCode_Amzn.Arrays_Strings;
import java.util.*;

public class TwoSum{
    public static void main(String []args){
        
        int[] nums = {2, 4, 3, 11, 7};
        int target = 10;
        //if(nums.length <= 1) throw new IllegalArgumentException("No Sum Found");
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                result[0] = i;
                result[1] = map.get(complement);
            } else {
                map.put(nums[i], i);
            }
        }
        System.out.println(result[0]);
        System.out.println(result[1]);
        //throw new IllegalArgumentException("No Sum Found");      
    }        
}