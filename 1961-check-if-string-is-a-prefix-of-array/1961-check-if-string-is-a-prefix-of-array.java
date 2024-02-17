class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int index = 0;
        int windex = 0;
        int r = 0;

        while (index < s.length()) {

            if (r == words.length) {
                break;
            }

            if (s.charAt(index++) != words[r].charAt(windex++)) {
                return false;
            }

            if (index == s.length() && r < words.length && windex != words[r].length()) {
                return false;
            }

            if (windex == words[r].length()) {
                windex = 0;
                r++;
            }
        }
        return index == s.length();
    }
}

// class Solution {
//     public boolean isPrefixString(String s, String[] words) {
//         StringBuilder sb = new StringBuilder();
//         int count = 0;
//         while(sb.length() < s.length() && count < words.length)
//             sb.append(words[count++]);
//         if(sb.length() != s.length())
//             return false;
//         int start = 0;
//         int end = s.length() - 1;
//         while(start <= end){
//             if(s.charAt(start) != sb.charAt(start) || s.charAt(end) != sb.charAt(end))
//                 return false;
//             start++;
//             end--;
//         }
//         return true;
//     }
// }