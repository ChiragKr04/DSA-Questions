class Solution {
    public boolean isAnagram(String s, String t) {
        
        
        if(s.length() != t.length()){
            return false;
        }
        
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        
        HashMap<Character , Integer> m1 = new HashMap<Character , Integer>();
        HashMap<Character , Integer> m2 = new HashMap<Character , Integer>();
        
        
        for(int i=0;i<s.length();i++){
            
            if(m1.containsKey(s1[i])){
                m1.put(s1[i],m1.get(s1[i])+1);
            }else{
                m1.put(s1[i],1);
            }
            
            if(m2.containsKey(t1[i])){
                m2.put(t1[i],m2.get(t1[i])+1);
            }else{
                m2.put(t1[i],1);
            }
            
        }

        
        // Checking for hashmap equality
        
        for(int i=0;i<s.length();i++){
            
            if(!m1.get(s1[i]).equals(m2.get(s1[i]))){
                return false;
            }
            
        }
        
        return true;
        
    }
}