# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxAncestorDiff(self, root: Optional[TreeNode]) -> int:
        
        
        def helper(root, mx, mn):
            
            if not root:
                return mx - mn
            
            mx = max(mx, root.val)
            mn = min(mn, root.val)
            
            return max(helper(root.left,mx,mn), helper(root.right, mx, mn))
        
        return helper(root, root.val, root.val)
            
            
        
        
        