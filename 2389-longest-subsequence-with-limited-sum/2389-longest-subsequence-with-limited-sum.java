class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int m = queries.length;
        int n = nums.length;
        Arrays.sort(nums);
        int[] sum = new int[n];
        sum[0] = nums[0];
        for(int i=1;i<n;i++) sum[i] = sum[i-1] + nums[i];
        int[] ans = new int[m];

        for(int i=0;i<m;i++){
            int start = 0;
            int end = n-1;
            int idx = 0;
            while(start <= end){
                int mid = (start + end) >>>1;
                if (queries[i] - sum[mid] < 0){
                    end = mid - 1;
                }else start = mid+1;
                idx=end;
        }
            ans[i] = idx+1;
            
        }

        return ans;
    }
}