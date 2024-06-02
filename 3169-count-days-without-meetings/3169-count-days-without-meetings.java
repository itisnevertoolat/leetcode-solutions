class Solution {
    public int countDays(int days, int[][] meetings) {
        Set<Integer> set = new HashSet<>();
        List<Integer> end = new ArrayList<>();
        List<Integer> start = new ArrayList<>();
        int res = 0;
        for(int[] arr: meetings){
            start.add(arr[0]);
            end.add(arr[1]);
        }
        Collections.sort(start);
        Collections.sort(end);
        for(int i=0;i<start.size()-1;i++){
            int diff = start.get(i+1) - (end.get(i) + 1); 
            if(diff > 0)
                res += diff;
        }
        res += days - end.get(end.size()-1) ;
        res += start.get(0) - 1;
     return res;   
    }
}