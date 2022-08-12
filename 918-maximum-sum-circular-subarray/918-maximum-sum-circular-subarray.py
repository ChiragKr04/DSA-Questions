class Solution:
    def maxSubarraySumCircular(self, nums: List[int]) -> int:
        
        
        if max(nums) <= 0:
            return max(nums)
        
        
        lmax = nums[0]
        gmax = nums[0]
        
        lmin = nums[0]
        gmin = nums[0]
        
        
        for i in range(1,len(nums)):
            
            lmax = max(nums[i],nums[i]+lmax)
            gmax = max(gmax,lmax)
            
            
            lmin = min(nums[i],nums[i]+lmin)
            gmin = min(gmin,lmin)
        
            
        return max(gmax, sum(nums)-gmin)
        
        