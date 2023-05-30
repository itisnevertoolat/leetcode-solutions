// class Solution {
//     public String truncateSentence(String s, int k) {
//         String[] arr = s.split(" ");
//         StringBuilder res=new StringBuilder();
//         for(int i=0;i<k-1;i++){
//             res.append(arr[i]+" ");
//         }
//         res.append(arr[k-1]);
//         return res.toString();
//     }
// }

class Solution {
    public String truncateSentence(String s, int k) {
        int track=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' ') track++;
            if(track==k) break;
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}