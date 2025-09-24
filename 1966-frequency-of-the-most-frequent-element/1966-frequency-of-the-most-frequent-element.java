class Solution {
    public int maxFrequency(int[] nums, int k) {
        
        Arrays.sort(nums);
        int n = nums.length;

        int left = 0;
        int right = 0;
        long res = 0;
        long total = 0;

        while(right < n) {

            total += nums[right];

            while((long)nums[right] * (right - left + 1) > total + k) {
                total -= nums[left];
                left ++;
            }

            res = Math.max(res, (right - left + 1));
            right++;
        }

        return (int)res;

    }
}