class Solution {
    public int minimumSum(int[] nums) {
        int max = Integer.MAX_VALUE;
        for(int i=0;i<nums.length; i++){
            for(int j=i+1;j<nums.length; j++){
                for(int k=j+1;k<nums.length; k++){
                    int x = nums[i], y = nums[j], z = nums[k];
                    if(y > x && y > z){
                        int sum = x + y + z;
                        if(sum < max)
                            max = sum;
                        }
                            }
            }
        }
        if(max == Integer.MAX_VALUE)
            return -1;
        else
            return max;
    }
}