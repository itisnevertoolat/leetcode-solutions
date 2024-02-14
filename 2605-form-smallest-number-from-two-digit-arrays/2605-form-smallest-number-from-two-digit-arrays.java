class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i: nums1)
            map.put(i, map.getOrDefault(i, 0)+1);
        for(int i: nums2){
            int x = map.getOrDefault(i, 0)+1;
            if( x== 2)
                return i;
            map.put(i, x);
        }

        
        sb.append(Math.min(nums1[0], nums2[0]));
        sb.append(Math.max(nums1[0], nums2[0]));
            
        return Integer.parseInt(sb.toString());
    }
}