class Solution {
    public int countPrimes(int n) {
        if (n < 3) return 0;

        // We only store odd numbers (save ~50% memory)
        int size = (n >> 1); // count of odd numbers < n
        byte[] isPrime = new byte[(size + 7) >> 3]; // bit array

        // Initially, assume all odd numbers are prime
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = (byte) 0xFF;
        }

        int limit = (int)Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2) {
            if (!getBit(isPrime, i >> 1)) continue;
            // mark multiples of i as not prime
            for (int j = i * i; j < n; j += i << 1) { // skip even multiples
                clearBit(isPrime, j >> 1);
            }
        }

        // count primes (2 + all odd primes)
        int count = 1; // for prime number 2
        for (int i = 1; i < size; i++) {
            if (getBit(isPrime, i)) count++;
        }
        return count;
    }

    private boolean getBit(byte[] arr, int idx) {
        return (arr[idx >> 3] & (1 << (idx & 7))) != 0;
    }

    private void clearBit(byte[] arr, int idx) {
        arr[idx >> 3] &= ~(1 << (idx & 7));
    }
}
