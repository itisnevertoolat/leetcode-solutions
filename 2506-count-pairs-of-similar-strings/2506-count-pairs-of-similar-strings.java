class Solution {
    public int similarPairs(String[] words) {
        int res = 0;
        for(int i=0;i<words.length;i++){
            Set<Character> set = new HashSet<>();
            for(char c: words[i].toCharArray())
                set.add(c);
            for(int j=i+1;j<words.length;j++){
                Set<Character> set2 = new HashSet<>();
                for(char c: words[j].toCharArray())
                    set2.add(c);
                if(set.equals(set2))
                    res++;
                
        }
        
    }
        return res;
    }
}