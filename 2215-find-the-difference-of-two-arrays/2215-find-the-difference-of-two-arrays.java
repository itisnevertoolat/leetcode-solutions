class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> nums1Dis = new ArrayList<>();
        List<Integer> nums2Dis = new ArrayList<>();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(int n: nums1){
            set1.add(n);
        }
        for(int n: nums2){
            set2.add(n);
        }

        for(int i: set1){
            if(!set2.contains(i)) nums1Dis.add(i);

        }
        for(int i: set2){
            if(!set1.contains(i)) nums2Dis.add(i);

        }
        answer.add(nums1Dis);
        answer.add(nums2Dis);

        return answer;
        
    }
}