# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findTarget(self, root: Optional[TreeNode], target: int) -> bool:
        
        out = []
        
        def helper(root):
            
            if root is None:
                return
            
            out.append(root.val)
            helper(root.left)
            helper(root.right)
        
        helper(root)
        
        m = {}
        
        for i,val in enumerate(out):
            
            tg = target - val
            
            if tg in m:
                
                return True
            
            m[val] = i
            
        return False
        
        
        