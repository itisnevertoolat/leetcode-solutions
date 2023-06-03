class Solution {
    public List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        char startColumn = s.charAt(0);
        char endColumn = s.charAt(3);
        char startRow = s.charAt(1);
        char endRow = s.charAt(4);
        for(char c=startColumn;c<=endColumn;c++){
            for(char r=startRow;r<=endRow;r++){
                res.add(""+c+r);
            }
        }
        return res;
    }
}