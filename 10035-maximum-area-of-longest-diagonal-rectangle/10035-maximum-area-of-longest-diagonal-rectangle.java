class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal = 0;
        int maxArea = 0;
        for(int[] i: dimensions){
            int len = i[0], width = i[1], diagonal = (len*len)+(width*width), area = len * width;
            if(diagonal > maxDiagonal){
                maxDiagonal = diagonal;
                maxArea = area;
            }else if(maxDiagonal == diagonal && area > maxArea)
                maxArea = area;
        }
        return maxArea;
    }
}