class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] res = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i: nums)
            pq.add(i);
        while(k-- >= 1){
            int num = pq.poll();
            int multiNum = num * multiplier;
            pq.add(multiNum);
            for(int x=0;x<nums.length;x++){
                if(nums[x] == num){
                    nums[x] = multiNum;
                    break;
                }
            }
            
        }
        
        return nums;
    }
}