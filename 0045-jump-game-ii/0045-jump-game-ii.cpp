class Solution {
public:
    int jump(vector<int>& nums) {
        
        int myjumps = 0;
        int curMaxDist = 0;
        int end = 0;
                
        for(int i = 0; i < nums.size() - 1; i++){
            curMaxDist = max(curMaxDist, i + nums[i]);
            if (i == end) {
                 myjumps += 1;
                
                end = curMaxDist;
            }
        }
        
        return myjumps;
        
    }
};