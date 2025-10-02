class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {

        int fullBottle = numBottles;
        int emptyBottles = 0;
        int exchangeRate = numExchange;
        int bottleDrunk = 0;

        while (true) {
            if (fullBottle == numBottles) {
                emptyBottles += fullBottle;
                bottleDrunk += emptyBottles;
                fullBottle = 0;
                continue;
            }
            if (emptyBottles >= exchangeRate) {
                fullBottle++;
                emptyBottles = emptyBottles - exchangeRate;
                exchangeRate++;
            } else if (fullBottle > 0) {
                emptyBottles += fullBottle;
                bottleDrunk += fullBottle;
                fullBottle = 0;
            } else {
                return bottleDrunk;
            }
        }

        // return bottleDrunk;

    }
}