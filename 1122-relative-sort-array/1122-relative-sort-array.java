class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int[] res = new int[arr1.length];
        int count = 0;
        for(int i: arr2)
            map.put(i, 1);
        
        for(int i: arr1){
            int x = map.getOrDefault(i, 0);
            if(x == 0)
                list.add(i);
            else
                map.put(i, x+1);
        }
            
        for(int i: arr2){
            for(int j=1;j<map.get(i);j++)
                res[count++] = i;    
        }
        Collections.sort(list);
        for(int i: list)
            res[count++] = i;
            
        
        return res;
    }
}