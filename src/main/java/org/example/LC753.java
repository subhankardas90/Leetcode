package org.example;

import java.util.ArrayList;
import java.util.List;

//LC1431
public class LC753 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max =candies[0];
        for(int i=1;i<candies.length;i++){
            max = Math.max(max, candies[i]);
        }
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}
