import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (hs.contains(nums[i])) {
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
}

public class optimal_java {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(s.containsDuplicate(nums));
    }
}
