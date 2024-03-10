class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int size = 0;
        for(int i: apple)
            size += i;
        Arrays.sort(capacity);
        int count = 0;
        for(int i=capacity.length - 1;i>=0; i--){
            size -= capacity[i];
            count++;
            if(size <= 0)
                return count;
        }
        return count;
    }
}