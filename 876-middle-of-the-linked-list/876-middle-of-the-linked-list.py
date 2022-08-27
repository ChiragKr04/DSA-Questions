# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        sl = fs = head
        
        while fs is not None and fs.next is not None:
            sl = sl.next
            fs = fs.next.next
            
        return sl
            
            
        
        
        