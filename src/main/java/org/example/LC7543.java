package org.example;

import java.util.Arrays;

//LC 215. Kth Largest Element in an Array
public class LC7543 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
