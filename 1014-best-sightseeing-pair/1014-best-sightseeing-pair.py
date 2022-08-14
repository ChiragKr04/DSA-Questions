class Solution:
    def maxScoreSightseeingPair(self, values: List[int]) -> int:
        
        le = len(values)
        larr = [0]*le
        rarr = [0]*le
        
        m = 0
        
        for i in range(le-1):
            rarr[i] = max(values[i]+i,rarr[i-1])
        
        
        larr[le-1] = values[le-1] - (le-1)
        
        for i in range(le-2,0,-1):
            larr[i] = max(values[i]-i,larr[i+1])
            
        # print(rarr,larr)
            
        
        for i in range(le-1):
            
            m = max(rarr[i] + larr[i+1],m)
            

        return m
            
        
        