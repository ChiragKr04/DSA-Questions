class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        
        gridLen = len(grid)
        landLen = len(grid[0])
        count = 0
        peri = 0
        
        for i in range(gridLen):
            for j in range(landLen):
                
                if grid[i][j] == 1:
                    
                    peri = 4
                    
                    # if land above -2
                    # (-1 for above land)
                    # (-1 again for current land coz connected)
                    if 0 <= i-1 and grid[i-1][j] == 1:
                        peri -= 2
                        
                    # if land on left -2
                    # (-1 for edge connected land)
                    # (-1 again for current land connected to left land)
                    if j-1 >= 0 and grid[i][j-1]:
                        peri -= 2
                        
                    count += peri
                    
        return count
                        
                    
                    
                    