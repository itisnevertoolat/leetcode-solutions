class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        Stack<Integer> odd = new Stack<>();
        Stack<Integer> even = new Stack<>();
        for(int i: nums){
            if(i % 2 == 0)
                even.push(i);
            else
                odd.push(i);
        }
        for(int i=0;i<nums.length;i++){
            if(i%2 == 0)
                nums[i] = even.pop();
            else
                nums[i] = odd.pop();
        }
        return nums;
    }
}