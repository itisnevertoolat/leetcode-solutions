class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i: nums1)
            map.put(i, map.getOrDefault(i, 0)+1);
        for(int i: nums2)
            map.put(i, map.getOrDefault(i, 0)+1);
        for(int i=1;i<=9;i++){
            if(map.containsKey(i) && map.get(i) == 2)
                return i;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        sb.append(Math.min(nums1[0], nums2[0]));
        sb.append(Math.max(nums1[0], nums2[0]));
            
        return Integer.parseInt(sb.toString());
    }
}