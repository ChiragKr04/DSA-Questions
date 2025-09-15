class Solution {
    public int rob(int[] nums) {

        Integer [] dp = new Integer[nums.length];

        return rec(nums.length-1, nums, dp);
        
    }

    public int rec(int idx, int[] nums, Integer[] dp) {

        if(idx == 0) {
            return nums[idx];
        }
        if(idx < 0) {
            return 0;
        }
        if(dp[idx]!=null) {
            return dp[idx];
        }

        int pick = nums[idx] + rec(idx - 2, nums, dp);
        int npick = 0 + rec(idx - 1, nums, dp);

        dp[idx] = Math.max(pick, npick);
        return dp[idx];

    }

}