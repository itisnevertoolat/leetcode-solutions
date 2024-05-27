class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<=nums.length;i++){
            int start = 0;
            int end = nums.length-1;
            while(start <= end){
                int mid = (start + end) >>> 1;
                if(nums[mid] >= i)
                    end = mid - 1;
                else
                    start = mid + 1;
                
            }
            if((nums.length)-start == i)
                return i;
        }
        return -1;
        
    }
}