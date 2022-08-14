class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        
        for row in range(len(matrix)):
            l = 0
            r = len(matrix[0]) - 1
            
            if matrix[row][l] > target:
                return False
            if matrix[row][r] < target:
                continue
            
            while l <= r:
                mid = int((l + r) / 2)
                if matrix[row][mid] == target:
                    return True
                else:
                    if matrix[row][mid] > target:
                        r = mid - 1
                    else:
                        l = mid + 1
        return False
        
        
        
        
        
        
        