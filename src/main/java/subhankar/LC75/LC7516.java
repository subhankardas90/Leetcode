package subhankar.LC75;

//LC 1004. Max Consecutive Ones III
public class LC7516 {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=-1;
        int maxLen =0;
        int count = 0;
        while(i<nums.length){

            if(nums[i]==0){
                count++;
                i++;
            }else{
                i++;
            }

            while(count>k){
                j++;
                if(nums[j]==0)
                    count--;
            }
            int len = i-j-1;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;

    }
}
