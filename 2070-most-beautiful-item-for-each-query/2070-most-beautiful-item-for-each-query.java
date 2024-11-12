class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] arr : items){
            int x = arr[0];
            int y = arr[1];
            map.put(x, map.get(x) != null ? map.get(x) < y ? y : map.get(x) : y);
        }
        HashMap<Integer, Integer> temp
            = map.entrySet()
                  .stream()
                  .sorted((i1, i2)
                              -> i2.getValue().compareTo(
                                  i1.getValue()))
                  .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) -> e1, LinkedHashMap::new));
        int[] res = new int[queries.length];
        int count = 0;
        
        for(int i=0;i<queries.length;i++){
            int val = 0;
            for(Map.Entry<Integer, Integer> entry: temp.entrySet()){
                if(entry.getKey() <= queries[i]){
                     val  = entry.getValue();
                    break;
            }
           
                
            }
             res[count++] = val;
            
        
        
    }
        return res;
    }
}