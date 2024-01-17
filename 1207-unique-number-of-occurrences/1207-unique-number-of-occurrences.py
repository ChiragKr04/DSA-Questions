class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        
        map = {}
        
        for val in arr:
            
            if val in map:
                
                map[val] = map[val] + 1
            else:
                
                map[val] = 1

        return len(map) == len(set(map.values()))
        
        
        