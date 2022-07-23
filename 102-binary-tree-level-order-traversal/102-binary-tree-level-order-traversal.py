# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        d = {}
        def rec(root,level):
            
            if not root:
                return

            curVal = d.get(level,[])

            curVal.append(root.val)
            
            d[level] = curVal

            rec(root.left,level+1)
            
            rec(root.right,level+1)
            
        rec(root,0)

        return list(d.values())
    