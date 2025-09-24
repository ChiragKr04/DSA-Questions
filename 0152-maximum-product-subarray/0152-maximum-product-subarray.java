class Solution {
    public int maxProduct(int[] nums) {

        int l = 1;
        int r = 1;
        int ans = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i=0;i<n;i++) {

            l = l == 0? 1: l;
            r = r == 0? 1: r;
            
            l *= nums[i];
            r *= nums[n - 1 - i];

            ans = Math.max(ans, Math.max(l,r));

        }

        return ans;
        
    }
}