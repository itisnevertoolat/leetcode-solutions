class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int min = 0;
        int idx = 0;
        int res =0;
        while(nums[nums.length-1] > 0){
            for(int i=idx;i<nums.length;i++){
                if(nums[i] > 0){
                    min = nums[i];
                    idx = i;
                    res++;
                    break;
                }

                    
                }
            for(int i=idx;i<nums.length;i++)
                nums[i] = nums[i] -  min;
                
                

            
            
            }
        return res;
        }
    }
