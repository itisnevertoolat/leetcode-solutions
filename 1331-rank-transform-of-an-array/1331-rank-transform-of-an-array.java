class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] copied = new int[arr.length];
        System.arraycopy(arr, 0, copied, 0, arr.length);
        Arrays.sort(copied);
        int count = 1;
        int[] res= new int[arr.length];
        for(int x: copied){
            if(map.containsKey(x))
                map.put(x, List.of(map.get(x).get(0), map.get(x).get(1) + 1));
            else
                map.put(x, List.of(count++, 1));
            
        }
        int count2 = 0;
        for(int x: arr){
            res[count2++] = map.get(x).get(0);
            map.put(x, List.of(map.get(x).get(0), map.get(x).get(1) - 1));
                
        }

        return res;
        
    }
}