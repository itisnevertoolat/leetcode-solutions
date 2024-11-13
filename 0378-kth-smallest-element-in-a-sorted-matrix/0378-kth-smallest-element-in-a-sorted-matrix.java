class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int size = matrix.length;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++)
                pq.add(matrix[i][j]);
        }
        int count = 0;
        while(!pq.isEmpty()){
            int num = pq.poll();
            if(++count == k)
                return num;
        }
        return 1;
        
    }
}