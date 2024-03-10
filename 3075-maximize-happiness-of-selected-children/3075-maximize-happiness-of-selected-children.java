class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int count = 0;
        long res = 0;
        int size = happiness.length - 1;
        int sum = 0;
        for(int i=0;i<k; i++){
            sum = happiness[size-i] - count++;
            if(sum <= 0)
                return res;
            res += sum;
            
        }
        return res;
        
    }
}