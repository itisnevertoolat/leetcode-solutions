class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        int idx=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(new CustomComparator());
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i+1 == k){
                int res = 0;
                map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
                for(Map.Entry<Integer, Integer> entry : map.entrySet())
                    pq.add(new int[]{entry.getKey(), map.get(entry.getKey())});
                int y = 0;
                while(!pq.isEmpty() && y++ < x){
                    int[] arr = pq.poll();
                    
                    res += arr[0] * arr[1];
                
                }
                list.add(res);
            } 
            else if(i+1 > k){
                int res = 0;
                
                 map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
                map.put(nums[idx], map.get(nums[idx]) -1);
                pq = new PriorityQueue<>(new CustomComparator());
                for(Map.Entry<Integer, Integer> entry : map.entrySet())
                    pq.add(new int[]{entry.getKey(), map.get(entry.getKey())});
                
                
                idx++;
                int y = 0;
                
                while(!pq.isEmpty() && y++ < x){
                    
                    int[] arr = pq.poll();
                    res += arr[0] * arr[1];
                
                }
                list.add(res);
               
            }else
                map.put(nums[i], map.getOrDefault(nums[i], 0) +1);

           
        
            
        }
        int[] res = new int[list.size()];
        int count = 0;
        for(int i: list)
            res[count++] = i;
        return res;
    }
}
class CustomComparator implements Comparator<int[]>{
        public int compare(int[] arr1, int[] arr2) {
            if ( arr1[1] < arr2[1])
                return 1;
            else if (arr1[1] > arr2[1])
                return -1;
            return arr2[0] - arr1[0];
        }

}