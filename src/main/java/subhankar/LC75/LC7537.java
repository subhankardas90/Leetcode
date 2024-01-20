package subhankar.LC75;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//LC 199. Binary Tree Right Side View
public class LC7537 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
            return result;
        q.offer(root);
        while(!q.isEmpty()){
            int size= q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                if(i==0)
                    result.add(curr.val);
                if(curr.right!=null)
                    q.offer(curr.right);
                if(curr.left!=null)
                    q.offer(curr.left);

            }

        }
        return result;
    }
}
