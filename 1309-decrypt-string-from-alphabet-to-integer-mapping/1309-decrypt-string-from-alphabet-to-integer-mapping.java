class Solution {
    public String freqAlphabets(String s) {
        Map<Integer, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<=25;i++){
            map.put(i+1, (char)('a'  + i));
        }
        for(int i=s.length() - 1 ;i >= 0;i--){
            if(s.charAt(i) == '#'){
                sb.append(map.get(Integer.parseInt(s.charAt(i-2)+""+s.charAt(i-1)+"")));
                i -= 2;
            }else{
                 sb.append(map.get(Integer.parseInt(s.charAt(i)+"")));
            }
        }
        for(int i=sb.length() - 1 ;i >= 0;i--){
            sb2.append(sb.charAt(i));
        }
        return sb2.toString();
    }
}