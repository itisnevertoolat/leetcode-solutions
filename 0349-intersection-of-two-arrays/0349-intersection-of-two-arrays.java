class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> has1 = new HashSet<>();
        Set<Integer> has2 = new HashSet<>();
        int res=0;
        for(int x: nums1){
            has1.add(Integer.valueOf(x));
        }
        for(int x: nums2){
            has2.add(Integer.valueOf(x));
        }
        for(Integer x: has1){
            if(has2.contains(x)){
                res++;
            }
            
        }
        int[] vi = new int[res];
        int i=0;
        for(Integer x: has1){
            if(has2.contains(x)){
                vi[i]=x;
                i++;
            }
            
        }
        return vi;
    }
}