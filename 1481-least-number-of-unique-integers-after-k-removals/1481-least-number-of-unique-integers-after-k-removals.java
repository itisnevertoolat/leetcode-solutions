class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> elements = new ArrayList<>(map.entrySet());

        elements.sort((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : elements) {
            if (entry.getValue() <= k) {
                k -= entry.getValue();
                map.remove(entry.getKey());
            } else {
                break;
            }
        }
        return map.size();
    }
}


// class Solution {
//     public int findLeastNumOfUniqueInts(int[] arr, int k) {
//         Map<Integer, Integer> map = new HashMap<>();
//         List<Integer> list  = new ArrayList<>();
//          for(int i: arr)
//              map.put(i, map.getOrDefault(i, 0)+1);
//         for(Integer key : map.keySet())
//             list.add(map.get(key));
//         Collections.sort(list);
//         while(k > 0){
//             k -=list.get(0);
//             if(k >= 0)
//                 list.remove(0);
            
//         }
//         return list.size();
        
        
//     }
// }