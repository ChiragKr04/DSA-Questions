class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        
        i = 0
        curr = 0
        while curr <= n:
            curr = 3 ** i
            if curr == n:
                return True
            i += 1
        return False
        
        