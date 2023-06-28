class Solution {
    public boolean halvesAreAlike(String s) {
        int res = 0;
        String vowels = "aeiouAEIOU";
        for(int i=0;i<s.length()/2;i++){
            if(vowels.contains(s.charAt(i)+"")) res++;
            if(vowels.contains(s.charAt((s.length()-i)-1)+"")) res--;

        }
        return res == 0;
    }
}