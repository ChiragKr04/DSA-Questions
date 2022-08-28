class Solution:
    def waysToMakeFair(self, nums: List[int]) -> int:
        
        l = len(nums)
        
        odd = list()
        even = list()
        
        osum = 0
        esum = 0
        
        for i in range(0,l):
            
            if i % 2 == 0:
                
                esum += nums[i]
            
            else:
                
                osum += nums[i]
                
            odd.append(osum)
            even.append(esum)
        
        ans = 0
        
        for i in range(0, l):
            
            if i == 0:
                nos = even[l-1] - nums[0]
                nes = odd[l-1]
                if nes == nos:
                    ans+=1
                continue
            
            nes = even[i-1] + odd[l-1] - odd[i]
            nos = odd[i-1] + even[l-1] - even[i]
            
            if nes == nos:
                ans+=1
                    
        return ans
        
        
        
        