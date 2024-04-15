class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sumForward =0, sumBackward = 0;
        int left = Math.min(destination, start);
        int right = Math.max(destination, start);
        for(int i = right;i>left;i--)
            sumForward += distance[i-1];
        while(right != left){
            sumBackward += distance[right];
            right = (right + 1) % distance.length;
        }
            
        return Math.min(sumForward, sumBackward);
        
    }
}