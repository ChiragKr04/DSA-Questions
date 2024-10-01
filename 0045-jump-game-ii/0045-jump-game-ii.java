class Solution {
    public int jump(int[] nums) {
        int myjumps = 0;
        int curMaxDist = 0;
        int end = 0;
                
        for(int i = 0; i < nums.length - 1; i++){
            curMaxDist = Math.max(curMaxDist, i + nums[i]);
            if (i == end) {
                 myjumps += 1;
                
                end = curMaxDist;
            }
               System.out.println();
        }
        
        return myjumps;
    }
}