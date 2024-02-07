class Solution {
    public String oddString(String[] words) {
        Map<String, List<Integer>> map = new HashMap<>();
        Map<List<Integer>, Integer> map2 = new HashMap<>();
        List<Integer> target = new ArrayList<>();
        for(String s: words){
            List<Integer> list = new ArrayList<>();
            for(int i=1;i<s.length();i++)
                list.add(s.charAt(i) - s.charAt(i-1));
            map.put(s, list);
            map2.put(list,  map2.getOrDefault(list, 0)+1);
        }
           
        
        for(Map.Entry<List<Integer>, Integer> entry: map2.entrySet()){
            if(entry.getValue() == 1){
                target = entry.getKey();
                break;
            }
        }
        for(Map.Entry<String, List<Integer>> entry: map.entrySet()){
            if(entry.getValue().equals(target))
                return entry.getKey();
        }
         return "";
    }
}