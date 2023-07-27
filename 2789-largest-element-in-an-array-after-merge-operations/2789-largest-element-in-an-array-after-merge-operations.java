class Solution {
    public long maxArrayValue(int[] arr) {
        long sum = 0L;
            
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] <= sum)
                sum += arr[i];
            else
                sum = arr[i];
        }
        return sum;
        
        
    }
}



// class Solution {
//     public long maxArrayValue(int[] arr) {
//         int end = arr.length - 1;
//         int bEnd = arr.length - 2;
//         long sum = 0L;
//         long[] arr2 = new long[arr.length];
//         for(int i=0;i<arr.length;i++)
//             arr2[i] = (long) arr[i];
            
//         for(int i=0;i< arr2.length-1;i++){
//             if(arr2[end] >= arr2[bEnd]){
//                 sum = arr2[end] + arr2[bEnd];
//                 arr2[bEnd] = sum;
//             }
//             else
//                 sum = 0;

//             end--;
//             bEnd--;
//                     }
//         Arrays.sort(arr2);
//         return arr2[arr2.length-1];
        
        
//     }
// }