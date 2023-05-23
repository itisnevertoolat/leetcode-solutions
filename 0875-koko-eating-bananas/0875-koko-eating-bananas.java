class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0;
        int right=0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        while(left < right){
            int mid = (right + left) >>> 1;
            int hourSpent = 0;
            for(int pile : piles){
                hourSpent += Math.ceil((double) pile / mid);
            }
            if(hourSpent > h){
                left = mid + 1;
            }else{
                right = mid;
            }
            
        }
        return right;
    }
}