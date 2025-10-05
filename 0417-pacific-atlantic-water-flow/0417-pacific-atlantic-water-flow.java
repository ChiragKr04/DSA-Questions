class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (heights == null || heights.length == 0 || heights[0].length == 0) {
            return result;
        }
        
        int m = heights.length;
        int n = heights[0].length;
        
        // Collect Pacific Ocean border cells (top row + left column)
        Queue<int[]> pacificQueue = new LinkedList<>();
        boolean[][] canReachPacific = new boolean[m][n];
        
        for (int col = 0; col < n; col++) {
            pacificQueue.offer(new int[]{0, col});
            canReachPacific[0][col] = true;
        }
        for (int row = 1; row < m; row++) {
            pacificQueue.offer(new int[]{row, 0});
            canReachPacific[row][0] = true;
        }
        
        // Collect Atlantic Ocean border cells (bottom row + right column)
        Queue<int[]> atlanticQueue = new LinkedList<>();
        boolean[][] canReachAtlantic = new boolean[m][n];
        
        for (int col = 0; col < n; col++) {
            atlanticQueue.offer(new int[]{m - 1, col});
            canReachAtlantic[m - 1][col] = true;
        }
        for (int row = 0; row < m - 1; row++) {
            atlanticQueue.offer(new int[]{row, n - 1});
            canReachAtlantic[row][n - 1] = true;
        }
        
        // BFS from Pacific
        bfs(heights, pacificQueue, canReachPacific);
        
        // BFS from Atlantic
        bfs(heights, atlanticQueue, canReachAtlantic);
        
        // Find intersection - cells that can reach BOTH oceans
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (canReachPacific[i][j] && canReachAtlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        
        return result;
    }
    
    private void bfs(int[][] heights, Queue<int[]> queue, boolean[][] visited) {
        int m = heights.length;
        int n = heights[0].length;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int currentHeight = heights[row][col];
            
            // Check all 4 neighbors
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                
                // Check bounds
                if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n) {
                    continue;
                }
                
                // Check if already visited
                if (visited[newRow][newCol]) {
                    continue;
                }
                
                int neighborHeight = heights[newRow][newCol];
                
                // Water can flow "upward" if neighbor height >= current height
                if (neighborHeight >= currentHeight) {
                    queue.offer(new int[]{newRow, newCol});
                    visited[newRow][newCol] = true;
                }
            }
        }
    }
}