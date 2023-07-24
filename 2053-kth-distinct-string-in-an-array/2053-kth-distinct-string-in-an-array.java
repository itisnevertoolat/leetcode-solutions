class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String s: arr){
            map.put(s, map.getOrDefault(s, 0)+1);
            if(map.get(s) > 1)
                list.remove(s);
            else
                list.add(s);
        }

        if(list.size() < k-1 || list.size()==0)
            return "";
        else
            return list.get(k-1);
        
    }
}