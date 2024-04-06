class Solution {
    public boolean checkOnesSegment(String s) {
         int zeroCount = 0;
        int oneCount = 0;
        int maxOne = 0;
        char prev = s.charAt(0);
        if(prev == '1')
            oneCount++;
        else
            zeroCount++;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == prev)
                if(prev == '1')
                    oneCount++;
                else
                    zeroCount++;
            else
                if(prev == '1'){
                    maxOne++;
                    if(maxOne > 1)
                        return false;
                    prev = s.charAt(i);
                    zeroCount = 1;
                    oneCount = 0;
                    
                }
                    
                else{
                    prev = s.charAt(i);
                    zeroCount = 0;
                    oneCount = 1;
                }
                    
        }
        if(s.charAt(s.length()-1)=='1')
            maxOne++;
        return maxOne ==1;
        
    }
}