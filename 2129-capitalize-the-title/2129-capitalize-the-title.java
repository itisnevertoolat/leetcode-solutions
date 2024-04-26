class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        for(String s: title.split(" ")){
            if(s.length() < 3)
                sb.append(s.toLowerCase());
            else{
                sb.append((s.charAt(0)+"").toUpperCase());
                sb.append(s.substring(1, s.length()).toLowerCase());
            }
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.length()-1);
    }
}