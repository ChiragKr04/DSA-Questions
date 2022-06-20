class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        maxsub = nums[0]
        
        currmax = 0
        
        for n in nums:
            
            if currmax < 0:
                currmax = 0
            
            currmax += n
            
            maxsub = max(maxsub, currmax)
            
        return maxsub
        
        