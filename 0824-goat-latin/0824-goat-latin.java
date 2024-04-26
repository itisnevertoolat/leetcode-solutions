class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb  = new StringBuilder();
        String[] arr = sentence.split(" ");
        String vowels = "aeiouAEIOU";
        int count = 1;
        for(String s: arr){
            String temp = s.charAt(0) + "";
            if(vowels.contains(temp)){
                sb.append(s);
                sb.append("ma");
                sb.append("a".repeat(count));
            }else{
                sb.append(s.substring(1, s.length()));
                sb.append(s.charAt(0));
                sb.append("ma");
                sb.append("a".repeat(count));
            }
            count++;
            sb.append(" ");
            
        }
        return sb.toString().substring(0, sb.length()-1);
    }
}