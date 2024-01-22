package subhankar.LC75;

import java.util.Arrays;

//LC 875. Koko Eating Bananas
public class LC7550 {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        while (low < high) {
            int mid = low+ (high - low) / 2;
            if (canEatAll(piles, mid, h)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canEatAll(int[] piles, int speed, int h) {
        int time = 0;
        for (int pile : piles) {
            time += (pile - 1) / speed + 1;
            if (time > h) {
                return false; // if the total time is greater than h, return false
            }
        }
        return true; // if all piles can be eaten within h hours, return true
    }
}
