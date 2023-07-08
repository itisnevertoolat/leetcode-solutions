class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b)->a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        int[] ones = new int[mat.length];
        int[] ans = new int[k];
        for(int i=0;i<mat.length;i++){
            int start = 0;
            int end = mat[i].length-1;
            while(start <= end){
                int mid = (start +end) >>>1;
                if(mat[i][mid]==0) end = mid -1;
                else start = mid+1;
            }
            queue.add(new int[]{end+1,i});

        }
        for(int i = 0; i < k; i++)  ans[i] = queue.remove()[1];
        return ans;
    }
}