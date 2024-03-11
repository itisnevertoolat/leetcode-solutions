class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        Set<Character> set = new HashSet<>();
        char[] arr = new char[s.length()];
        for(int i=0;i<order.length();i++)
            map.put(order.charAt(i), i);
        for(char c: s.toCharArray()){
            int x = map2.getOrDefault(c ,0)+1;
            map2.put(c, x);
        }
            
        int count = 1;
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                arr[map.get(c)] = c;
            }
                
            else
                arr[arr.length - count++] = c;
        }
        String res = new String(arr).replaceAll("\u0000", "");
        StringBuilder sb = new StringBuilder();
        for(char c: res.toCharArray()){
            if(!set.contains(c)){
                sb.append(c);
                sb.append((c+"").repeat(map2.get(c)-1));
            }

            set.add(c);
        }
       
        
        return sb.toString();
    }
}