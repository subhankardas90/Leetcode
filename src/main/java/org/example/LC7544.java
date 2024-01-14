package org.example;

import java.util.PriorityQueue;

// LC 2336. Smallest Number in Infinite Set
/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
public class LC7544 {
    private Integer minNum;
    private PriorityQueue<Integer> heap;
//    public SmallestInfiniteSet() {
//        minNum = 1;
//        heap = new PriorityQueue<>();
//    }

    public int popSmallest() {
        if(!heap.isEmpty())
            return heap.poll();
        minNum++;
        return minNum-1;
    }

    public void addBack(int num) {
        if(minNum>num && !heap.contains(num))
            heap.offer(num);
    }
}
