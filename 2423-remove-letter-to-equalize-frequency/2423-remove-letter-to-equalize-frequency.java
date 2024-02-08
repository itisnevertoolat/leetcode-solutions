class Solution {
    public boolean equalFrequency(String word) {
  
        Map<Character,Integer> map=new HashMap<>();
        for(char ch: word.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            char key=entry.getKey();
            int value=entry.getValue();
            map.put(key,value-1);
            Set<Integer> set = new HashSet<>(map.values());
            set.remove(0);
            if(set.size()==1) return true;

            map.put(key,value);
            
        }
        return false;
    }
}