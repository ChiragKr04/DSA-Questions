class Solution:
    def fib(self, n: int) -> int:
        
        def f(n,map):
            
            if n in map:
                return map[n]
            
            if n <= 1:
                return n
            
            val = f(n-1,map) + f(n-2,map)
            map[n] = val
            return val
            
        return f(n,dict())
        