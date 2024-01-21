package subhankar.binarySearch;

//LC 154. Find Minimum in Rotated Sorted Array II
public class FindMinimumInRotatedSortedArrayWithDuplicate {
    public int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1;

        if (nums[lo] < nums[hi]) return nums[lo];

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            } else if (nums[mid] < nums[hi]) {
                hi = mid;
            } else {
                hi--;
            }
        }

        return nums[hi];
    }
}
