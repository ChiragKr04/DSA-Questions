class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        
        
        morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                 "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                 "..-","...-",".--","-..-","-.--","--.."]
        
        m = set({})
        
        for word in words:
            out = []
            for s in word:
                out.append(morse[ord(s)%97])
                
            jstr = "".join(out)
            
            if jstr not in m:
                m.add(jstr)
        
        return len(m)
                
        
        
        