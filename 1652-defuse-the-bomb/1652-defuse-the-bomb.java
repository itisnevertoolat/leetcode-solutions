class Solution {
    public int[] decrypt(int[] arr, int k) {
        if(k == 0){
            for(int i=0;i<arr.length;i++)
                arr[i] = 0;
            return arr;
        }
        int[] res = new int[arr.length];
        
        if(k > 0){
            for(int i=0;i<arr.length;i++){
                int sum = 0;

                for(int j=i+1;j<i+(k+1);j++){
                    int idx = j % arr.length;
                    sum += arr[idx];
                }
                res[i] = sum;
            }

        }else{
            
            for(int i=0;i<arr.length;i++){
                int sum = 0;
                for(int j=i-1;j>i-(Math.abs(k) + 1);j--){
                    int idx = (arr.length + j) % arr.length;
                    sum += arr[idx];
                }
                res[i] = sum;
            }
        }
        return res;
    }
}