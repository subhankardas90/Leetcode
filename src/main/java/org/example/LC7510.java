package org.example;

//LC 283. Move Zeroes
public class LC7510 {
    public void moveZeroes(int[] nums) {
        int count =0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                count++;
            else{
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i=j;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
