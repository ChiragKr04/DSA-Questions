class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        left = 0
        right = 1
        
        maxprofit = 0
        
        
        while right < len(prices):
            
            if prices[right] > prices[left]:
                curr_profit = prices[right] - prices[left]
                maxprofit = max(maxprofit,curr_profit)
            else:
                left = right
        
            right += 1
            
            
        return maxprofit
        