class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        for(char c: words[0].toCharArray()){
            boolean check = true;
            for(int i=1;i<words.length;i++){
                String s = words[i];
                if(s.contains(c+"")){
                    words[i] = s.replaceFirst(c+"", "");
                    continue;
                }else
                    check = false;
            }
            if(check)
                res.add(c+"");
        }
        return res;
        
    }
}