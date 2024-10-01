class Solution:
    def jump(self, nums: List[int]) -> int:

        #  2 4 1 1 1 1 1
        
        myjumps = 0
        curMaxDist = 0
        end = 0
                
        for i in range(len(nums) - 1):
            
            curMaxDist = max(curMaxDist, i + nums[i])
            
            if i == end:
                myjumps += 1
                
                end = curMaxDist
            
            
        
        return myjumps
            
            
        
        


        