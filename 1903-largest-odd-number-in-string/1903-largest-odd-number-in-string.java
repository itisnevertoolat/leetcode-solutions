class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length() - 1;i>=0;i--){
            if(num.charAt(i) % 2 != 0)
                return num.substring(0, i+1);
        }
        return "";
        // String res="";
        // int x = 0;
        // StringBuilder sb = new StringBuilder();
        // for(char c: num.toCharArray()){
        //     sb.append(c);
        //     x =x * 10 + c;
        //     if(x % 2 != 0)
        //         res = sb.toString();
        // }
        // return res;
    }
}