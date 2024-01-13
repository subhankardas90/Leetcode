package org.example;

import java.util.LinkedList;
import java.util.Queue;
//LC 1161. Maximum Level Sum of a Binary Tree
public class LC7538 {
    public int maxLevelSum(TreeNode root) {
        int level = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxSumLevel = 0;

        Queue<TreeNode> bfs = new LinkedList<>();

        bfs.add(root);

        while (!bfs.isEmpty()) {
            int size = bfs.size();
            int levelSum = 0;
            while (size-- > 0) {

                TreeNode curr = bfs.poll();
                levelSum += curr.val;

                if (curr.left != null) bfs.add(curr.left);
                if (curr.right != null) bfs.add(curr.right);

            }

            level++;

            if (levelSum > maxSum) {
                maxSum = levelSum;
                maxSumLevel = level;
            }
        }

        return maxSumLevel;
    }
}
