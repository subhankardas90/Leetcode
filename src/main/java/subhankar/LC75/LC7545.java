package subhankar.LC75;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LC7545 {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] test = new int[n][2];
        for(int i=0;i<n;i++){
            test[i]=new int[]{nums2[i], nums1[i]};
        }
        Arrays.sort(test, (a, b)-> b[0]-a[0]);
        //Min Heap create
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);
        long res = 0, sumS = 0;
        for (int[] es : test) {
            pq.add(es[1]);
            sumS = (sumS + es[1]);
            if (pq.size() > k)
                sumS -= pq.poll();
            if (pq.size() == k)
                res = Math.max(res, (sumS * es[0]));
        }
        return res;
    }
}
