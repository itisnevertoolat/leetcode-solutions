class Solution {
    public int maxProductDifference(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int product1 = nums[0] * nums[1];
        int product2 = nums[nums.length-1] * nums[nums.length-2];
        // for(int i=1;i<nums.length;i++){
        //     if(count==1) break;
        //     if(nums[i] != product1){
        //         count++;
        //         product1 *= nums[i];
        //     }
        // }
        // count = 0;
        // for(int i=nums.length-2;i>=0;i--){
        //     if(count==1) break;
        //     if(nums[i] != product2){
        //         count++;
        //         product2 *= nums[i];
        //     }
        // }
        // System.out.println(product2);
        // System.out.println(product1);
        return product2 - product1;
    }
}