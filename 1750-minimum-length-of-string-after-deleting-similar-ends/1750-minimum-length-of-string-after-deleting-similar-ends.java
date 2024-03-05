// class Solution {
//     public int minimumLength(String s) {
//             int i = 0, j = s.length() - 1;
//             while (i < j && s.charAt(i) == s.charAt(j)) {
//                 char c = s.charAt(j);
//                 while (i <= j && s.charAt(i) == c) {
//                     ++i;
//                 }
//                 while (i <= j && s.charAt(j) == c) {
//                     --j;
//                 }
//             }
//             return j - i + 1;
//         }
// }
class Solution {
    public int minimumLength(String s) {
        int size = s.length() - 1;
        int start = 0;
        int end = size;
        while(start < end){
            char c = s.charAt(end);
            if(s.charAt(start) == s.charAt(end)){
                while(start <= end && s.charAt(start) == c)
                    ++start;
                while(start <= end && s.charAt(end) == c)
                    --end;
            }
            else
                break;
        }
        return (end - start) + 1;
    }
}