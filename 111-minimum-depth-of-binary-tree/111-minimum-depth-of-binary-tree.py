# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        
        def dfs(root):
            if not root:
                return inf
            
            if not root.left and not root.right:
                return 1
            
            return min(1 + dfs(root.left),1 + dfs(root.right))
        
        if not root:
            return 0
        
        return dfs(root)
        