class Solution {
    public int countPrimes(int n) {

        if(n < 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }
        int ct = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i])
                ct++;
        }

        return ct;

    }
}