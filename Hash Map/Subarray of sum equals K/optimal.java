class Solution {
    public int subarraySum(int[] nums, int k) {
        
        
        int res = 0;
        
        int currsum = 0;
        
        int diff;
        
        HashMap<Integer,Integer> presum = new HashMap<>();
        
        
        presum.put(0,1);
        
        for(int i=0;i<nums.length;i++){
            
            
            currsum += nums[i];
            
            diff = currsum - k;
            
            if(presum.containsKey(diff)){
                res += presum.get(diff);
            }
            if(presum.containsKey(currsum)){
                presum.put(currsum, 1 + presum.get(currsum));
            }else{
                presum.put(currsum, 1);
            }
            
        }
        
        return res;
        
    }
}