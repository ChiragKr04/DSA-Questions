class Solution:
    def rob(self, nums: List[int]) -> int:
        
        if len(nums) == 0:
            return 0
        
        if len(nums) == 1:
            return nums[0]
        
        p1 = 0
        p2 = 0
        
        
        for num in nums:
            
            t = p1
            p1 = max(p2+num,p1)
            p2 = t
            
        return p1
            
        