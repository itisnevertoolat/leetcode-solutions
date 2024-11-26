class Solution {
    public String removeDigit(String number, char digit) {
        StringBuilder sb = new StringBuilder(number);
        sb.append("-");
        int idx = 0;
        for(int i=0;i<number.length();i++){
            char c = sb.charAt(i) ,  s = sb.charAt(i+1);
            if(c == digit){
                idx = i;
                if(c < s || i==number.length()-1){
                    if(i==0)
                        return number.substring(i+1, number.length());
                    if(i==number.length()-1)
                        return number.substring(0, number.length()-1);
                     return number.substring(0, i) + number.substring(i+1, number.length());
                }

                    
                    
            }
           
        }
    return number.substring(0, idx) + number.substring(idx+1, number.length());
    }
    
}