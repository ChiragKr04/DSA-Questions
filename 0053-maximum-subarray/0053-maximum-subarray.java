class Solution {
    public int maxSubArray(int[] nums) {
        
        int ans = nums[0];
        int sum = nums[0];
        int i = 1;
        while (i < nums.length) {
            sum += nums[i];
            if(nums[i] >= sum) {
                sum = nums[i];
            }
            ans = Math.max(ans, sum);
            i++;
        }
        return ans;
    }
}