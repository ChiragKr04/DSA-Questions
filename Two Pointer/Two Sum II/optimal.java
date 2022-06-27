class Solution {
    public int[] twoSum(int[] num, int target) {
        int left = 0;
        int right = num.length - 1;
        int res[] = {-1,-1};
        
        while(left < right){
            int currSum = num[left]+num[right];
            if(currSum == target){
                res[0] = left+1;
                res[1] = right+1;
                return res;
            }else if(currSum > target){
                right--;
            }else{
                left++;
            }
        }
        return res;
    }
}