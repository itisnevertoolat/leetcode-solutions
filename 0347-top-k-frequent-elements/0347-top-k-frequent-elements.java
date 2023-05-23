class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) ->
            a.getValue() - b.getValue()
        );
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            pq.add(it);
            if (pq.size() > k) pq.poll();
        }
        int i = k;
        while (!pq.isEmpty()) {
            res[--i] = pq.poll().getKey();
        }
        return res;
    }
}