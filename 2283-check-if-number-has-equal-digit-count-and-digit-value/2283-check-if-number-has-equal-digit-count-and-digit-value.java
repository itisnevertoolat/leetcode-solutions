class Solution {
    public boolean digitCount(String num) {
        Map<Integer, Integer> map2 = new HashMap<>();
        int idx = num.length()-1;
        for(int i=0;i<num.length();i++){
            int ch = (num.charAt(i)-'0');
            map2.put(ch, map2.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<num.length();i++){
            int ch = (num.charAt(i)-'0');
            if(ch != map2.getOrDefault(i,0)){
                return false;
            }
        }
        return true;
    }
}