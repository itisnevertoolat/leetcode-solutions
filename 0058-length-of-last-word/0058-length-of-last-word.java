class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.replaceAll("\\s+", " ").strip().split(" ");
        return arr[arr.length-1].length();
        
        
    }
}