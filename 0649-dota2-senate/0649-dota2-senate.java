class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiantQueue = new LinkedList<>();
        Queue<Integer> direQueue = new LinkedList<>();
        int len = senate.length();
        for(int i = 0;i < len;i++){
            if(senate.charAt(i) == 'R'){
                radiantQueue.add(i);
            }else{
                direQueue.add(i);
            }
                
        }
        while(!radiantQueue.isEmpty() && !direQueue.isEmpty()){
            int radiantIndex = radiantQueue.poll();
            int dirIndex = direQueue.poll();
            if(radiantIndex < dirIndex){
                radiantQueue.add(radiantIndex + len);
            }
            else direQueue.add(dirIndex + len);
        }
        return radiantQueue.size() > direQueue.size() ? "Radiant" : "Dire";
    }
}