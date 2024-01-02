class Solution:
    def findContentChildren(self, greed: List[int], cookie: List[int]) -> int:
        
        greed.sort()
        cookie.sort()
        
        
        child = 0
        cidx = 0
        
        while (cidx < len(cookie) and child < len(greed)):
            if cookie[cidx] >= greed[child]:
                child+=1
            cidx+=1
                
        return child
        
        
        