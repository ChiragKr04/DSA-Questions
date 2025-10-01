class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;
        long [] pre = new long[n];
        long [] suf = new long[n];

        pre[0] = nums[0];
        suf[n-1] = nums[n-1];

        for(int i=1;i<n;i++) {
            pre[i] = pre[i-1] + (long)nums[i];
        }

        for(int i=n-2;i>=0;i--) {
            suf[i] = suf[i+1] + (long)nums[i];
        }

        boolean[] inc = new boolean[n];
        boolean[] dec = new boolean[n];

        inc[0] = true;
        for(int i=1;i<n;i++){
            inc[i] = inc[i-1] && (nums[i] > nums[i-1]);
        }

        dec[n-1] = true;
        for(int i=n-2;i>=0;i--){
            dec[i] = dec[i+1] && (nums[i] > nums[i+1]);
        }

        long minDiff = Long.MAX_VALUE;
        boolean found = false;

        for(int i=0;i<n-1;i++){
            if(inc[i] && dec[i+1]){
                long leftSum = pre[i];
                long rightSum = suf[i+1];
                minDiff = Math.min(minDiff, Math.abs(leftSum - rightSum));
                found = true;
            }
        }

        return found ? minDiff : -1;
    }
}
