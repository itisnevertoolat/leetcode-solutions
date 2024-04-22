class Solution {
    public boolean isMonotonic(int[] nums) {
        int idx = 0;
        boolean inc = true;
        for(;idx<nums.length - 1;idx++){
            if(nums[idx] > nums[idx+1]){
                inc = false;
                break;
            }
            else if(nums[idx] < nums[idx+1])
                break;
        }
        for(;idx<nums.length-1;idx++){
            boolean x = nums[idx] < nums[idx+1];
            
            if(nums[idx] > nums[idx+1]){
                if(inc)
                    return false;
            }

            
            else if(nums[idx] < nums[idx+1]){
                if(inc==false)
                    return false;
            }   
        }
            return true;
        }
        
    }