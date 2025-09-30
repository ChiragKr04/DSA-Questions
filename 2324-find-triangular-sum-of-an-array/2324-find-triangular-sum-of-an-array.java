class Solution {
    public int triangularSum(int[] nums) {

        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        for (int i = 1; i < n; i++) {
            nums[i - 1] = (nums[i - 1] + nums[i]) % 10;
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                nums[j - 1] = (nums[j - 1] + nums[j]) % 10;
            }
        }

        return nums[0];
    }
}