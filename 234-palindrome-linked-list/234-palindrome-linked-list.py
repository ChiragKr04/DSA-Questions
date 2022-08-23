# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        
        res = list()
        
        temp = head
        
        while temp is not None:
            
            res.append(temp.val)
            temp = temp.next
            
        r = list(reversed(res))
        print(r)
        
        return res == r
        
        
        
        
        