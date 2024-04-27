class Solution {
    public long pickGifts(int[] gifts, int k) {
        long res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: gifts)
            pq.add(i);
        while(k-- > 0){
            int x = (int) Math.sqrt(pq.poll());
            pq.add(x);
            
        }
        for(int i: pq)
            res += i;
        return res;
        
    }
}