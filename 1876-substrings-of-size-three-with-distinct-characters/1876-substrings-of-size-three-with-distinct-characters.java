class Solution {
    public int countGoodSubstrings(String s) {
        int fPointer = 1;
        int sPointer = 2;
        int count = 0;
        if(s.length() < 3)
            return 0;
        else{
            for(int i=0;i<s.length()-2;i++){
                if(s.charAt(i) != s.charAt(i+1) && s.charAt(i) != s.charAt(i+2) && 
                   s.charAt(i+1) != s.charAt(i+2))
                    count++;
                
            }
        }
        return count;
        
    }
}