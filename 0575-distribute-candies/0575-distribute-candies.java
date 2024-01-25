class Solution {
    public int distributeCandies(int[] candyType) {
        int size = (int) Arrays.stream(candyType).distinct().count();
        int x = candyType.length / 2;
        if(x >= size)
            return size;
        else
            return x;
        
        
    }
}