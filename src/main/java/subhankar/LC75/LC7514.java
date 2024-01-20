package subhankar.LC75;

import java.util.Arrays;

//LC 643. Maximum Average Subarray I

public class LC7514 {
    public double findMaxAverage(int[] nums, int k) {

        int sum =0;
        for(int i=0;i<k;i++){
            sum = sum+nums[i];
        }
        double avg = sum*1.0/k;
        for(int i=k;i<nums.length;i++){
            sum = sum-nums[i-k]+nums[i];
            avg = Math.max(avg, sum*1.0/k);
        }


        return avg;
    }
}
