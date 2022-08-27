# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        
        start = 0
        
        end = n
        
        while start < n:
            
            mid = start + (end-start) // 2
            
            if (isBadVersion(mid)==True and (isBadVersion(mid-1)==False or mid == 1)):
                
                return mid
            
            elif (isBadVersion(mid)==True and isBadVersion(mid-1)==True):
                
                end = mid-1
                
            elif isBadVersion(mid)==False:
                
                start = mid + 1
                
        return n
        
        
        
        