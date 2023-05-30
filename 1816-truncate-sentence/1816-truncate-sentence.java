class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<k-1;i++){
            res.append(arr[i]+" ");
        }
        res.append(arr[k-1]);
        return res.toString();
    }
}