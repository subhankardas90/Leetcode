package subhankar.LC75;

//LC 1448. Count Good Nodes in Binary Tree
public class LC7533 {
    int count=0;
    public int goodNodes(TreeNode root) {
        helper(root, root.val);
        return count;
    }

    public void helper(TreeNode root, int max){
        if(root==null)
            return;
        if(root.val>=max)
            count++;
        helper(root.left, Math.max(root.val, max));
        helper(root.right, Math.max(root.val, max));
    }
}
