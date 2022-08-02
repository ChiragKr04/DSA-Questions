class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        Iterator<Integer> itr = pq.iterator();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                pq.add(matrix[i][j]);
            }
        }
        
        int ct = 1;
        while(itr.hasNext() && ct < k){
            pq.poll();
            ct++;
        }
        
        return pq.peek();
        
    }
}
