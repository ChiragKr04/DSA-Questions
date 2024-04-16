# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def addOneRow(self, root: Optional[TreeNode], val: int, depth: int) -> Optional[TreeNode]:
        
        if depth == 1:
            return TreeNode(val, root, None)
        
        queue = [root]
        
        while 0 < len(queue):
            
            depth -= 1
            
            count = len(queue)
            
            for _ in range(count):
                node = queue.pop(0)
                
                if node.left is not None:
                    queue.append(node.left)
                    
                if node.right is not None:
                    queue.append(node.right)
                    
                if depth == 1:
                    node.left = TreeNode(val, node.left, None)
                    node.right = TreeNode(val, None, node.right)
                
            if depth == 1:
                break
                
        return root

# class Solution:
#     def addOneRow(self, root: Optional[TreeNode], val: int, depth: int) -> Optional[TreeNode]:
        
#         if depth == 1:
#             return TreeNode(val, root, None)
        
#         elif depth == 2:
#             root.left = TreeNode(val, root.left, None)
#             root.right = TreeNode(val, None, root.right)

#         else:
#             if root.left:
#                 self.addOneRow(root.left, val, depth - 1)
#             if root.right:
#                 self.addOneRow(root.right, val, depth - 1)
        
#         return root

