class Solution {
    public double trimMean(int[] x) {
        int len = (x.length * 5) / 100;
        int sum = 0;
        Arrays.sort(x);
        for(int i=len;i<x.length - len;i++){
            sum += x[i];
        }
       return sum / (x.length - (len*2.0));
        
    }
}