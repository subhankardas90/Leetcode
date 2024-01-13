package org.example;

//LC 700. Search in a Binary Search Tree
public class LC7539 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return null;

        if(root.val == val)
            return root;
        if(root.val>val)
            return searchBST(root.left, val);
        else
            return searchBST(root.right, val);

    }
}
