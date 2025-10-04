class Solution {
    public int maxDifference(String s) {
        
        int [] map = new int[27];

        for(char c: s.toCharArray()) {
            map[c - 'a']++; 
        }

        int oddMax = 1;
        int evenMax = s.length();

        for(int val: map) {
            if(val == 0) continue;
            if(val % 2 == 0) {
                evenMax = Math.min(evenMax, val);
            } else {
                oddMax = Math.max(oddMax, val);
            }
        }

        return oddMax - evenMax;

    }
}