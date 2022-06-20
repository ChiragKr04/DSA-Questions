class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxsub = nums[0];
        
        int currmax = 0;
        
        for(int i=0;i<nums.length;i++){
            if(currmax < 0){
                currmax = 0;
            }
            currmax += nums[i];
            
            maxsub = Math.max(maxsub, currmax);
        }
        return maxsub;
    }
}