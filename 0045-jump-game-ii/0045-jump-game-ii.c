int jump(int* nums, int numsSize) {
    
    int myjumps = 0;
        int curMaxDist = 0;
        int end = 0;
                
        for(int i = 0; i < numsSize - 1; i++){
            curMaxDist = fmax(curMaxDist, i + nums[i]);
            if (i == end) {
                 myjumps += 1;
                
                end = curMaxDist;
            }
        }
        
        return myjumps;
    
}