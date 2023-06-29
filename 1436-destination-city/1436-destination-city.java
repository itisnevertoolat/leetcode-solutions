class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<paths.size();i++){
            String y = paths.get(i).get(1);
            map.put(y, map.getOrDefault(y, 0)+1);

        }

        for(int i=0;i<paths.size();i++){
            String x = paths.get(i).get(0);
            map.computeIfPresent(x, (key, value) -> value+1);

        }
        for(Map.Entry m: map.entrySet()){
            if((int)m.getValue() == 1) return (String) m.getKey();
        }
        return "";
    }
}