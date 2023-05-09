class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> queue = new PriorityQueue(Collections.reverseOrder());
        String[] res = new String[score.length];
        int track = 1;
        for(int i=0;i<score.length;i++){
            queue.add(score[i]);
        }
        while(!queue.isEmpty()){
            int highest = queue.poll();
            
            for(int i=0;i<score.length;i++){
                if(highest == score[i]){
                    res[i] = String.valueOf(track);
                    break;
                }

            }
            track++;
            
        }
        for(int i=0;i<res.length;i++){
            if(Integer.valueOf(res[i]) == 1) res[i] = "Gold Medal";
            else if(Integer.valueOf(res[i]) == 2) res[i] = "Silver Medal";
            else if(Integer.valueOf(res[i]) == 3) res[i] = "Bronze Medal";

        }
        return res;
    }
}