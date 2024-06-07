class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String , Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer> > pq 
            = new PriorityQueue<>((a,b) ->{
            return a.getValue() == b.getValue() ? 
                a.getKey().compareTo(b.getKey()) : Integer.compare(b.getValue(),a.getValue());
        });
        List<String> res = new ArrayList<>();
        
        for(String s: words){
            int x = map.getOrDefault(s, 0)+1;
            map.put(s, x);
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            pq.add(entry);
                    
        }
        while(k-- > 0)
            res.add(pq.poll().getKey());
        return res;
        
    }
}