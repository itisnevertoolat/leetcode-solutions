class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for(String s: words){
            for(String t: words){
                if(s.equals(t))
                    continue;
                else if(t.contains(s)){
                    list.add(s);
                    break;
                    
                }
            }
        }
        return list;
    }
}