package org.example;

//LC 11. Container With Most Water
public class LC7512 {
    public int maxArea(int[] height) {
        int ans = 0;
        int start = 0;
        int end = height.length-1;
        while(start<end){
            int minHeight = Math.min(height[start], height[end]);
            int maxValue = minHeight* (end - start);
            if(minHeight == height[start]){
                start++;
            }
            else{
                end--;
            }
            if(maxValue>ans){
                ans = maxValue;
            }
        }
        return ans;
    }
}
