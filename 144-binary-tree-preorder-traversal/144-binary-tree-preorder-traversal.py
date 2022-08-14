# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        
        def preorder(root, order):
            
            if not root:
                return order
            
            order.append(root.val)
            preorder(root.left, order)
            preorder(root.right, order)
            
            return order
        
        return preorder(root,[])
        
        