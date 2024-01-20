package subhankar.LC75;

//LC-1493. Longest Subarray of 1's After Deleting One Element
public class LC7517 {

    public int longestSubarray(int[] nums) {
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

            while(count>1){
                j++;
                if(nums[j]==0)
                    count--;
            }
            int len = i-j-1;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen-1;
    }
}
