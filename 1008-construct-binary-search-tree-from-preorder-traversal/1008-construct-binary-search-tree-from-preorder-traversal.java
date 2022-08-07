/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        for(int i=1; i < preorder.length; i++){
            helper(root,preorder[i]);
        }
        return root;
    }
    
    public TreeNode helper(TreeNode root, int val){
        
        if(root == null){
            return new TreeNode(val);
        }
        else if(val < root.val){
            root.left = helper(root.left,val); 
        }
        else{
            root.right = helper(root.right,val); 
        }
        
        return root;
    }
}