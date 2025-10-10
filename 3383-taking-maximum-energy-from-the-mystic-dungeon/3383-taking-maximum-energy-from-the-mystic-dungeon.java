class Solution {
    public int maximumEnergy(int[] nums, int k) {

        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = n-k; i < n; i++) {
            int j = i;
            int sum = 0;
            while(j >= 0) {
                sum += nums[j];
                j -= k;
                max = Math.max(max, sum);
            }
        }

        return max;
        
    }
}