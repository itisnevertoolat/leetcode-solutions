class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] res = new int[2];
        int x = 1;
        String sX = String.valueOf(x);
        int y = n-1;
        String sY = String.valueOf(y);
        while(sX.contains("0")|| sY.contains("0")){
            x++;
            sX = String.valueOf(x);
            y--;
            sY =  String.valueOf(y);
        }
        return new int[]{x, y};
        
    }
}