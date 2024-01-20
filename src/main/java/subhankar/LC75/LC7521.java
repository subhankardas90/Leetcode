package subhankar.LC75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//LC 1207. Unique Number of Occurrences
public class LC7521 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hmap.containsKey(arr[i]))
                hmap.put(arr[i], hmap.get(arr[i])+1);
            else
                hmap.put(arr[i], 1);
        }

        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e: hmap.entrySet()){
            if(list.contains(e.getValue()))
                return false;
            else
                list.add(e.getValue());
        }
        return true;
    }
}
