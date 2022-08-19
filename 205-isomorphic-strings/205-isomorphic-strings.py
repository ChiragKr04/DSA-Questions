class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        ms = dict()
        mt = dict()
        
        for sword, tword in zip(s,t):
            
            if (sword not in ms) and (tword not in mt):
                ms[sword] = tword
                mt[tword] = sword
        
            elif ms.get(sword) != tword or mt.get(tword) != sword:
                return False
            
        return True