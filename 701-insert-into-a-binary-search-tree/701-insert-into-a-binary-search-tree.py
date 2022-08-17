# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def insertIntoBST(self, root: Optional[TreeNode], target: int) -> Optional[TreeNode]:
        
        
        def helper(root):
            
            if root is None:
                return TreeNode(target)
            
            if root.val > target:
                root.left = helper(root.left)
            
            if root.val < target:
                root.right = helper(root.right)
                
            return root
            
        return helper(root)
                
                
        
        
        
        
        
        
        
        
        
        