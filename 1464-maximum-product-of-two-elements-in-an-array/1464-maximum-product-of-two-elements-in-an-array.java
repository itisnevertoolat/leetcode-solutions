class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i< nums.length;i++){
            queue.add(nums[i]);
        }
        int fmax = queue.poll() - 1;
        int smax = queue.poll() - 1;
        return fmax * smax;
    }
}

