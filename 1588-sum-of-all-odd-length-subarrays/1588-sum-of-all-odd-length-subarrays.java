class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res = 0;
        for(int i=0;i<arr.length;i++){
            res += arr[i];
            int sum = arr[i];
            int len = 1;
            for(int j=i+1;j<arr.length;j++){
                sum += arr[j];
                len++;
                if(len % 2 != 0) {
                    res += sum;
                }
            }


        }
        return res;
    }
}