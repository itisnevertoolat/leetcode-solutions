class Solution {
    public int[] resultArray(int[] nums) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.add(nums[0]);
        s2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            int x = s1.peek(), y = s2.peek();
            if(x > y)
                s1.add(nums[i]);
            else
                s2.add(nums[i]);
        }
        int[] res = new int[nums.length];
        int n1 = s1.size();
        int n2 = s2.size();
        for(int i= 0;i < n1;i++){
            res[n1 - (i+1)]  = s1.pop();
        }
        for(int i= 0;i < n2;i++){
            res[(nums.length - 1)  - i]  = s2.pop();
        }
        return res;
        
    }
}