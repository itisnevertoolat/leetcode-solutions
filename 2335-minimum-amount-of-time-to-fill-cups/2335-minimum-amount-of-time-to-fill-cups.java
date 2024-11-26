class Solution {
    public int fillCups(int[] amount) {
         PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i: amount)
            pq.add(i);
        int res = 0;
        while(!pq.isEmpty()){
           int topNum = pq.poll(), secondNum = pq.poll();
            if(topNum == 0)
                return res;
            topNum--;
            secondNum--;
            pq.add(topNum);
            pq.add(secondNum);
            res++;
        }
        return res;
    }
}