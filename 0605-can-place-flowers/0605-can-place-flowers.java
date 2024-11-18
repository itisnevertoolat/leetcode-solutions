class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int count = 0;
        for(int i=0;i<flowerbed.length && count < n;i++){
            int num = flowerbed[i];
            if(num == 0){
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1]; 
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                if(prev == 0 && next == 0){
                    count++;
                    flowerbed[i] = 1; 
                }
            }
               
            }
        return count == n;
    }
        
}
