import java.util.Map.Entry; 
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int i: nums1){
            int start = 0;
            int end = nums2.length - 1;
            while(start <= end){
                int mid = (start + end) >>> 1;
                if(nums2[mid] == i)
                    return i;
                else if(nums2[mid] < i)
                    start = mid + 1;
                else
                    end = mid - 1;
            }

        }
        
        return -1;
        
    }
}