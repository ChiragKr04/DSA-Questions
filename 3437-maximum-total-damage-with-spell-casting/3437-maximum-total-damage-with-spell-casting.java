class Solution {
    public long maximumTotalDamage(int[] power) {
        // 1. Count the occurrences of each damage value
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int damage : power) {
            countMap.put(damage, countMap.getOrDefault(damage, 0) + 1);
        }

        // 2. Get sorted unique damages
        List<Integer> uniqueDamages = new ArrayList<>(countMap.keySet());
        Collections.sort(uniqueDamages);

        int n = uniqueDamages.size();
        long[] dp = new long[n + 1];

        // 3. Dynamic Programming
        for (int i = 0; i < n; i++) {
            int currentDamage = uniqueDamages.get(i);
            long currentDamageTotal = (long) currentDamage * countMap.get(currentDamage);

            // Find the first index 'j' such that uniqueDamages[j-1] < currentDamage - 2
            int j = i;
            while (j > 0 && uniqueDamages.get(j - 1) >= currentDamage - 2) {
                j--;
            }

            // Calculate dp[i+1] based on two choices: skipping or taking
            // Skip: max damage is the same as the previous step
            long skipDamage = dp[i];
            // Take: damage from current spell + max damage from a compatible previous step (dp[j])
            long takeDamage = dp[j] + currentDamageTotal;

            dp[i + 1] = Math.max(skipDamage, takeDamage);
        }

        // 4. The final result is the last element of the dp array
        return dp[n];
    }
}