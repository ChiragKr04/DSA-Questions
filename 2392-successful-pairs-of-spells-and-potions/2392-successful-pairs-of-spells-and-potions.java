class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int n = spells.length;
        int m = potions.length;

        Arrays.sort(potions);

        int [] out = new int[n];
        
        for(int i = n-1; i >= 0; i--) {

            int low = 0;
            int high = m - 1;
            int count = m;

            while(low <= high) {
                int mid = low + (high - low) / 2;

                if((long) spells[i] * potions[mid] >= success) {
                    count = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }

            out[i] = m - count;

        }

        return out;

    }
}