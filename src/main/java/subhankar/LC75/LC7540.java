package subhankar.LC75;

//LC 450. Delete Node in a BST
public class LC7540 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root== null)
            return null;
        if(key<root.val){
            root.left = deleteNode(root.left, key);
        }else if(key>root.val){
            root.right = deleteNode(root.right, key);
        }else{
            if(root.left ==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            else{
                TreeNode min = findMin(root.right);
                root.val = min.val;
                root.right = deleteNode(root.right, root.val);
            }
        }
        return root;

    }
    private TreeNode findMin(TreeNode node){
        while(node.left != null){
            node = node.left;
        }
        return node;
    }
}
