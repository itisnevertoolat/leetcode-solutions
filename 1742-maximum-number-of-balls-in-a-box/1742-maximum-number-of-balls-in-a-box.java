class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int n = (highLimit-lowLimit) + 1;
        int[] arr = new int[1000000];
        
        for(int i=lowLimit;i<=highLimit;i++){
            int j = i;
            int sum = 0;
            while(j > 0){
                sum += j % 10;
                j = j / 10;
            }
            arr[sum] +=1;
        }
        int max = Integer.MIN_VALUE;
        for(int i: arr){
            max = Math.max(i, max);
        }
        return max;
        
        
    }
}