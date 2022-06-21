class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int pre = 1;
        int post = 1;
        int len = nums.length;
        int[] out = new int[len];
        
        for(int i = 0; i < len; i++){
            
            out[i] = pre;
            
            pre *= nums[i];
            
        }
        
        for(int i = len-1; i > -1; i--){
            
            out[i] *= post;
            
            post *= nums[i];
            
        }
        
        return out;
        
    }
}