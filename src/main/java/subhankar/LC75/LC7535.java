package subhankar.LC75;

//LC  1372. Longest ZigZag Path in a Binary Tree
public class LC7535 {
    int max =0;
    public int longestZigZag(TreeNode root) {
        if(root ==null)
            return -1;
        helper(root.left, 1, false);
        helper(root.right,1, true);

        return max;
    }
    public void helper(TreeNode root, int step, boolean isRight){
        if(root==null)
            return;
        max = Math.max(max, step);
        if(isRight){
            helper(root.left, step+1, false);
            helper(root.right, 1, true);
        }else{
            helper(root.left, 1, false);
            helper(root.right, step+1, true);
        }
    }
}
