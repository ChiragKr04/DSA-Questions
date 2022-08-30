class Solution:
    def search(self, nums: List[int], target: int) -> int:
        
        
        s = 0
        e = len(nums) - 1
        
        while s <= e:
            
            mid = (s+e) // 2
            
            if nums[mid] == target:
                return mid
            
            if nums[mid] < target:
                
                s = mid + 1
            
            else:
                
                e = mid - 1
                
        return -1
        
        # while(low <= high){
        #     int mid = (int)((low+high)/2);
        #     if(nums[mid]==target){
        #         return mid;
        #     }
        #     if(nums[mid] > target){
        #         high = mid - 1;
        #     }
        #     else if (nums[mid] < target){
        #         low = mid + 1;
        #     }
        # }
        # return -1;
        
        
        
        
        
        