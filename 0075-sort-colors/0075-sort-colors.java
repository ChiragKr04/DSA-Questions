class Solution {
    public void sortColors(int[] nums) {
        
        int [] count = {0,0,0};

        for(int n : nums) {
            count[n]++;
        }

        int ct = 0;

        for (int i = 0; i < 3; i++) {
            while (count[i] > 0) {
                nums[ct] = i;
                ct++;
                count[i]--;
            }
        }
    }

}