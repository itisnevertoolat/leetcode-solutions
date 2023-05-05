class Solution {
    public static boolean checkVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' | ch == 'o' || ch == 'u');
    }
    public int maxVowels(String s, int k) {
        int max;
        int count=0;
        for(int i = 0; i < k; i++) {
            if(checkVowel(s.charAt(i))) count++;
        }
        max = count;
        for(int i=k;i< s.length();i++){
            if(checkVowel(s.charAt(i)))count++;
            if(checkVowel(s.charAt(i-k)))count--;
            max = Math.max(count, max);
    }
        
    return max;
}
}