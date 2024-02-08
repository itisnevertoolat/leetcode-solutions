class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character, List<Integer>> map = new HashMap<>();
        Set<Character> setChars = new HashSet<>();
        Set<String> setWords = new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            setChars.add(c);
            map.computeIfAbsent(c, k -> new ArrayList<>()).add(i);
        }
        String[] arr = s.split(" ");
        for(String word: arr)
            setWords.add(word);
        if(setWords.size() != setChars.size() || pattern.length() != arr.length)
            return false;
        for(Map.Entry<Character, List<Integer>> entry: map.entrySet()){
            String test = arr[entry.getValue().get(0)];
            for(int i=1;i<entry.getValue().size();i++){
                if(!arr[entry.getValue().get(i)].equals(test))
                    return false;
            }
        }
        return true;
    }
}