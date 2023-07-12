class Solution {
    public int percentageLetter(String s, char letter) {
        double res = 0.0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == letter) res++;
        }
        return (int)((res/(double)s.length())*100);
        
    }
}