class Solution {
    public int bs(int[] nums, int target) {

        int l = 0;

        int u = nums.length;

        while (l < u) {

            int mid = l + ((u - l) / 2);
            System.out.println(mid);

            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                u = mid;
            }

        }
        return l;
    }
    public int[] searchRange(int[] nums, int target) {
        int low = bs(nums, target);
        int hi = bs(nums, target + 1) - 1;

        if (low <= hi) {
            return new int[] {
                low,
                hi
            };
        }
        return new int[] {
            -1, -1
        };
    }
}