class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int prev = arr[0];
        int res = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > prev){
                prev = arr[i];
                res = i;
            }
        }
        return res;
    }
}