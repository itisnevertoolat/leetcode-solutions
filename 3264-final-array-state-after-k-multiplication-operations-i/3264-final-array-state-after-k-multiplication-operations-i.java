class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] res = new int[nums.length];
        PriorityQueue<int[]> pq = new PriorityQueue<>(new CustomComparator());
         for(int x=0;x<nums.length;x++)
            pq.add(new int[]{nums[x], x});
        while(k-- >= 1){
            int[] num = pq.poll();
            int multiNum = num[0] * multiplier;
            pq.add(new int[]{multiNum, num[1]});
            nums[num[1]] = multiNum;
            
        }
        
        return nums;
    }
}

class CustomComparator implements Comparator<int[]>{
             
        public int compare(int[] arr1, int[] arr2) {
            if ( arr1[0]> arr2[0])
                return 1;
            else if (arr1[0] < arr2[0])
                return -1;
            return arr1[1] - arr2[1];
            }
}