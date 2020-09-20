/**
11. Container With Most Water :-

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
Note: You may not slant the container and n is at least 2.

Example:

Input: [1,8,6,2,5,4,8,3,7]
Output: 49
**/
// Runtime :- O(n)
// Space :- O(1)

package LeetCode_Amzn.Arrays_Strings;

public class ContainerWithMostWater {

    public static void main(String []args){
          int[]  s  = {1,8,6,2,5,4,8,3,7};
          int[]  s1 = {2,1,3,4,1};
          int[]  s2 = {6,3,1,4,12,4};
        
        System.out.println(maxArea(s));
        System.out.println(maxArea(s1));
        System.out.println(maxArea(s2));
        
     }
    public static int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        
        int left = 0;
        int right = height.length - 1;
        int max = Integer.MIN_VALUE;
        
        while(left < right){
            int min = Math.min(height[left], height[right]);
            max = Math.max(max, min * (right - left));
            
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        
        return max;
    }
}
