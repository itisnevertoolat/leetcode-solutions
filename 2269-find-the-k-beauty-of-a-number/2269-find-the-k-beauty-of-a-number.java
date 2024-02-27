class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int num2 = 0;
        for(int i=0;i<k;i++){
            num2 += (s.charAt(i)-'0') * Math.pow(10, (k-1)-i);
        }
        count += num2 != 0  &&  num % num2 == 0 ? 1: 0;
        int sIndex = k;
        for(int i=1;i<s.length() - (k -1);i++){
            num2 %= Math.pow(10,(k-1));
            num2 *= 10 ;
            num2 += (s.charAt(sIndex++)-'0');
            count += num2 != 0  &&  num % num2 == 0 ? 1: 0;
        }
        return count;
    }
}