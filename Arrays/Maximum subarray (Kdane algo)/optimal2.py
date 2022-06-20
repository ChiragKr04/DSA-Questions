class Solution(object):
    def maxSubArray(self, nums):

        maxsofar = nums[0]
        maxending = nums[0]

        for i in range(1,len(nums)):
            maxending = max(nums[i], maxending + nums[i])
            maxsofar = max(maxsofar,maxending)
                
        return maxsofar
        