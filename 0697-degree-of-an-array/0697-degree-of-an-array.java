class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i: nums){
            int x = map.getOrDefault(i, 0) + 1;
            map.put(i, x);
            if(x > max)
                max = x;
            
        }
        for(int i: map.keySet()){
            if(map.get(i) == max)
                list.add(i);
        }
        int min = Integer.MAX_VALUE;
        for(int num: list){
            int start = 0;
            int end = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i] == num){
                    start = i;
                    break;
                }

            }
            for(int i=nums.length - 1;i > 0;i--){
                if(nums[i] == num){
                    end = i;
                    break;
                }

            }
            min = Math.min(end - start, min);
            
        }

        return min +  1;
        
        
    }
}