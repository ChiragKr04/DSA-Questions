class Solution {
    public int maxFreqSum(String s) {

        HashMap<Character, Integer> vow = new HashMap<>();
        HashMap<Character, Integer> con = new HashMap<>();

        for (char c : s.toCharArray()) {

            if (isVowel(c)) {
                vow.put(c, vow.getOrDefault(c, 0) + 1);
            } else {
                con.put(c, con.getOrDefault(c, 0) + 1);
            }

        }

        Integer vmax = 0;
        Integer cmax = 0;

        for (Character key : vow.keySet()) {
            vmax = Math.max(vmax, vow.get(key));
        }

        for (Character key : con.keySet()) {
            cmax = Math.max(cmax, con.get(key));
        }

        return vmax + cmax;

    }

    public boolean isVowel(char c) {

        switch (c) {
            case 'a', 'e', 'i', 'o', 'u':
                return true;
        }

        return false;

    }

}