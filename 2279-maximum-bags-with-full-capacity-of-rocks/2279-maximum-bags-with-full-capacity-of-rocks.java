class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int res  = 0, sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<capacity.length ;i++)
            list.add(capacity[i] - rocks[i]);
        Collections.sort(list);
        for(int i: list){
            sum += i;
            if(sum >additionalRocks)
                return res;
            res++;
        }
        return res;
    }
}