class Solution {
    public boolean checkZeroOnes(String s) {
        int zeroCount = 0;
        int oneCount = 0;
        int maxZero = Integer.MIN_VALUE, maxOne = Integer.MIN_VALUE;
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
                    maxOne = Math.max(maxOne, oneCount);
                    prev = s.charAt(i);
                    zeroCount = 1;
                    oneCount = 0;
                    
                }
                    
                else{
                    maxZero = Math.max(maxZero, zeroCount);
                    prev = s.charAt(i);
                    zeroCount = 0;
                    oneCount = 1;
                }
                    
        }
        maxOne = Math.max(maxOne, oneCount);
        maxZero = Math.max(maxZero, zeroCount);
        return maxZero < maxOne;
        
    }
}