def maxProfit(prices):

    left = 0
    right = 1

    maxprofit = 0

    while right < len(prices):

        if prices[right] > prices[left]:
            curr_profit = prices[right] - prices[left]
            maxprofit = max(maxprofit, curr_profit)
        else:
            left = right
        
        right += 1

    return maxprofit


print(maxProfit([7,1,5,3,6,4]))
