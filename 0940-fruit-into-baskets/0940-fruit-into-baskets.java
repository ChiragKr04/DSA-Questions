class Solution {
    public int totalFruit(int[] nums) {
        int n = nums.length;
        int lastf = -1;
        int slastf = -1;
        int lastct = 0;
        int max = 0;
        int curmax = 0;

        for(int i = 0; i < n; i++) {

            int fruit = nums[i];

            if(fruit == lastf || fruit == slastf) {
                curmax++;
            } else {
                curmax = lastct + 1;
            }

            if(fruit == lastf) {
                lastct++;
            } else {
                lastct = 1;
                slastf = lastf;
                lastf = fruit;
            }

            max = Math.max(max, curmax);

        }

        return max;

    }
}
