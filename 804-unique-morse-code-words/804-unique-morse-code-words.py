class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        
        
        morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                 "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                 "..-","...-",".--","-..-","-.--","--.."]
        
        m = {}
        
        for word in words:
            out = []
            for s in word:
                out.append(morse[ord(s)%97])
                
            jstr = "".join(out)
            
            if jstr in m:
                
                m[jstr] = m[jstr]+1
            
            else:
                m[jstr] = 1
        
        return len(m)
                
        
        
        