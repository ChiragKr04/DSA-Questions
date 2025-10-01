class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalb = numBottles;
        int empty = numBottles;

        while(empty >= numExchange) {
            int newb = empty / numExchange;
            totalb += newb;
            empty = newb + empty % numExchange;
        }

        return totalb;
    }
}