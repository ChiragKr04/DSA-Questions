class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        out = []   
        i = 0    
        if numRows == 1: return [[1]]
        if numRows == 2: return [[1], [1,1]]
        while i < numRows:     
            if i == 0:
                out.append([1])
                i+=1
                continue
            if i == 1:
                out.append([1,1])
                i+=1
                continue    
            arr = out[i-1]
            out.append([1])
            l = 0
            r = 1
            while r < len(arr):
                out[i].append(arr[l]+arr[r])
                l+=1
                r+=1
    
            out[i].append(1)
            i+=1

        return out
                
                
            
            
        
        
        
        
        
        
        
        
        