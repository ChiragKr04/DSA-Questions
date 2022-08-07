# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def bstFromPreorder(self, preorder: List[int]) -> Optional[TreeNode]:
        
        if len(preorder) == 0:
            return None
        
        root = TreeNode(preorder[0])

        
        def helper(root,val):
            
            if root is None:
                return TreeNode(val)
            elif root.val > val:
                root.left = helper(root.left, val)
            else:
                root.right = helper(root.right, val)
                
            return root
        
        
        for n in preorder[1:]:
            print(n)
            helper(root, n)
        
        return root
        
        
        