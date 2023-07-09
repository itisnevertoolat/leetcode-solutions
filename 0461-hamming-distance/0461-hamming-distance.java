class Solution {
    public int hammingDistance(int x, int y) {
        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder();
        long i;
        s.append("0");
        s1.append("0");
        for (i = 1 << 30; i > 0; i = i / 2)
        {
          if((x & i) != 0) s.append("1");
          else s.append("0");
        }
        for (i = 1 << 30; i > 0; i = i / 2)
        {
          if((y & i) != 0) s1.append("1");
          else s1.append("0");
        }
        int res = 0;

        for(int k=0;k<32;k++)
          if(s.charAt(k) != s1.charAt(k)) res++;

       return res;
    }
}