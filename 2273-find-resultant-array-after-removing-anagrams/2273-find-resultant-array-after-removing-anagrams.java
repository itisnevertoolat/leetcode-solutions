class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        Set<String> set = new HashSet<>();
        char[] st = words[0].toCharArray();
        Arrays.sort(st);
        String prev = new String(st);
        set.add(prev);
        res.add(words[0]);
        for(int i=1;i<words.length;i++){
            st = words[i].toCharArray();
            Arrays.sort(st);
           String curr = new String(st);
            if(!curr.equals(prev))
                res.add(words[i]);
            else if(curr.equals(prev) && !set.contains(curr)){
                res.add(words[i]);
            }
            set.add(curr);
                
                
            prev = curr;
                
        }
        return res;
    }
}