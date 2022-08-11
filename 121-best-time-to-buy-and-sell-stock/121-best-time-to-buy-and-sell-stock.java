class Solution {
    public int maxProfit(int[] prices) {
        
        int left = 0;
        int right = 1;
        int lastmax = 0;
        
        while(right < prices.length){
            
            if(prices[right] > prices[left]){
                
                lastmax = Math.max(prices[right] - prices[left], lastmax);
                
            }else{
                
                left = right;
                
            }
            
            right++;
            
        }
        return lastmax;
    }
}