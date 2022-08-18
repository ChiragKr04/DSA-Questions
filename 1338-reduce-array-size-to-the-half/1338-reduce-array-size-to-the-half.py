class Solution:
    def minSetSize(self, arr: List[int]) -> int:
        
        ct = 0
        
        ctr = Counter(arr)
        
        narr = sorted(ctr.values())
        
        narr.reverse()
        
        target = len(arr)//2
        
        for index, count in enumerate(narr):
                                      
            ct += count
            
            if ct >= target:
            
                return index + 1
        
        return 0

        
        
        
        