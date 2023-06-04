class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] arr2 = new String[arr.length];
        StringBuilder res = new StringBuilder();
        for(String st: arr){
            int x = Character.getNumericValue(st.charAt(st.length()-1));
            arr2[x-1] = st.substring(0, st.length()-1);
        }
        for(String st2: arr2){
            res.append(st2+" ");
        }
        return res.toString().trim();
        
    }
}