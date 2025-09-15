class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        HashSet<Character> set = new HashSet<>();

        for(Character c: brokenLetters.toCharArray()) {
            set.add(c);
        }

        int count = 0;
        boolean foundInSet = false;

        for(char c: text.toCharArray()) {

            if(c == ' ') {
                if(foundInSet) {
                    foundInSet = false;
                } else {
                    count++;
                }
                continue;
            }

            if(set.contains(c)) {
                foundInSet = true;
            }

        }

        if(!foundInSet) {
            count++;
        }

        return count;

    }
}