class Solution {
    public int singleNumber(int[] nums) {
        
        Arrays.sort(nums);

        int ct = 1;
        int n = nums.length;

        while(ct < n) {

            if(nums[ct] != nums[ct-1]) {
                return nums[ct-1];
            }

            ct += 3;
        }

        return nums[n-1];

    }
}