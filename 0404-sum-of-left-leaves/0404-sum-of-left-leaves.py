# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumOfLeftLeaves(self, root: Optional[TreeNode]) -> int:
        
        self.sum = 0
        
        def traverse(root, isLeft):
            
            if root.left is None and root.right is None:
                
                if isLeft:
                    self.sum += root.val
                    
            if root.left:
                
                traverse(root.left, True)
            
            if root.right:
                
                traverse(root.right, False)
        
        traverse(root, False)
        return self.sum
        
        