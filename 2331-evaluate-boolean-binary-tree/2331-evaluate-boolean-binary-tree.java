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
    public boolean evaluateTree(TreeNode root) {
        return order(root);
    }
    
    public boolean order(TreeNode node){
        
        if(node.left == null && node.right == null){
            if(node.val == 1){
                return true;
            }
            return false;
        }
        boolean left = order(node.left);
        boolean right = order(node.right);
        
        if(node.val == 2){
            return left || right;
        }else{
            return left && right;
        }
    }
    
}