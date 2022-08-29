class Solution {
public:
    int waysToMakeFair(vector<int>& nums) {
        int n=nums.size();
        vector<int>oddSum(n,0);
        vector<int>evenSum(n,0);
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even+=nums[i];
            }
            else{
                odd+=nums[i];
            }
            evenSum[i]=even;
            oddSum[i]=odd;
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(i==0){
                int nos=evenSum[n-1]-nums[0];
                int nes=oddSum[n-1];
                if(nos==nes){
                    cnt++;
                    
                }
                continue;  
            }
            int nes=evenSum[i-1]+oddSum[n-1]-oddSum[i];
            int nos=oddSum[i-1]+evenSum[n-1]-evenSum[i];            
            if(nes==nos){
                cnt++;
            }
        }
        return cnt;
    }
};