# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def getTargetCopy(self, original: TreeNode, cloned: TreeNode, target: TreeNode) -> TreeNode:
        
        self.out = None
        
        def order(root,cloned):
            
            if root is None:
                return
            
            order(root.left,cloned.left)
                
            if root is target:
                self.out = cloned
                    
            order(root.right, cloned.right)
                
        
        order(original,cloned)
        
        return self.out
        