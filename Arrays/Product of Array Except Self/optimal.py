class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        pre = 1
        post = 1
        l = len(nums)
        # calc prefix from start
        
        out = [1]*l
        
        for i in range(l):
            out[i] = pre
            pre *= nums[i]
            
        for i in range(l-1,-1,-1):
            out[i] *= post
            post *= nums[i]
            
            
        return out
            
            
        
        