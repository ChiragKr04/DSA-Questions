class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        
        map = {}
        
        for val in arr:
            
            if val in map:
                
                map[val] = map[val] + 1
            else:
                
                map[val] = 1
                
        map2 = map.values()
        temp = {}
        
        for val in map2:
            
            if val in temp:
                return False
            
            else:
                temp[val] = 1
        
        return True
        
        
        