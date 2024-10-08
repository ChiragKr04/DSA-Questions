class Solution:
    def minSwaps(self, s: str) -> int:
        
        isOpen = '['
        isClose = ']'
        
        swaps = 0
        
        p1 = 0
        
        
        if len(s) == 2 and s[0] == isOpen and s[1] == isClose:
            return 0
        
        
        for char in s:
            
            if char == isOpen:
                
                p1 += 1
                
            else:
                
                p1 -= 1
                
            if p1 < 0:
                
                p1 += 2
                swaps += 1
            
        
        return swaps
        
        
        