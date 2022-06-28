class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        
        
        map = Counter(nums1)
        res = []
        for x in nums2:
            
            if x in map and map[x] > 0:
                res.append(x)
                map[x] = -1
        
        
        return res
        