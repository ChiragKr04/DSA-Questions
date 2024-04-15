/**
 * Definition for a binary tree node.
 * class TreeNode {
 *   int val;
 *   TreeNode? left;
 *   TreeNode? right;
 *   TreeNode([this.val = 0, this.left, this.right]);
 * }
 */
class Solution {
  int sumNumbers(TreeNode? root) {
      
      int fun(TreeNode? root, int num) {
          if(root == null) {
              return 0;
          }
          num = num * 10 + root.val;
          
          if (root.left == null && root.right == null) {
              return num;
          }
          
          int left = fun(root.left, num);
          int right = fun(root.right, num);
          
          return left + right;
      }
      
      return fun(root, 0);
  }
}