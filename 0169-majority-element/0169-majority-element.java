class Solution {
    public int majorityElement(int[] nums) {
        int el = Integer.MIN_VALUE;

        int ct = 0;

        for(int num : nums) {
            if (ct == 0) {
                el = num;
                ct++;
                continue;
            }
            if (num == el) {
                ct++;
            } else {
                ct--;
            }
            
        }

        return el;
    }
}