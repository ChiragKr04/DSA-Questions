class Solution {
    public int pivotIndex(int[] nums) {
        int lsum = 0;
        int totalsum = 0;
        for(int i=0;i<nums.length;i++)
            totalsum += nums[i];
        int diff;
        for(int i=0;i<nums.length;i++){
            diff = totalsum - nums[i] - lsum;
            if(diff==lsum){
                return i;
            }
            lsum += nums[i];
        }
        return -1;
    }
}