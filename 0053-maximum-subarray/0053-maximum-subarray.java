class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = nums[0];
        int cursum = 0;

        for(int i=0; i < nums.length; i++) {

            cursum += nums[i];
                
            max = Math.max(max, cursum);
            cursum = Math.max(0, cursum);

        }
        
        return max;
    }
}