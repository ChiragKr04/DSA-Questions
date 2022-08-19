class Solution:
    def isPossible(self, nums: List[int]) -> bool:
        
        
        freq = Counter(nums)
        start, end = nums[0], nums[len(nums)-1]
        i = start
        while i < end+1:
            if freq[i] == 0:
                i+=1
                continue

            max_freq = freq[i]
            j=i
            count=0
            while j < end+1 and freq[j] >= max_freq:
                if max_freq < freq[j]:
                    max_freq = freq[j]

                freq[j]-=1
                j+=1
                count+=1
            if count < 3:
                return False
        return True
            
        
        
        