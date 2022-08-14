# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        
        temp = head
        res = curr = ListNode(0)
        
        
        while temp is not None:
            
            if temp.val != val:
                curr.next = ListNode(temp.val)    
                curr = curr.next
                
            temp = temp.next
            
        return res.next
        
        
        