class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
            res[i] = -1;
        for(int i=0;i<nums2.length;i++)
            map.put(nums2[i], i);
        for(int i=0;i<nums1.length;i++){
            for(int j=map.get(nums1[i])+1;j<nums2.length;j++){
                if(nums2[j] > nums1[i]){
                    res[i] = nums2[j];
                    break;
                }
            }
        }
        return res;
    }
} 