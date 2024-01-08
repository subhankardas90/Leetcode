package org.example;

import java.util.Arrays;

//1679. Max Number of K-Sum Pairs
public class LC7513 {
    public int maxOperations(int[] nums, int k) {
        int count =0;
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            if(nums[start]+nums[end]==k){
                count++;
                start++;
                end--;

            }
            else if(nums[start]+nums[end]<k)
                start++;
            else if(nums[start]+nums[end]>k)
                end--;
        }
        return count;
    }
}
