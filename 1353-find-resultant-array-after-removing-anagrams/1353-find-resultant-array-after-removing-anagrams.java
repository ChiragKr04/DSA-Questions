class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> out = new ArrayList<>();
        int n = words.length;

        out.add(words[0]);

        int i=1;

        while(i < n) {

            String currentword = words[i];
            String prevword = words[i-1];
            int [] freq = new int[27];
            for(char c: currentword.toCharArray()) {
                freq[c - 'a']++;
            }

            for(char c: prevword.toCharArray()) {
                freq[c - 'a']--;
            }

            boolean bool = false;
            for(int x: freq) {
                if(x!=0) {
                    bool = true;
                }
            }
            if(bool) {
                out.add(currentword);
            }
            i++;

        }

        return out;
    }
}