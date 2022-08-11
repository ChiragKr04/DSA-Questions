# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode], left=-inf, right=inf) -> bool:
        
        # why -inf and +inf coz values are bigger
        
        if root is None:
            return True
        
        
        if(root.val>=right or root.val<=left):
            return False
        
        # for left tree -> pass left as left and right as prev left (prev node) 
        x = self.isValidBST(root.left,left,root.val)

        # for right tree -> pass left as prev val and right as right (prev node)
        y = self.isValidBST(root.right,root.val,right)

        
        return x and y
        