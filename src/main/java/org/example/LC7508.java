package org.example;

//334. Increasing Triplet Subsequence
public class LC7508 {
    public boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i <= max1) {
                max1 = i;
            }
            else if (i <= max2) {
                max2 = i;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
