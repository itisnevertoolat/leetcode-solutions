class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        if(nums.length == k)
            return nums;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> (a[0]-b[0]));
        for(int i=0;i<nums.length;i++){
            pq.offer(new int[]{nums[i], i});
            if(pq.size() > k)
                pq.poll();
        }
        PriorityQueue<int[]> pq2 = new PriorityQueue<>((a,b)-> (a[1]-b[1]));
        while(!pq.isEmpty())
            pq2.offer(pq.poll());
        int[] res = new int[k];
        int i= 0;
        while(!pq2.isEmpty())
            res[i++] = pq2.poll()[0];
        return res;
    }
}