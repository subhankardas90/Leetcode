package subhankar.LC75;

//LC: 724. Find Pivot Index
public class LC7519 {
    public int pivotIndex(int[] nums) {

        int sum =nums[0];
        int[] pre = new int[nums.length];
        pre[0] = 0;
        for(int i=1;i<nums.length;i++){
            pre[i] = pre[i-1]+nums[i-1];
            sum = sum+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(pre[i]==(sum-nums[i]-pre[i]))
                return i;
        }
        return -1;

    }
}
