# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findTarget(self, root: Optional[TreeNode], k: int) -> bool:
        
        m = {}
        
        def helper(root):
            
            if root is None:
                return
            
            if root.val in m:
                return True
            
            m[k-root.val] = True
            
            return helper(root.left) or helper(root.right)
            
        
        return helper(root)
        
        
        
        
        