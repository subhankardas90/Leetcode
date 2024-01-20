package subhankar.binarySearch;
//LC 704. Binary Search
public class SearchElementInArrayRecursion {
    public int search(int[] nums, int target) {

         int low =0;
         int high = nums.length-1;
         return searchHepler(nums, low, high, target);
    }
     public int searchHepler(int[] nums, int low, int high, int target){
         if(low<=high){

         int mid = (low+high)/2;
         if(nums[mid] == target)
             return mid;
         else if(target<nums[mid])
             return searchHepler(nums, low, mid-1, target);
         else
             return searchHepler(nums, low+1, high, target);
         }
         return -1;
     }
}
