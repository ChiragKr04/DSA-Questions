class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        i = 0
        curr = 0
        while curr <= n:
            curr = 4 ** i
            if curr == n:
                return True
            i += 1
        return False