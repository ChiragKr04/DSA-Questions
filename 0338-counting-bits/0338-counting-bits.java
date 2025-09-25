class Solution {
    public int[] countBits(int n) {
        int [] out = new int[n+1];
        for(int i=0;i<=n;i++) {
            out[i] = (bitCount(i));
        }
        return out;
    }

    public int bitCount(int n) {

        int ct = 0;

        while (n != 0) {

            if((n & 1) == 1) {
                ct ++;
            }

            n = n >> 1;
        }
        return ct;
    }

}