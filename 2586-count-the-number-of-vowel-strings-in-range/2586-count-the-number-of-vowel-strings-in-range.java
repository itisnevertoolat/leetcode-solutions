class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String s = "aeiou";
        int res = 0;
        for(int i=left;i<=right;i++){
            String x = words[i];
            if(s.contains(x.charAt(0)+"") && s.contains((x.charAt(x.length()-1)+""))) res++;
        }
               return res;
    }
}