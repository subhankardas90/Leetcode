package subhankar.binarySearch;

//1482. Minimum Number of Days to Make m Bouquets
public class MinimumNumberOfDayToMakeMBouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < m * k) return -1;
        int  ans = -1;
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int i : bloomDay) {
            high = Math.max(high, i);
            low = Math.min(low, i);
        }
        while (low<=high){
            int mid = low+(high-low)/2;

            if(isPossible(bloomDay,mid,k,m)){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }

        return ans;
    }

    private boolean isPossible(int[] bloomDay, int mid, int k,int booket) {
        int bouquets = 0, flowersCollected = 0;
        for (int value : bloomDay) {
            if (value <= mid) {
                flowersCollected++;
            } else {
                flowersCollected = 0;
            }
            if (flowersCollected == k) {
                bouquets++;
                flowersCollected = 0;
            }
        }

        return bouquets>=booket;
    }
}
