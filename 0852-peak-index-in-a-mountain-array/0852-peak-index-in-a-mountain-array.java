class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int prev = arr[0];
        int res = 0;
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) >>1;
            if(arr[mid+1] > arr[mid])
                left = mid + 1;
            else if(arr[mid+1] < arr[mid])
                right = mid - 1;
        }

        return left;
    }
}