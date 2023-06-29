class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        if(n % 2 != 0){
            for(int i=0;i < n-1;i +=2){
                res[i]= n - i;
                res[i+1] = (n - i)*-1;
            }
         res[res.length-1]=0;   
        }
        else{
            for(int i=0;i < n-1;i +=2){
                res[i]= n - i;
                res[i+1] = (n - i)*-1;
            }
        }
        return res;
    }
}