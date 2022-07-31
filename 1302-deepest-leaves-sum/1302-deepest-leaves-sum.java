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
    
    // using DFS
    
    // global level => stores the max level we gone so far
    int mainlvl = -1;
    // sum to return
    int sum = 0;
    
    public int deepestLeavesSum(TreeNode root) {
        level(root,0);
        return sum;    
    }
    
    void level(TreeNode root, int lvl){
        if(root==null){
            return;
        }
        // Check if we at leaf node
        if(root.left == null && root.right == null){
            // if gloval lvl is less than current lvl
            // change global lvl to curr lvl and init sum 
            // (re-init sum) coz what if we we have more leaf node at down
            if(mainlvl < lvl){
                mainlvl = lvl;
                sum = root.val;   
            }
            // check if curr lvl and main lvl is same 
            // means we at same lvl
            // the add to sum
            else if(mainlvl == lvl){
                sum += root.val;
            }
        }
        // left tree
        level(root.left,lvl+1);
        // right tree
        level(root.right,lvl+1);
    }
    
}