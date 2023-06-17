class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder s = new StringBuilder();
        int idx = 0;
        for(int i=0;i< num.length();i++){
            if(num.charAt(i) != '0') idx=i;
            
        }
        for(int i=0;i<=idx;i++){
            s.append(num.charAt(i));
            
        }
        
        return s.toString();
    }
}

// class Solution {
//     public String removeTrailingZeros(String num) {
//         StringBuilder s = new StringBuilder();
//         for(int i=num.length()-1;i>=0;i--){
//             if(s.length() == 0 && num.charAt(i) == '0') continue;
//             else s.append(num.charAt(i));
//         }
//         s.reverse();
//         return s.toString();
//     }
// }