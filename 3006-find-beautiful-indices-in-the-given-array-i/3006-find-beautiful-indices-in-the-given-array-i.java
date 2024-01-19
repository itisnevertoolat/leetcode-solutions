class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        for(int i=0;i<=s.length() - a.length();i++){
            if(s.substring(i, (i + a.length())).equals(a))
               listA.add(i);
            
        }
        for(int i=0;i<=s.length() - b.length();i++){
            if(s.substring(i, (i + b.length())).equals(b))
               listB.add(i);
            
        }
        Set<Integer> set = new HashSet<>();
        for(int i: listA){
            for(int j=listB.size() - 1;j >= 0;j--){
                if(Math.abs(i -  listB.get(j)) <= k){
                    res.add(i);
                    set.add(i);
                }if(set.contains(i))
                    break;
                    
            }
            

        }

        return res;
    }
}