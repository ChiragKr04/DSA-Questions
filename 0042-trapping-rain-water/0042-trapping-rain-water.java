class Solution {
    public int trap(int[] height) {

        int total = 0;
        int left = 0;
        int right = height.length - 1;
        int lmax = height[0];
        int rmax = height[height.length - 1];
        
        while(left < right) {

            if(lmax < rmax) {
                left ++;
                lmax = Math.max(lmax, height[left]);
                total += lmax - height[left];
            } else {
                right --;
                rmax = Math.max(rmax, height[right]);
                total += rmax - height[right];
            }

        }

        return total;

    }
}