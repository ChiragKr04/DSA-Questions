# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def deepestLeavesSum(self, root: Optional[TreeNode]) -> int:
        
        # using BFS
        
        # dict for storing level wise values
        dc = {}
        
        def level(root,lvl):
            
            if root is None:
                # return 0 is at end of root
                return 0
            
            # checking if we at leaf node coz right and left are null
            if root.left is None and root.right is None:
                # inserting if level already exists
                if lvl in dc:
                    dc[lvl].append(root.val)
                # new key for level if not in dict
                else:
                    dc[lvl] = [root.val]
            
            # left side of tree
            level(root.left,lvl+1)
            # right side of tree
            level(root.right,lvl+1)
        
        level(root,0)
        
        # getting value from max key (which is deepest level) and adding and returning 
        return sum(dc[max(dc)])
        
        