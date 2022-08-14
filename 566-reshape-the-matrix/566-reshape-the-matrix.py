class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        
        res = []
        flat = []
        
        for arr in mat:
            for num in arr:
                flat.append(num)
                
        
        if r * c != len(flat):
            return mat
        
        for row in range(r):
            res.append(flat[row * c : row * c + c])
                
            
        return res
                
        
        
        
        