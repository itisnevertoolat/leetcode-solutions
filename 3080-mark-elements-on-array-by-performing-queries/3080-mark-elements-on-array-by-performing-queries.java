class Solution {
    private long sum(int nums[], int[] q,  PriorityQueue<int[]> data , long sum, HashSet<Integer> marked){
        if(sum == 0)    return 0;
       
        int k = q[1];
        if(nums[q[0]]>0)
            sum-=nums[q[0]];
        marked.add(q[0]);
        
        nums[q[0]] = -1;
        
      
       
        int i=0;
        while(i<k && data.size()>0){
            i++;
            int[] temp = data.poll();
            if(marked.contains(temp[1])) {i--;continue;}
            sum-=temp[0];
            nums[temp[1]] = -1;
            marked.add(temp[1]);
            
        }
        
      
        return sum;
    }
    
    
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        long[] ans = new long[queries.length];
        PriorityQueue<int[]> data = new PriorityQueue<>((a, b)->{
            if(a[0]-b[0] == 0)  return a[1]-b[1];
                
            return a[0]-b[0];
 });
        
        
        long s = 0;
        HashSet<Integer> marked = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
             s+=nums[i];
            data.add(new int[]{nums[i], i});
        }
        
        for(int i=0;i<queries.length;i++){
            
            
            ans[i] = sum(nums, queries[i], data, s, marked);
            if(ans[i]<0)    ans[i]=0;
            s = ans[i];
            
        }
        return ans;
    }
}