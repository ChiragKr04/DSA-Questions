class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        
        
        
        
        leftsum = 0
        
        totalsum = sum(nums)
        
        for i in range(len(nums)):
            
            diff = totalsum - nums[i] - leftsum
            
            if diff == leftsum:
                return i
            
            leftsum += nums[i]
            
        return -1
            
            
        
        
        
        