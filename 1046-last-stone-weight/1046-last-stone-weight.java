class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1){
            return stones[0];
            }
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0;i<stones.length;i++){
        queue.add(stones[i]);
    }
    while(queue.size() > 1){
        int fStone = queue.poll();
        int lStone = queue.poll();
        if(fStone == lStone){
            continue;
        }else{
            fStone = fStone - lStone;
            queue.add(fStone);
    }
    }
    if(queue.size() == 0){
        return 0;
    }
    return queue.poll();
}

}