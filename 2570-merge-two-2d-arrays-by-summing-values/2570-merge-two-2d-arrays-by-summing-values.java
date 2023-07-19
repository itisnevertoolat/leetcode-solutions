class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int i =0;
        for(int[] arr: nums1){
            map.put(arr[0], map.getOrDefault(arr[0], 0)+arr[1]);
        }
        for(int[] arr: nums2){
            map.put(arr[0], map.getOrDefault(arr[0], 0)+arr[1]);
        }
        int[] arr2 = new int[map.size()];
        for(int k: map.keySet()){
            arr2[i++] = k;
            
        }
        int[][] res = new int[map.size()][2];
        i =0;
        Arrays.sort(arr2);
        for(int k: arr2){
            res[i++] = new int[]{k, map.get(k)};
        }
            
        return res;
    }
}