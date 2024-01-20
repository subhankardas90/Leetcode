package subhankar.LC75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//LC 2215. Find the Difference of Two Arrays
public class LC7520 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();                           // create 2 hashsets
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums1){ set1.add(num); }                         // add nums1 elements to set1
        for(int num : nums2){ set2.add(num); }                         // add nums2 elements to set2

        List<List<Integer>> resultList = new ArrayList<>();             // Initialize result list with 2 empty sublists that we will return
        resultList.add(new ArrayList<>());
        resultList.add(new ArrayList<>());

        for(int num : set1){                                            // just iterate to all elements of set1
            if(!set2.contains(num)){ resultList.get(0).add(num); }
        }
        for(int num : set2){                                            // just iterate to all elements of set2
            if(!set1.contains(num)){ resultList.get(1).add(num); }
        }
        return resultList;
    }
}
