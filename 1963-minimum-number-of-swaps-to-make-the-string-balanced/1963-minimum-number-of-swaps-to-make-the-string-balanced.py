class Solution:
    def minSwaps(self, s: str) -> int:
        
        swaps = 0
        
        p1 = 0

        for char in s:
            
            if char == '[':
                
                p1 += 1
                
            else:
                
                p1 -= 1
                
            if p1 < 0:
                
                p1 += 2
                swaps += 1
            
        
        return swaps
        
        
        