class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int prev = 0, count = 1;
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1))
                count++;
            else{
                if(count >= 3)
                    res.add(List.of(prev, i-1));
                prev = i;
                count = 1;
            }
            
        }
        if(count >= 3)
            res.add(List.of(prev, s.length()-1));
        return res;
    }
}