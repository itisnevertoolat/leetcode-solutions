class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> res =new ArrayList<>();
        for(int[] i: items1){
            map.put(i[0], i[1]);
        }
        for(int[] i: items2){
            if(map.containsKey(i[0])) map.put(i[0], map.get(i[0])+i[1]);
            else  map.put(i[0], i[1]);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            res.add(new ArrayList<>(){{
                add(entry.getKey());
                add(entry.getValue());
            }});
        }
        Collections.sort(res, new Comparator<List<Integer>>(){
            @Override
            public int compare(List<Integer> o1, List<Integer> o2){
                return o1.get(0).compareTo(o2.get(0));
            }
        });
        return res;
    }
}