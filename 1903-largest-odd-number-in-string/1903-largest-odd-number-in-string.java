class Solution {
    public String largestOddNumber(String num) {
        String res="";
        int x = 0;
        StringBuilder sb = new StringBuilder();
        for(char c: num.toCharArray()){
            sb.append(c);
            x =x * 10 + c;
            if(x % 2 != 0)
                res = sb.toString();
        }
        return res;
    }
}