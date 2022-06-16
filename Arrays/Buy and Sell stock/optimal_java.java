class Solution {
    public int maxProfit(int[] prices) {

        int right = 1;
        int left = 0;

        int max_profit = 0;

        while (right < prices.length) {

            if (prices[right] > prices[left]) {
                int curr_profit = prices[right] - prices[left];

                max_profit = Math.max(max_profit, curr_profit);
            } else {
                left = right;
            }
            right++;
        }
        return max_profit;
    }
}

class optimal_java {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(s.maxProfit(prices));
    }
}
