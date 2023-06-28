class Solution {
    public boolean halvesAreAlike(String s) {
        int res = 0;
        int n = s.length();
        for(int i=0;i<n/2;i++){
            char b = Character.toLowerCase(s.charAt(i));
            char c = Character.toLowerCase(s.charAt((n-i)-1));
            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u') res++;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') res--;

        }
        return res == 0;
    }
}