class Solution {
    public boolean halvesAreAlike(String s) {
        int firstHalf = 0;
        int secondHalf = 0;
        String vowels = "aeiouAEIOU";
        for(int i=0;i<s.length()/2;i++){
            if(vowels.contains(s.charAt(i)+"")) firstHalf++;
        }
        for(int i=s.length()/2;i<s.length();i++){
            if(vowels.contains(s.charAt(i)+"")) secondHalf++;
        }
        return firstHalf == secondHalf;
    }
}