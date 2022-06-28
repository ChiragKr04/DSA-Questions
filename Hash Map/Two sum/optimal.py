class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        
        for i,val in enumerate(nums):
            
            tg = target - val
            
            if tg in map:
                
                return [map[tg],i]
            
            map[val] = i
            
        