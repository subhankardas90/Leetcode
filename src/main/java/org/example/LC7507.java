package org.example;

//LC- 238. Product of Array Except Self
//create two array - 1 contains product of all before elements
//another contains product of after elements
//final product will be the answer
public class LC7507 {
    public int[] productExceptSelf(int[] nums) {
        int[] finalArray = new int[nums.length];
        int[] part1 = new int[nums.length];
        int[] part2 = new int[nums.length];
        part1[0] = 1;
        part2[nums.length-1] = 1;
        for(int i=1;i<nums.length;i++){
            part1[i] = nums[i-1]*part1[i-1];
        }

        for(int i=nums.length-2;i>=0;i--){
            part2[i] = nums[i+1]*part2[i+1];
        }
        for(int i=0;i<nums.length;i++){
            finalArray[i] = part1[i]*part2[i];
        }
        return finalArray;
    }
}
