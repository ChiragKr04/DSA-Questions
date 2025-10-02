class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int[] pmax = new int[n];
        int[] smax = new int[n];
        pmax[0] = height[0];
        smax[n - 1] = height[n - 1];
        for (int i = 1; i < n; i++) {
            pmax[i] = Math.max(height[i], pmax[i - 1]);
        }

        for (int i = n-2; i >= 0; i--) {
            smax[i] = Math.max(height[i], smax[i + 1]);
        }

        int total = 0;
        for(int i = 0; i < n; i++) {
            int leftMax = pmax[i];
            int rightMax = smax[i];

            if(height[i] < leftMax && height[i] < rightMax) {
                total += Math.min(leftMax, rightMax) - height[i];
            }
        }

        return total;
    }
}