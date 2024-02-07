class Solution {
    public int numDifferentIntegers(String s) {
        Set<String> set = new HashSet<>();
        String test = s.replaceAll("[\\w&&[^\\d]]", "!");
         for(String st: test.split("!")){
             if(st.equals(""))
                 continue;
             set.add(st.replaceAll("^0*", ""));
         }
        return set.size();
        
    }
}