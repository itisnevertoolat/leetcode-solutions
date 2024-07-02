class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(Integer i: nums1){
            if(map.get(i) != null){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
            
            
        }

        

        for(Integer i: nums2){
            
            if(map.get(i) != null && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] arr = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++)
        {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}