# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def evaluateTree(self, root: Optional[TreeNode]) -> bool:
        
        
        def order(node):
            
            if node.left is None and node.right is None:
                if node.val == 1:
                    return True
                return False
            
            x = order(node.left)
            y = order(node.right)
            
            if node.val == 2:
                return x or y
            else:
                return x and y
            
        
        return order(root)
            
        
        