class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> list = new ArrayList<>();
        int[] res = new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c)
                list.add(i);
        }
        for(int i=0;i<s.length();i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<list.size();j++){
                int x = Math.abs(i-list.get(j));
                if(x < min)
                    min = x;
            }
            res[i] = min;
            
        }
        return res;
        
    }
}