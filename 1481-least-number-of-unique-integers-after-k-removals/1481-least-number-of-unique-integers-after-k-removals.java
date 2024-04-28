class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list  = new ArrayList<>();
         for(int i: arr)
             map.put(i, map.getOrDefault(i, 0)+1);
        for(Integer key : map.keySet())
            list.add(map.get(key));
        Collections.sort(list);
        while(k-- > 0){
            if(list.get(0) == 1)
                list.remove(0);
            else
                list.set(0 , list.get(0) -1);
            
        }
        return list.size();
        
        
    }
}