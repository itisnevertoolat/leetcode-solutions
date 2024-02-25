class Solution {
    public int[] decrypt(int[] arr, int k) {
        if(k == 0){
            for(int i=0;i<arr.length;i++)
                arr[i] = 0;
            return arr;
        }
        
        int[] res = new int[arr.length];
        int sum = 0;
        if(k > 0){
            for(int i=0;i<k;i++)
                sum += arr[i];
            int currentIdx = k;
            for(int i=0;i<arr.length;i++){

                if(currentIdx >= k){
                    sum -= arr[i];
                    int idx = currentIdx % arr.length;
                    sum += arr[idx];
                }
                currentIdx++;



                res[i] = sum;
            }

        }else{
            
            int currentIdx = 0;
            for(int i=0;i<Math.abs(k);i++){
                currentIdx = (arr.length - 1) - i;
                sum += arr[currentIdx];
            }
            res[0] = sum;
            int startIdx = 0;
            for(int i=1;i<arr.length;i++){
                startIdx = i - 1;

                currentIdx = (arr.length + currentIdx) % arr.length;
                sum +=  arr[startIdx];
                sum -= arr[currentIdx++];
                res[i] = sum;

            }
        }
        return res;
    }
}