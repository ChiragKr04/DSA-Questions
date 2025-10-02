class Solution {
    public int totalFruit(int[] nums) {
        int start = 0;
        int max = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int end = 0; end < n; end++) {

            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);

            while(map.size() > 2) {

                map.put(nums[start], map.get(nums[start]) - 1);
                if(map.get(nums[start]) == 0) {
                    map.remove(nums[start]);
                }

                start++;

            }

            max = Math.max(max, end - start + 1);

        }

        return max;

    }
}